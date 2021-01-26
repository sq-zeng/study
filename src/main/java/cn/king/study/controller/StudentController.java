package cn.king.study.controller;

import cn.king.study.common.Result;
import cn.king.study.common.ResultEnum;
import cn.king.study.entity.Student;
import cn.king.study.exception.DefinedException;
import cn.king.study.mapper.StudentMapper;
import cn.king.study.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @Description: 学生请求相关类
 * @Auther: zsq
 * @Date: 2021/1/26 16:07
 */
@RestController
@RequestMapping("student")

public class StudentController {

    @Autowired
    StudentMapper studentMapper;

    @GetMapping("/getAll")
    public Result selectAllStudent(){
        List<Student> students = studentMapper.selectAllStudent();
        return ResultUtil.success(students);
    }

    @GetMapping("/{id}")
    public Result selectAllStudent(@PathVariable("id")Integer id){
        Student student = studentMapper.selectStudentById(id);
        return ResultUtil.success(student);
    }

    @PostMapping("")
    public Result addStudent( @RequestBody @Valid Student student, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new DefinedException(ResultEnum.PRIMARY_SCHOOL);
        }
        int code = studentMapper.insertStudent(student);
        if(code==1){
            return ResultUtil.success();
        }else{
            return ResultUtil.error(ResultEnum.UNKONW_ERROR);
        }

    }

}
