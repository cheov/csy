package com.csy.Test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.csy.mapper.Impl.UserMapper;
import com.csy.pojo.User;
import com.csy.utils.LinkMapper;
public class UserTest {
	public static void main(String[] args) throws IOException {
		//插入 并返回主键id
		
		UserTest test=new UserTest();
		User user=new User();
	
		test.selectStudentByNameTwo(user);
		user.setId(1);
//		Student student=new Student(null,"陈","18","0004",DateUtil.strToDate("2018-08-13"));
//		int id = studentTest.insertStudent(student);
//		if (id==0) {
//			System.out.println(id);
//		}else {
//			System.out.println("插入成功"+id);
//			studentTest.select(id);
		}
		


	public  void selectStudentByNameTwo(User user) throws IOException {
		SqlSession session = LinkMapper.getLinkMapper();
		UserMapper mapper = session.getMapper(UserMapper.class);
//		Student student=new Student();
//		student.setStudentId(1);
		//student.setStudentName("c");
		List<User> users = mapper.selectUserByNameTwo(user);
		System.out.println(users);
		session.close();
	}


}
