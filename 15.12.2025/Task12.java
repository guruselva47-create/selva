import java.lang.*;
import java.util.Scanner;
class Task12
{
  public static void main(String arg[])
  {
   Scanner obj=new Scanner(System.in);
   System.out.println("enter number:");
   int a= obj.nextInt();
   if(a%10==5)
   {
   System.out.println("last digit is 5");
   }
   else 
   {
   System.out.println("last digit is not 5");
   }
   
}
}   