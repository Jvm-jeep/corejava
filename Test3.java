package com.march15;
import java.util.Hashtable;
import java.util.Map;


public class Test3 {

	public static  void main(String[] args) {
		Hashtable<Integer,String>ht=new Hashtable<Integer,String>();
		ht.put(23," Amit");
		ht.put(25," Vijay");
		ht.put(20," Ayush");	
		ht.put(15," sujay");
		ht.put(15," Ajay");
		System.out.println(ht);
		for(Map.Entry m:ht.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
					
	}

}
