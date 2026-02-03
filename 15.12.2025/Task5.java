import java.lang.*;
import java.util.Scanner;
class Task5
{
  public static void main(String arg[])
  {
   Scanner obj=new Scanner(System.in);
   System.out.println("enter number");
   int a= obj.nextInt();
   if(a%5==0)
   System.out.println("fizz");
   else 
   {
   System.out.println("not fizz");
   }
   
}
}   