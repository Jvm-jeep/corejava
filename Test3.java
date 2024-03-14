package com.march14;
import java.util.LinkedList;
import java.util.Scanner;


public class Test3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch=0;
		LinkedList<Employee>l1=new LinkedList<Employee>();
		do {
			System.out.println("LinkedList implementation");
			System.out.println("Press 1:add data int list");
			System.out.println("press 2. Display list");
			System.out.println(" press 3. Update list");
			System.out.println("press 4. Delete list");
			System.out.println("press 5. Exit");
			System.out.println("Enter Choice ");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the Employee Id");
				int empid=sc.nextInt();
				System.out.println("Enter");
			}
		}
		
	}

}
