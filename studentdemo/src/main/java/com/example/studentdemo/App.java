package com.example.studentdemo;

import java.util.List;
import java.util.Scanner;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        StudentDAO dao=new StudentDAO();
        while(true) {
        	System.out.println("\n====Product menu====");
        	System.out.println("1.Insert");
        	System.out.println("2.Find Product By id");
        	System.out.println("3.Find All Poducts");
        	System.out.println("4.Update Product");
        	System.out.println("5.Delete Product");
        	System.out.println("6.Exit");
        	System.out.println("Enter choice:");
        	int choice=sc.nextInt();
        	switch(choice) {
        	 case 1:
                 Student s1 = new Student();

                 System.out.print("Enter Student Id: ");
                 s1.setId(sc.nextInt());

                 sc.nextLine();

                 System.out.print("Enter Student Name: ");
                 s1.setName(sc.nextLine());

                 System.out.print("Enter Student Email: ");
                 s1.setEmail(sc.nextLine());
                 
                 System.out.print("Enter Student course: ");
                 s1.setCourse(sc.nextLine());
                 
                 System.out.print("Enter Student age: ");
                 s1.setAge(sc.nextInt());

                 dao.insert(s1);
                 System.out.println("Student Inserted Successfully");
                 break;

             case 2:
                 System.out.print("Enter Student Id: ");
                 int id = sc.nextInt();

                 Student stu = dao.findById(id);

                 if (stu != null) {
                     System.out.println(stu);
                 } else {
                     System.out.println("student Not Found");
                 }
                 break;

             case 3:
                 List<Student> stu1 = dao.findAll();

                 for (Student p : stu1) {
                     System.out.println(p);
                 }
                 break;

             case 4:
                 Student s2 = new Student();

                 System.out.print("Enter Student Id: ");
                 s2.setId(sc.nextInt());

                 sc.nextLine();

                 System.out.print("Enter Student Name: ");
                 s2.setName(sc.nextLine());

                 System.out.print("Enter Student Email: ");
                 s2.setEmail(sc.nextLine());
                 
                 System.out.print("Enter Student course: ");
                 s2.setCourse(sc.nextLine());
                 
                 System.out.print("Enter Student age: ");
                 s2.setAge(sc.nextInt());

                 sc.nextLine();

                 dao.update(s2);
                 System.out.println("Student Updated Successfully");
                 break;

             case 5:
                 System.out.print("Enter Student Id: ");
                 int deleteId = sc.nextInt();

                 dao.delete(deleteId);
                 System.out.println("Student Deleted Successfully");
                 break;

             case 6:
                 System.out.println("Exiting Application...");
                 sc.close();
                 System.exit(0);
                 break;

             default:
                 System.out.println("Invalid Choice");
        		
        	}
        }
    }
}
