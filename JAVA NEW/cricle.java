import java.lang.*;
import java.util.Scanner;
class circle
{
public static void main(String arg[])
{
Scanner circle=new Scanner(System.in);
float pi=3.14f;
System.out.println("enter the r value");
int r=circle.nextInt();
double ans=pi*r*r;
System.out.println("Enter the ans="+ans);
}
}