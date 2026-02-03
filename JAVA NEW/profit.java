import java.util.*;
  
public class profit {
  public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter profit");
int profit=obj.nextInt();
System.out.println ("enter costprice");
int costprice=obj.nextInt();
	double amt= (profit*100)/costprice;
 System.out.println("profit: "+ profit);
	System.out.println("costprice: "+ costprice);
	System.out.println("profit"+amt+"%");
   
  }
}