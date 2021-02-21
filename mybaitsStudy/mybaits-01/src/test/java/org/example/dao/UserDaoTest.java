package org.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.example.pojo.Student;
import org.example.pojo.Teacher;
import org.example.pojo.User;
import org.example.utils.MybatisUtils;
import org.junit.Test;

import java.awt.geom.Area;
import java.util.HashMap;
import java.util.List;

public class UserDaoTest {
    @Test
    public void getUserList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();
        for (User user : userList){
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        User user = userDao.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        int res = userDao.addUser(new User(4,"亚玲","123456"));
        if (res > 0){
            System.out.println("插入成功！");
        }
        //记得提交事务
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        userDao.updateUser(new User(4,"修改的名字","123456"));
        sqlSession.commit();
    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        userDao.deleteUser(4);
        sqlSession.commit();
    }
    @Test
    public void getUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        map.put("startIndex",0);
        map.put("pageSize",2);
        List<User> userList = userDao.getUserByLimit(map);
        for (User user : userList){
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void getStudent2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student= studentMapper.getStudent2();
        for (Student student1 : student){
            System.out.println(student1);
        }
        sqlSession.close();
    }
    @Test
    public void getStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student= studentMapper.getStudent();
        for (Student student1 : student){
            System.out.println(student1);
        }
        sqlSession.close();
    }
    @Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = teacherMapper.getTeacher(1);
        System.out.println(teacher);
//        for (Student student : teacher.getStudentList()){
//            System.out.println(student);
//        }
        sqlSession.close();
    }
    @Test
    public void getTeacher2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = teacherMapper.getTeacher2(1);
        System.out.println(teacher);
//        for (Student student : teacher.getStudentList()){
//            System.out.println(student);
//        }
        sqlSession.close();
    }
    @Test
    public void getTeacher3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = teacherMapper.getTeacher3(1);
        System.out.println(teacher);
//        for (Student student : teacher.getStudentList()){
//            System.out.println(student);
//        }
        sqlSession.close();
    }
}
