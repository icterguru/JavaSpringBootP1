package com.icterguru.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.icterguru.entity.Teacher;
import com.icterguru.error.TeacherNotFoundException;
import com.icterguru.service.TeacherService;

@Controller
public class TeacherController {

	@Autowired(required = true)
	private TeacherService teacherService;

	public TeacherController(TeacherService teacherService) {
		super();
		this.teacherService = teacherService;
	}

	// Teacher Handlers handle the list of students and returns model and view

	/*
	 * @GetMapping("/teachers") public String getTeachers(Model model) {
	 * model.addAttribute("teachers", teacherService.getAllTeachers());
	 * 
	 * return "teachers"; // returns to the the teachers.html file
	 * 
	 * }
	 */
	
	@GetMapping(path = "/teachers")
	public String retunrTeachers(Model model) {
		List<Teacher> teacherList = teacherService.getAllTeachers();
		model.addAttribute("teachers", teacherList);
		return "teachers"; // returns to the the teachers.html file

	}


	@GetMapping(path = "/teachers/addnew")
	public String openAddNewTeacherForm(Model model) {

		// This teachers bean will hold data from the Entry Form
		Teacher teacher = new Teacher();
		model.addAttribute("teachers", teacher);
		model.addAttribute("pageTitle", "Enter New Teacher");
		// returns to the the teacher_addnew.html file
		return "teacher_addnew";
	}

	@PostMapping(path = "/teachers")
	public String saveTeacher(@ModelAttribute("teacher") Teacher teacher, RedirectAttributes redirectAttributes) {

		teacherService.saveTeacher(teacher);
		redirectAttributes.addFlashAttribute("message", "The record has been saved successfully");
		return "redirect:/teachers";
		// Will redirect the getTeachers()
	}

	@GetMapping(path = "/teachers/update/{id}")
	public String openUpdateTeacherForm(@PathVariable("id") Integer id, Model model,
			RedirectAttributes redirectAttributes) {
		try {
			Teacher teacher = teacherService.getTeacherById(id);
			model.addAttribute("teacher", teacher);
			model.addAttribute("pageTitle", "Update record with id: " + id);
			return "teacher_update";
			// returns to the the teacher_update.html file
		} catch (TeacherNotFoundException e) {
			redirectAttributes.addFlashAttribute("message", "The record has been saved successfully");
			return "redirect:/teachers";
			//	returns to the the teachers.html file

		}

	}

	@PostMapping(path = "/teachers/{id}")
	public String updateTeacherRecord(@PathVariable("id") Integer id, Model model,
			@ModelAttribute("teacher") Teacher teacher, RedirectAttributes redirectAttributes) {
		// First get the teacher record from the database
		Teacher updatesTeacher;
		try {
			updatesTeacher = teacherService.getTeacherById(id);
			updatesTeacher.setId(id);

			updatesTeacher.setLastName(teacher.getLastName());
			updatesTeacher.setFirstName(teacher.getFirstName());
			updatesTeacher.setEmail(teacher.getEmail());
			updatesTeacher.setPhone(teacher.getPhone());
			updatesTeacher.setDepartment(teacher.getDepartment());
			updatesTeacher.setDesignation(teacher.getDesignation());
			updatesTeacher.setNotes(teacher.getNotes());
			
		} catch (TeacherNotFoundException e) {
			redirectAttributes.addFlashAttribute("message", "The record with id: " + id + " is NOT updated");
		}
		
		teacherService.updateTeacher(teacher);
		redirectAttributes.addFlashAttribute("message", "The record with id: " + id + " has been updated successfully");
		
		return "redirect:/teachers";
	}

	// Delete a record handler by id


	@GetMapping(path = "/teachers/delete/{id}")
	public String deleteTeacherById(@PathVariable("id") Integer id, RedirectAttributes redirectAttributes) {
		try {
			teacherService.deleteTeacherById(id);
			redirectAttributes.addFlashAttribute("message", "The record with id: " + id + " has been deleted");
		} catch (TeacherNotFoundException e) {
			redirectAttributes.addFlashAttribute("message", e.getMessage());
		}
		return "redirect:/teachers";
		// returns to the the teachers.html file
		
	}

}
