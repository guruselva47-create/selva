import java.lang.*;
import java.util.Scanner;
class weight
	 {
	  public static void main(String args[]){
	  Scanner obj=new Scanner(System.in);
	  System.out.println("enter the  first weight");
	  int firstweight= obj.nextInt();
          System.out.println("enter the second weight");
          int secondweight=obj.nextInt();
          System.out.println((firstweight>secondweight)?"first is heavier":"second is heavier");
}
}
	  
	  
