package com.newlecture.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.newlecture.web.dao.LecturePlatformDao;
import com.newlecture.web.entity.LecturePlatform;




public class MyBatisLecturePlatformDao implements LecturePlatformDao{

   @Autowired
   private SqlSession sqlSession;

	@Override
	public List<LecturePlatform> getList() {
		LecturePlatformDao lecturePlatformDao = sqlSession.getMapper(LecturePlatformDao.class);
		return lecturePlatformDao.getList();
	}
	
	@Override
	public LecturePlatform get(String lectureCode, String platformCode) {
		LecturePlatformDao lecturePlatformDao = sqlSession.getMapper(LecturePlatformDao.class);
		return lecturePlatformDao.get(lectureCode, platformCode);
	}
	
	@Override
	public int add(LecturePlatform lecturePlatform) {
		LecturePlatformDao lecturePlatformDao = sqlSession.getMapper(LecturePlatformDao.class);
		return lecturePlatformDao.add(lecturePlatform);
	}
	
	@Override
	public int update(LecturePlatform lecturePlatform) {
		LecturePlatformDao lecturePlatformDao = sqlSession.getMapper(LecturePlatformDao.class);
		return lecturePlatformDao.update(lecturePlatform);
	}
	
	@Override
	public int delete(String lectureCode, String platformCode) {
		LecturePlatformDao lecturePlatformDao = sqlSession.getMapper(LecturePlatformDao.class);
		return lecturePlatformDao.delete(lectureCode, platformCode);
	}
    
  

}