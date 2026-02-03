import java.lang.*;
import java.util.Scanner;
class Task2
{
  public static void main(String arg[])
  {
   Scanner obj=new Scanner(System.in);
   System.out.println("enter number");
   int a= obj.nextInt();
   if(a%5==0)
   System.out.println("number is divisble by 5");
   else 
   {
   System.out.println("number is not divisble by 5");
   }
   
}
}   