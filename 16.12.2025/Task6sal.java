import java.lang.*;
import java.util.Scanner;
class Task6sal{
  
  public static void main(String args[])
 {
 Scanner obj=new Scanner(System.in);
 System.out.println("enter number ");
 int salary=obj.nextInt();
 if(salary>=50000)
 {
  System.out.println("highincome");
}
 else if((salary>=30000)&&(salary<50000))
{
 System.out.println(" medidum income");
}

else
{
System.out.println("low income");
}
}
}
