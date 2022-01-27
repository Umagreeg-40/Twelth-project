package com.javaOops;

public class Learner 
{
	int id;
	String name, add, city;
	
	public Learner()
	{
		id = 1345879;
		name = "LMN";
		add = "Gandhi nagar";
		city = "Goa";
	}
	
	
	public Learner(int id, String name, String add, String city) 
	{
		super();
		this.id = id;
		this.name = name;
		this.add = add;
		this.city = city;
	}

	public void getData()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+add);
		System.out.println("City: "+city);
	}

	public static void main(String[] args)
	{
		Learner s1 = new Learner();
		Learner s2 = new Learner(2345676,"PQR","Nehru nagar","Nilgiri");
		
		s1.getData();
		System.out.println("=======================");
		s2.getData();

	}

}
