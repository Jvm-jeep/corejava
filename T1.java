package java8;
interface calci
{
	public void calsq(int x);
	
}
class A implements calci{

	@Override
	public void calsq(int x) {
		System.out.println(x*x);
		
		
	}
	
}
public class T1 {

	public static void main(String[] args) {
		
		A a1=new A();
		a1.calsq(10);
		
	}

}
