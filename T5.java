package java8;
@FunctionalInterface
interface Arithmatic{
	public void show(int a, int b);
	
}

public class T5 {

	public static void main(String[] args) {
		Arithmatic m1=(int i,int j)->System.out.println("Addition is:"+i+j);
		m1.show(10, 20);
		Arithmatic m2=(int i,int j)->System.out.println("Substraction is:"+(i-j));
		m2.show(10, 20);
		Arithmatic m3=(int i,int j)->System.out.println("Multiplication is:"+(i*j));
		m3.show(10, 20);
		Arithmatic m4=(int i,int j)->System.out.println("Division is:"+(i/j));
		m4.show(10, 20);
		

	}

}
