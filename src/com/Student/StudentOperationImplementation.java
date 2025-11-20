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
		for (Student stu : list) {
            if (stu.getId() == id) {
                list.remove(stu);
                return true;
            }
        }
        return false;
	}

	@Override
	public boolean updateStudent(Student s) {
		 for (int i = 0; i < list.size(); i++) {
	            Student existing = list.get(i);

	            if (existing.getId() == s.getId()) {
	                existing.setName(s.getName());
	                existing.setBranch(s.getBranch());
	                existing.setFee(s.getFee());
	                return true;
	            }
	        }
	        return false;
	        
	}

	@Override
	public List<Student> getAllStudent() {
		
		  return list; 
	}

}
