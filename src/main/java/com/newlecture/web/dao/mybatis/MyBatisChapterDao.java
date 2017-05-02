package com.newlecture.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.newlecture.web.dao.ChapterDao;
import com.newlecture.web.dao.LectureDao;
import com.newlecture.web.entity.Chapter;
import com.newlecture.web.entity.Lecture;
import com.newlecture.web.entity.LectureView;

public class MyBatisChapterDao implements ChapterDao {
   
   @Autowired
   private SqlSession sqlSession;

	@Override
	public List<Chapter> getListOfChapter(String lectureId) {
		
		ChapterDao chapterDao;
		chapterDao = sqlSession.getMapper(ChapterDao.class);
		return chapterDao.getListOfChapter(lectureId);
	}

/*   @Override
   public List<LectureView> getList(int page, String field, String query) {
      LectureDao lectureDao;
      lectureDao = sqlSession.getMapper(LectureDao.class);
      return lectureDao.getList(page, field, query);
   }*/



}