package com.march15;
import java.util.ArrayList;
import java.util.Collections;


public class Test2 {

	public static void main(String[] args) {
		ArrayList<Product>List1=new ArrayList<Product>();
		List1.add(new Product(11,"DJ",4.2));
		List1.add(new Product(12,"Tie",5.2));
		List1.add(new Product(13,"Knife",4.2));
		List1.add(new Product(14,"Tong",4.2));
		List1.add(new Product(15,"Mob",4.2));
		productName pn=new productName();
		Collections.sort(List1,pn);
		for(Product Is:List1) {
			System.out.println(Is.getPid()+" "+Is.getPname()+" "+Is.getPrating());
		}
	}

}
