import java.lang.*;
import java.util.Scanner;
class Task3
{
  public static void main(String arg[])
  {
   Scanner obj=new Scanner(System.in);
   System.out.println("enter number");
   int a= obj.nextInt();
   if(a%3==0)
   System.out.println("number is divisble by 3");
   else 
   {
   System.out.println("number is not divisble by 3");
   }
   
}
}   