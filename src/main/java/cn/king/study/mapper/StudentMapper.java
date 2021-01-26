package cn.king.study.mapper;

import cn.king.study.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @Auther: zsq
 * @Date: 2021/1/26 16:04
 */
@Mapper
@Repository
public interface StudentMapper {

    List<Student> selectAllStudent();

    Student selectStudentById(Integer id);

    int insertStudent(Student student);
}
