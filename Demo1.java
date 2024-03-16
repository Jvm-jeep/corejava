package khatateSakshi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Menu> list=new ArrayList<Menu>();
		
		 int ch;
		 do {
			 System.out.println("******Welcome to Sakshi's Hotel******");
			 System.out.println("Press1.Insert Menu");
			 System.out.println("press2. Read Menu");
			 System.out.println("Press3. Update Menu");
			 System.out.println("press4. Delete menu");
			 System.out.println("Press5. calculate the bill");
			 System.out.println("press6. Exit");
			 System.out.println("Enter Choice:");
			 ch=sc.nextInt();
			 switch(ch) {
			 case 1:
				 System.out.println("Enter Menu Id:");
				 int menuId=sc.nextInt();
				 System.out.println("Enter Menu Name:");
				 String menuName=sc.next();
				 System.out.println("Enter Menu Prize:");
				 int menuPrize=sc.nextInt();
				 System.out.println("Enter Menu Category:");
				 String menuCategory=sc.next();
				 System.out.println("Enter Menu Quantity:");
				 int menuQuantity=sc.nextInt();
				 list.add(new Menu(menuId,menuName,menuPrize,menuCategory,menuQuantity));
				 System.out.println("--------");
				 System.out.println("Record Store Successfully");
				 break;
			 case 2:
				 System.out.println("Read Details");
				 Iterator<Menu>m=list.iterator();
				 while(m.hasNext()) {
					 Menu m1=m.next();
					 System.out.println("Menu Id:"+m1.getMenuName()+"\nMenu Category"+m1.getCategory()+"\nMenu Prize"+m1.getPrize()+"\nMenu Quantity"+m1.getQuality());
				 }
				 break;
			 case 3:
				 boolean found=false;
				 System.out.println("Enter Menu Id Which you want to update");
				 menuId=sc.nextInt();
				 ListIterator<Menu>li=list.listIterator();
				 while(li.hasNext()) {
					 Menu mm=li.next();
					 
					 if(mm.getMenuId()==menuId) {
						 System.out.println("Enter Menu Name");
						 menuName=sc.next();
						 System.out.println("Enter menu Prize");
						 menuPrize=sc.nextInt();
						 System.out.println("Enter Menu Category");
						 menuCategory=sc.next();
						 System.out.println("Enter Menu Quantity");
						 menuQuantity=sc.nextInt();
						 li.set(new Menu(menuId,menuName,menuPrize,menuCategory,menuQuantity));
						 found=true;
						 
					 }
				 }
				 if(!found)
					 System.out.println("Record Not Found");
				 else
					 System.out.println("Record Updated");
				 break;
			 case 4:
				 found=false;
				 System.out.println("Enter MenuId Which you want to delete");
				 menuId=sc.nextInt();
				 ListIterator<Menu>li1=list.listIterator();
				 while(li1.hasNext()) {
					 Menu mm=li1.next();
					 if(mm.getMenuId()==menuId) {
						 li1.remove();
						 found=true;
						 
					 }
				 }
				 if(!found)
					 System.out.println("Record Not Found");
				 else
					 System.out.println("Record Deleted");
				 break;
			 case 5:

				 System.out.println("Calculate Bill:");
				 found=false;
				 int TB=0;
				 System.out.println("Enter MenuId to Calculate Bill");
				 menuId=sc.nextInt();
				 ListIterator<Menu>li2=list.listIterator();
				 while(li2.hasNext()) {
					 Menu mm=li2.next();
					 if(mm.getMenuId()==menuId)
					 {
						 TB=mm.getPrize()*mm.getQuality();
						 found=true;
					 }}
				 if(!found)
					 System.out.println("Record not found");
				 else
					 System.out.println("Total Bill:"+TB);
				 break;
					 
				 
				 
				  case 6:
				 System.out.println("Thankyou");
				 break;
			 
			 }
			 
		 }while(ch!=6);
	
}
				 		

}
