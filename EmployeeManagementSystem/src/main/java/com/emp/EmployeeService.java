package com.emp;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
   
	    HashSet<Employee> set= new HashSet();
	    
	    Employee e1=new Employee(1,"Khushboo",21,"Java Developer","IT",45000);
	    Employee e2=new Employee(2,"Aman Jha",28,"React Developer","IT",35000);
	    Employee e3=new Employee(3,"Seema Dutta",24,"Tester","CO",55000);
	    Employee e4=new Employee(4,"Kajal Sinha",22,"QA","Admin",49000);
	    Employee e5=new Employee(5,"Jai Shree",25,"Software Eng","CO",34000);
	    Employee e6=new Employee(6,"Ramesh",26,"DevOps Eng","IT",25000);
	    
	    
	    Scanner sc=new Scanner(System.in);
		boolean found=false;
		int id;
		String name;
		int age;
		String department;
		String designation;
		double sal;
		
		
		public EmployeeService() {
			 set.add(e1);
			 set.add(e2);
			 set.add(e3);
			 set.add(e4);
			 set.add(e5);
			 set.add(e6);
		}
		
		
		public void viewAllEmployees() {
			for(Employee e: set) {
				System.out.println(e);
			}
		}
		
		
		public void viewEmployeeById() {
			
			System.out.println("Enter Id: ");
			id=sc.nextInt();
			
			for(Employee e: set) {
				if(e.getId()==id) {
					System.out.println(e);
					found=true;
				}
			}
			
			if(!found) System.out.println("Employee not found with this id: "+id);
		}
		
		public void updateEmployeeById() {
			System.out.println("Enter id: ");
			id=sc.nextInt();
			
			for(Employee e : set) {
				if(e.getId()== id) {
					System.out.println("Enter New Name: ");
					name=sc.next();
					System.out.println("Enter New Salary: ");
					sal=sc.nextDouble();
					
					e.setName(name);
					e.setSalary(sal);
					
					System.out.println("Updated details of employee here.");
					System.out.println(e);
					found=true;
				}
			}
			if(!found) System.out.println("Employee not found with this id: "+id);
			else System.out.println("Details updated successfully.");
		}
		
		public void addEmp() {
			System.out.println("Enter id:");
			id=sc.nextInt();
			System.out.println("Enter name");
			name=sc.next();
			System.out.println("Enter age");
			age=sc.nextInt();
			System.out.println("enter Designation");
			designation=sc.next();
			System.out.println("Enter Department");
			department=sc.next();
			System.out.println("Enter sal");
			sal=sc.nextDouble();
			
			Employee emp=new Employee(id, name, age, designation, department, sal);
			
			set.add(emp);
			System.out.println(emp);
			System.out.println("Employee added successsfully.");
			
		}
		
		public void deleteEmp() {
			System.out.println("Enter id");
			id=sc.nextInt();
			boolean found=false;
			Employee emp=null;
			for(Employee e : set) {
				if(e.getId()==id) {
					emp=e;
					found=true;
				}
			}
			if(!found) {
				System.out.println("Employee is not present");
			}
			else {
				set.remove(emp);
				System.out.println("Employee deleted successfully!!");
			}
		}
   
}
