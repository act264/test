package jb.school.building;

import jb.school.people.Student;
import jb.school.people.Teacher;

public class ClassRoom {

	private String className;
	private Student[] students;
	private Teacher teacher;
	
	public ClassRoom(String className, Teacher teacher, Student[] students) {
		this.className = className;
		this.teacher = teacher;
		this.students = students;
	}
}
