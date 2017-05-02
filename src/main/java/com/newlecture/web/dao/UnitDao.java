package com.newlecture.web.dao;

import java.util.List;

import com.newlecture.web.entity.Chapter;
import com.newlecture.web.entity.Unit;



public interface UnitDao {
	
	List<Unit> getListOfLecture(String chapterId);
	
	
}
