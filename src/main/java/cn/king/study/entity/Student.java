package cn.king.study.entity;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @Description: 学生实体
 * @Auther: zsq
 * @Date: 2021/1/26 16:04
 */
@Data
public class Student {

    /**
     * 学生唯一id
     */
    private Integer id;

    /**
     * 学生姓名
     */
    @NotNull
    private String name;

    /**
     * 学生年龄
     */
    @Min(1)
    private Integer age;
}
