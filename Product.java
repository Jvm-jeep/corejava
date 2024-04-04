package com.march19;


public class Product {
	private int Pid;
	private String Pname;
	private int Pprize;
	private int Pquantity;
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
	public int getPprize() {
		return Pprize;
	}
	public void setPprize(int pprize) {
		Pprize = pprize;
	}
	public int getPquantity() {
		return Pquantity;
	}
	public void setPquantity(int pquantity) {
		Pquantity = pquantity;
	}
	public Product(int pid, String pname, int pprize, int pquantity) {
		super();
		Pid = pid;
		Pname = pname;
		Pprize = pprize;
		Pquantity = pquantity;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [Pid=" + Pid + ", Pname=" + Pname + ", Pprize=" + Pprize + ", Pquantity=" + Pquantity + "]";
	}
}
	