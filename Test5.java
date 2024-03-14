package com.march14;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Test5 {

	public static void main(String[] args) {
LinkedHashSet<String>h2=new LinkedHashSet<String>();
     h2.add("Red");
     h2.add("black");
     h2.add("Red");
     h2.add("Brown");
     h2.add("White");
     System.out.println(h2);
     TreeSet<String>h3=new TreeSet<String>();
     h3.add("Red");
     h3.add("black");
     h3.add("Red");
     h3.add("Brown");
     h3.add("White");
     System.out.println(h3);
	}

}
