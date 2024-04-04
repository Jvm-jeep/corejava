package com.march18;
import java.util.Scanner;

public class Assesment {
 static void pattern(int num)
 {
	 for(int i=1;i<=num;i++)
	 {
		 for(int k=i+1;k<=i;k++)
		 {
			 System.out.println(" ");
			 
		 }
		 for(int j=1;j<=i;j++)
		 {
			 System.out.println(i+" ");
		 }
		 System.out.println();
	 }
 }
	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows For First Pattern:");
		num1=sc.nextInt();
		System.out.println("Enter Rows For Second Pattern:");
		num2=sc.nextInt();
		System.out.println("Enter Rows For Third Pattern");
		num3=sc.nextInt();
		
		pattern(num1);
		pattern(num2);
		pattern(num3);
		

	}

}
