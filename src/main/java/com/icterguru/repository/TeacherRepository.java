package com.icterguru.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icterguru.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>{
	
public Long countById(Integer id);
}
