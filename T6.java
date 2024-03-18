package java8;
interface Book{
	public void show(String Auth, int Prize, String type );
}

public class T6 {

	public static void main(String[] args) {
		Book m1=(String i,int j, String k)->System.out.println("Author of book is:"+i+"\nPrize of Book:"+j+"\nType of book:"+k);
		m1.show("KK", 500, "c++");
	}
}
