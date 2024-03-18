package com.march15;

public class Book {
	 private int Bid;
	 private String Bname;
	 private double Bprize;
	 private String Autor;
	 

	public Book(int bid, String bname, double bprize, String autor) {
		super();
		Bid = bid;
		Bname = bname;
		Bprize = bprize;
		Autor = autor;
	}


	public int getBid() {
		return Bid;
	}


	public void setBid(int bid) {
		Bid = bid;
	}


	public String getBname() {
		return Bname;
	}


	public void setBname(String bname) {
		Bname = bname;
	}


	public double getBprize() {
		return Bprize;
	}


	public void setBprize(double bprize) {
		Bprize = bprize;
	}


	public String getAutor() {
		return Autor;
	}


	public void setAutor(String autor) {
		Autor = autor;
	}


	public static void main(String[] args) {



	}

}
