import java.lang.*;
import java.util.Scanner;
class height
	 {
	  public static void main(String args[]){
	  Scanner obj=new Scanner(System.in);
	  System.out.println("enter the  first height");
	  int firstheight= obj.nextInt();
          System.out.println("enter the second height");
          int secondheight=obj.nextInt();
          System.out.println((firstheight>secondheight)?"first is taller":"second is taller");
}
}
	  
	  
