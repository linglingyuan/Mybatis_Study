package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.pojo.Student;
import org.example.pojo.Teacher;

public interface TeacherMapper {
    @Select("select * from mybaits.teacher where id = #{tid}")
    Teacher getTeacher(@Param("tid") int id);

    Teacher getTeacher2(@Param("tid") int id); //传入id找到一个老师。里面包含该老师所有的学生，按照结果嵌套处理

    Teacher getTeacher3(@Param("tid") int id); ////传入id找到一个老师。里面包含该老师所有的学生，按照查询嵌套处理
    Student getStudentByTeacherId(@Param("tid") int id);
}
