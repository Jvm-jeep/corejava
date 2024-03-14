package com.march14;
import java.util.LinkedList;
import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch=0;
		LinkedList<Employee>a1=new LinkedList<Employee>();
		do {
			System.out.println("Press1. Enter employee Details");
			System.out.println("Press2. Employee Id");
			System.out.println("Press3. Age ");
			System.out.println("Press4. Salary ");
			System.out.println("Press5. Exit");
			System.out.println("Enter Choice");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter Name");
				String name=sc.next();
				System.out.println("Enter EmployeeID");
				int empid=sc.nextInt();
				System.out.println("Enter Age");
				int age=sc.nextInt();
				System.out.println("Enter Salary");
				int salary=sc.nextInt();
				a1.add(new Employee(age, name,empid,salary));
				System.out.println(a1);
				break;
			case 2:
				System.out.println("Details");
				for(int i=0;i<a1.size();i++) {
					System.out.println(a1.get(i));
				}
				break;
			case 3:
				System.out.println("Enter Index number Which you want to change");
				int n=sc.nextInt();
				System.out.println("Enter name which you want to add on index");
				System.out.println("Employee name updated");
				break;
			case 4:
				System.out.println("Exit");
				break;
				default:
					System.out.println("Wrong Input");
					
			
			}
			
		}while(ch!=4);
	
		
	}

}
