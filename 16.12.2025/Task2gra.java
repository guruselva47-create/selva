import java.lang.*;
import java.util.Scanner;
class Task2gra{
  
  public static void main(String args[])
 {
 Scanner obj=new Scanner(System.in);
 System.out.println("enter number");
 int mark=obj.nextInt();
 if(age<13)
 {
  System.out.println("child");
}
 else if((mark>=13)&&(mark<19))
{
 System.out.println("teenager");
}
else if((mark>=20)&&(mark<59))
{
 System.out.println("adult");
}
else
{
System.out.println("senior citizen");
}
}
}
