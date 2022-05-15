package com.indiabix.oops;

public class Student1 {
	int id; String name;
		//Parameterized Constructor
		Student1(int i, String n  )
	{
		id = i;
		name = n;
	}
		void display() 
		{
		System.out.println(id + " " + name);
		}

	public static void main(String[] args) {
		Student1 s1=new Student1(21,"Amshu");
		Student1 s2=new Student1(22,"Madhu");
		Student1 s3=new Student1(23,"Yuvraj");
		s1.display();
		s2.display();
		s3.display();
		
	}
	
	}