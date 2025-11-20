package com.Student;

import java.util.List;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        StudentOperationImplementation ops = new StudentOperationImplementation();

        while (true) {

            System.out.println("----------------------------------");
            System.out.println("1. Add Student");
            System.out.println("2. Find Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Exit");
            System.out.print("Enter Choice : ");

            String input = scan.nextLine();

            // Check if input is numeric (NO try/catch)
            boolean isNumeric = input.matches("\\d+");

            if (!isNumeric) {
                System.out.println("---------- Please enter a valid NUMBER ------------");
                continue; // go back to menu
            }

            int choice = Integer.parseInt(input);

            switch (choice) {

                case 1: {
                    // ADD STUDENT IMPLEMENTED BY AJAY
                    System.out.print("Enter Id: ");
                    int id = Integer.parseInt(scan.nextLine());

                    System.out.print("Enter Name: ");
                    String name = scan.nextLine();

                    System.out.print("Enter Branch: ");
                    String branch = scan.nextLine();

                    System.out.print("Enter Fees: ");
                    int fee = Integer.parseInt(scan.nextLine());

                    Student s = new Student(id, name, branch, fee);
                    System.out.println(ops.addStudent(s));
                }
                break;

                case 2: {
                    // FIND STUDENT IMPLEMENTED BY AJAY
                    System.out.print("Enter Id: ");
                    int id = Integer.parseInt(scan.nextLine());

                    Student stu = ops.findStudent(id);

                    if (stu != null) {
                        System.out.println("Student Found: " + stu);
                    } else {
                        System.out.println("---------- Student Not Found ----------");
                    }
                }
                break;

                case 3: {
                  //  UPDATE STUDENT IMPLEMENTED BY GANGAPRASAD
                	System.out.print("Enter Id to Update: ");
                    int id = Integer.parseInt(scan.nextLine());

                    Student old = ops.findStudent(id);

                    if (old == null) {
                        System.out.println("---------- Student Not Found ----------");
                    } else {
                        System.out.print("Enter New Name: ");
                        String name = scan.nextLine();

                        System.out.print("Enter New Branch: ");
                        String branch = scan.nextLine();

                        System.out.print("Enter New Fees: ");
                        int fees = Integer.parseInt(scan.nextLine());

                        Student updated = new Student(id, name, branch, fees);
                        boolean status = ops.updateStudent(updated);

                        if (status)
                            System.out.println("Student Updated Successfully");
                        else
                            System.out.println("Failed to Update");
                    }

                }
                break;

                case 4: {
                    //  DELETE STUDENT IMPLEMENTED BY GANGAPRASAD
                    System.out.print("Enter Id to Delete: ");
                    int id = Integer.parseInt(scan.nextLine());

                    boolean deleted = ops.deleteStudent(id);

                    if (deleted)
                        System.out.println("Student Deleted Successfully");
                    else
                        System.out.println("---------- Student Not Found ----------");
                
                }
                break;

                case 5: {
                    //  DISPLAY ALL  STUDENT IMPLEMENTED BY MANITEJA
                }
                break;

                case 6: {
                	// EXIT FROM THE LOOP STUDENT IMPLEMENTED BY MANITEJA
                }
                break;

                default: {
                    System.out.println("Invalid Choice! Try Again.");
                }
            }
        }
    }
}
