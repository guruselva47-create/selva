import java.lang.*;
import java.util.Scanner;
class Task6
{
  public static void main(String arg[])
  {
   Scanner obj=new Scanner(System.in);
   System.out.println("enter number");
   int a= obj.nextInt();
   if((a%2==0)&&(a%3==0))
   {
   System.out.println("divisble by 2 and 3");
   }
   else 
   {
   System.out.println("not divisble by 2 and 3");
   }
   
}
}   