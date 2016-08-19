package com.mybatis.demo.demo1;

import java.io.IOException;
import java.io.InputStream;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {

	@org.junit.Test
	public void TestXmlFun() {
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		SqlSessionFactory sqlSessionFactory;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Students student = sqlSession.selectOne("com.mybatis.demo.demo1.StudentsMapper.findStudents", 1);
			System.out.println(student.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
//	@org.junit.Test
//	public void TestMapperFun(){
//		String resource = "mybatis-config.xml";
//		InputStream inputStream;
//		SqlSessionFactory sqlSessionFactory;
//		try {
//			inputStream = Resources.getResourceAsStream(resource);
//			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//			SqlSession sqlSession = sqlSessionFactory.openSession();
//			StudentsMapper mapper = sqlSession.getMapper(StudentsMapper.class);
//			Students student = mapper.findStudents(1);
//			System.out.println("iid==="+student.getIid());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
