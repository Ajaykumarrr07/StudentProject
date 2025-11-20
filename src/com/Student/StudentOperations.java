package com.Student;

import java.util.List;

public interface StudentOperations {
    String addStudent(Student s);
    Student findStudent(int id);
    boolean updateStudent(Student s);
    boolean deleteStudent(int id);
    List<Student> getAllStudent();
}
