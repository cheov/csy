package com.csy.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class LinkMapper {
	private final static String RESOURCE = "SqlMapperConfig.xml";
	
	public static SqlSession getLinkMapper() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream(RESOURCE);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		return session;
	}
}
