package com.newlecture.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.newlecture.web.dao.ChapterDao;
import com.newlecture.web.dao.LectureDao;
import com.newlecture.web.dao.UnitDao;
import com.newlecture.web.entity.Chapter;
import com.newlecture.web.entity.Lecture;
import com.newlecture.web.entity.LectureView;
import com.newlecture.web.entity.Unit;

public class MyBatisUnitDao implements UnitDao {
   
   @Autowired
   private SqlSession sqlSession;

	@Override
	public List<Unit> getListOfLecture(String chapterId) {
		
		UnitDao unitDao;
		unitDao = sqlSession.getMapper(UnitDao.class);
		return unitDao.getListOfLecture(chapterId);
	}

/*   @Override
   public List<LectureView> getList(int page, String field, String query) {
      LectureDao lectureDao;
      lectureDao = sqlSession.getMapper(LectureDao.class);
      return lectureDao.getList(page, field, query);
   }*/



}