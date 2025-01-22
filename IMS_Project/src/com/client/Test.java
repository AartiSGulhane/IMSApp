package com.client;

import java.util.Scanner;

import serviceimpl.Karvenagar;

public class Test {

	public static void main(String[] args) {
		Karvenagar k= new Karvenagar();
		Scanner sc= new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter your choice:");
			
		System.out.println("1.Add Course");
		System.out.println("2.View Course");
		System.out.println("3.Add Faculty");
		System.out.println("4.View Faculty");
		System.out.println("5.Add Batch");
		System.out.println("6.View Batch");
		System.out.println("7.Add Student");
		System.out.println("8.View Student");
		System.out.println("9.Exit");
		
		int ch= sc.nextInt();
		
		if(ch==1)
		{
			k.addCourse();
		}else if(ch==2)
		{
			k.viewCourse();
		}else if(ch==3)
		{
			k.addFaculty();
		}else if(ch==4)
		{
			k.viewFaculty();
		}else if(ch==5)
		{
			k.addBatch();
		}else if(ch==6)
		{
			k.viewBatch();
		}else if(ch==7)
		{
			k.addStudent();
		}else if(ch==8)
		{
			k.viewStudent();
		}else if(ch==9)
		{
			System.exit(0);
		}else
		{
			System.out.println("Invalid input");
		}

		
	}
	}
}



