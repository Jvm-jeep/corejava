package com.march15;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {

	public static void main(String[] args) {
	 ArrayList<Movie>List=new ArrayList<Movie>();
	 ArrayList<Product>List1=new ArrayList<Product>();
	//public Movie(double rating, String name, int year)
	 
	 List.add(new Movie(8.3,"rrrr",2015));
	 List.add(new Movie(3.4, "jawan",2023));
	 List.add(new Movie(7.2, "DDLJ",2002));
	 List.add(new Movie(5.6, "3 idiots",2008));
	 List.add(new Movie(8.3, "Pink", 2013));
	 Collections.sort(List);
	 System.out.println("data after Sorting");
	 for(Movie Movie:List) {
		 System.out.println(Movie.getRating()+ " "+Movie.getName()+" "+Movie.getYear());
	 }
	 List1.add(new Product(01,"Shoes",8.2));
	 List1.add(new Product(02, "Ribbons",8.3));
	 List1.add(new Product(03, "Pencil",8.6));
	 List1.add(new Product(04, "Rubber",7.2));
	 List1.add(new Product(05, "Pen", 6.5));
	 Collections.sort(List1);
	 System.out.println("data after Sorting");
	 for(Product Product:List1) {
		 System.out.println(Product.getPrating()+ " "+Product.getPname()+" "+Product.getPid());		 

	}

}
}
