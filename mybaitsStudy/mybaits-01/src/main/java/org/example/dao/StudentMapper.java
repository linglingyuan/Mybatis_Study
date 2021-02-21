package org.example.dao;

import org.example.pojo.Student;
import org.example.pojo.Teacher;

import java.util.List;

public interface StudentMapper {
    ///传入id找到一个老师。里面包含该老师所有的学生，按照查询嵌套处理
    List<Student> getStudent();
    Teacher getTeacher(int id);

    ///传入id找到一个老师。里面包含该老师所有的学生，按照结果嵌套处理
    List<Student> getStudent2();
}
