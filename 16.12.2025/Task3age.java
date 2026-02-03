import java.lang.*;
import java.util.Scanner;
class Task3dvs{
  
  public static void main(String args[])
 {
 Scanner obj=new Scanner(System.in);
 System.out.println("enter number");
 int a=obj.nextInt();
 if((a%5==0)&&((a%11==0))
 {
  System.out.println("both divisble 5 and 11");
}
 else if(a%5==0)
{
 System.out.println("divisible by 5");
}
else if(a%11==0)
{
 System.out.println("divisible by 11");
}
else
{
System.out.println("no input");
}
}
}
