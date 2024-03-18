package com.march15;

public class Product implements Comparable<Product> {
	private int Pid;
	public Product(int pid, String pname, double prating) {
		super();
		Pid = pid;
		Pname = pname;
		this.prating = prating;
	}


	private String Pname; 
	private double prating;
	

	public int getPid() {
		return Pid;
	}


	public void setPid(int pid) {
		Pid = pid;
	}


	public String getPname() {
		return Pname;
	}


	public void setPname(String pname) {
		Pname = pname;
	}


	public double getPrating() {
		return prating;
	}


	public void setPrating(double prating) {
		this.prating = prating;
	}


	public static void main(String[] args) {
		
	}


	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
