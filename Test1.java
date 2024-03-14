package com.march14;

import java.util.LinkedList;

public class Test1 {

	public static void main(String[] args) {
		LinkedList<String>l1=new LinkedList<String>();
		
		l1.add("Ramesh");
		l1.add("Suresh");
		l1.add("Ramesh");
		l1.add("Ajay");
		l1.add("Amith");
		
		System.out.println(l1);
		LinkedList<String>l2=new LinkedList<String>();
		l2.add("amisha");
		l2.add("Aasha");
		l2.add("sumit");
		l1.addAll(l2);
		System.out.println(l1);
		
		l1.addFirst("kedar");
		System.out.println(l1);
		l1.addLast("archana");
		System.out.println(l1);
		
		
		
		

	}

}
