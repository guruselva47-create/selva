import java.lang.*;
import java.util.Scanner;
class Task9
{
  public static void main(String arg[])
  {
   Scanner obj=new Scanner(System.in);
   System.out.println("enter number:");
   int a= obj.nextInt();
   if(a%64==0)
   {
   System.out.println("last digit is even");
   }
   else 
   {
   System.out.println("last digit is not even");
   }
   
}
}   