package com.icterguru.service;

import java.util.List;

import com.icterguru.entity.Teacher;
import com.icterguru.error.TeacherNotFoundException;

public interface TeacherService {

	List<Teacher> getAllTeachers();

	Teacher getTeacherById(Integer id) throws TeacherNotFoundException;
	
	Teacher saveTeacher(Teacher teacher);
	
	Teacher updateTeacher(Teacher teacher);
	
	public void deleteTeacherById(Integer id) throws TeacherNotFoundException;
	
}
