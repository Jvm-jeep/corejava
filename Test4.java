package com.march15;
import java.util.Hashtable;
import java.util.Map;

public class Test4 {

	public static void main(String[] args) {
		Hashtable<Integer,Book>h1=new Hashtable<Integer,Book>();
		Book b1=new Book(101,"c++",500,"BS");
		Book b2=new Book(101,"c",200,"Bk");
		Book b3=new Book(101,"python",400,"sk");
		Book b4=new Book(101,"java",300,"pk");
		Book b5=new Book(101,"Random",100,"BT");
		
		h1.put(101,b1);
		h1.put(102,b2);
		h1.put(103,b3);
		h1.put(104,b4);
		h1.put(105,b5);
	for(Map.Entry<Integer, Book>book:h1.entrySet()){
		int key=book.getKey();
		Book b=book.getValue();
		System.out.println("Book Details are:");
		System.out.println("Book id"+b.getBid()+"\nBook Name:"+b.getBname()+"\nBook AuthorName:"+b.getAutor()+"\nBook Prize:"+b.getBprize());
	}
	}

}
