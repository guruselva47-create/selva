import java.lang.*;
import java.util.Scanner;
class Task11
{
  public static void main(String arg[])
  {
   Scanner obj=new Scanner(System.in);
   System.out.println("enter number:");
   int a= obj.nextInt();
   if((a>0)&&(a%2==0))
   {
   System.out.println("positive and even");
   }
   else 
   {
   System.out.println("no positive and even");
   }
   
}
}   