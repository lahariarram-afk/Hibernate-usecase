package com.example.employeedemo;

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
        EmployeeDAO dao=new EmployeeDAO();
        while(true) {
        	System.out.println("\n====Employee details====");
        	System.out.println("1.Insert");
        	System.out.println("2.Find Employee By id");
        	System.out.println("3.Find All Employees");
        	System.out.println("4.Update Employee");
        	System.out.println("5.Delete Employee");
        	System.out.println("6.Exit");
        	System.out.println("Enter choice:");
        	int choice=sc.nextInt();
        	switch(choice) {
        	 case 1:
                 Employee e1 = new Employee();

                 System.out.print("Enter employee Id: ");
                 e1.setId(sc.nextInt());

                 sc.nextLine();

                 System.out.print("Enter employeee Name: ");
                 e1.setName(sc.nextLine());

                 System.out.print("Enter employee department");
                 e1.setDept(sc.nextLine());
                 
                 System.out.print("Enter employee salary");
                 e1.setSal(sc.nextInt());
                 
                 sc.nextLine();
                 
                 System.out.print("Enter employee joining date");
                 e1.setJoiningdate(sc.nextLine());
                 
                 dao.insert(e1);
                 System.out.print("Product Inserted Successfully");
                 break;

             case 2:
                 System.out.print("Enter Employee Id: ");
                 int id = sc.nextInt();

                 Employee emp = dao.findById(id);

                 if (emp != null) {
                     System.out.println(emp);
                 } else {
                     System.out.println("Employee Not Found");
                 }
                 break;

             case 3:
                 List<Employee> emps = dao.findAll();

                 for (Employee e : emps) {
                     System.out.println(e);
                 }
                 break;

             case 4:
                 Employee e2 = new Employee();

                 System.out.print("Enter employee Id: ");
                 e2.setId(sc.nextInt());

                 sc.nextLine();

                 System.out.print("Enter employeee Name: ");
                 e2.setName(sc.nextLine());

                 System.out.print("Enter employee department");
                 e2.setDept(sc.nextLine());
                 
                 System.out.print("Enter employee salary");
                 e2.setSal(sc.nextInt());
                 
                 sc.nextLine();
                 
                 System.out.print("Enter employee joining date");
                 e2.setJoiningdate(sc.nextLine());
                 
                 System.out.print("Enter employee joining date");
                 e2.setJoiningdate(sc.nextLine());

                 dao.update(e2);
                 System.out.println("Employee Updated Successfully");
                 break;

             case 5:
                 System.out.print("Enter employee Id: ");
                 int deleteId = sc.nextInt();

                 dao.delete(deleteId);
                 System.out.println("Employee Deleted Successfully");
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
