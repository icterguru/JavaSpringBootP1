package com.icterguru.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.icterguru.entity.Teacher;
import com.icterguru.error.TeacherNotFoundException;
import com.icterguru.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService {

	private TeacherRepository teacherRepository;

	public TeacherServiceImpl(TeacherRepository teacherRepository) {
		super();
		this.teacherRepository = teacherRepository;
	}

	@Override
	public List<Teacher> getAllTeachers() {
		return teacherRepository.findAll();

	}

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);

	}

	@Override
	public Teacher getTeacherById(Integer id) throws TeacherNotFoundException {
		Optional<Teacher> foundTeacher = teacherRepository.findById(id);
		if (foundTeacher.isPresent())
			return foundTeacher.get();
		// .get() is required as findById(id) return is Optional
		else
			throw new TeacherNotFoundException("Not found any record with id :" + id);
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	@Override
	public void deleteTeacherById(Integer id) throws TeacherNotFoundException {
		Long count = teacherRepository.countById(id);
		if (count <= 0 || count == null)
			throw new TeacherNotFoundException("Not found any record with id :" + id);

		teacherRepository.deleteById(id);
	}

}
