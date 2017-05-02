package com.newlecture.web.dao;

import java.util.List;

import com.newlecture.web.entity.Chapter;



public interface ChapterDao {
	
	List<Chapter> getListOfChapter(String lectureId);
	
	
}
