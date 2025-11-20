package com.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentOperationImplementation implements StudentOperations{
     List<Student> list=new ArrayList<>();
	@Override
	public Student findStudent(int id) {
		for(Student stu:list) {
			if(stu.getId()==id) {
				return stu;
			}
		}
		return null;
	}
	
	
	
	
	

	@Override
	public String addStudent(Student s) {
		for(Student stu:list) {
			if(stu.getId()==s.getId())
			{
				return  "Student Alredy Exisit";
			}
		}
		list.add(s);
		return "Student added Successfully";
	}
	
	
	
	

	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateStudent(Student s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
