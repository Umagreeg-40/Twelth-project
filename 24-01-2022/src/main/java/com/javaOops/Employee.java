package com.javaOops;

public class Employee
{
		int id;
		String name;
		double sal;
		
		//default or zero-parameterized constructor
		public Employee()
		{
			id = 1345879;
			name = "STU";
			sal = 55986.89;
		}
		
		
		//parameterized constructor
		public Employee(int id, String name, double sal) 
		{
			super();
			this.id = id;
			this.name = name;
			this.sal = sal;
		}

		public void getDetails()
		{
			System.out.println("ID: "+id);
			System.out.println("Name: "+name);
			System.out.println("Salary: "+sal);
		}

		public static void main(String[] args)
		{
			Employee e1 = new Employee();
			Employee e2 = new Employee(2345676,"ABC",85437.54);
			
			e1.getDetails();
			System.out.println("--------------------------s");
			e2.getDetails();
		}

	}
