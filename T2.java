package java8;
interface Shape{
	public void show();
}
class cube implements Shape{
	
	public void show() {
		System.out.println("This is cube shape class");
	}
}

public class T2 {

	public static void main(String[] args) {
		cube c1=new cube();
		c1.show();
		
		

	}

}
