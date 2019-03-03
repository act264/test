package jb.school.people;

import jb.school.other.Grade;

public class Student extends Person {

	private Grade[] grades;
	
	public Student(String name, int yearOfBirth) {
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		grades = new Grade[10];
	}
}
