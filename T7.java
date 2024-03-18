package java8;
import java.util.ArrayList;
public class T7 {

	public static void main(String[] args) {
		ArrayList<Books> a1=new ArrayList<Books>();
		 {
		Books b1=new Books(101,"C","Dennis",200);
		Books b2=new Books(102,"python","pp",250);
		Books b3=new Books(103,"C#","Microsoft",300);
		Books b4=new Books(104,"Angular","Google",1000);
		Books b5=new Books(105,"React","Facebook",1500);

		a1.add( b1);
		a1.add(b2);
		a1.add(b3);
		a1.add(b4);
		a1.add(b5);

		a1.forEach(i->{System.out.println(i);});

			}

	}
	}


