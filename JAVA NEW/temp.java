import java.util.*;
public class temp
{
public static void main(String args[])

{

Scanner obj=new Scanner(System.in);
System.out.print("Enter temperature ");
int temp=obj.nextInt();
if((temp>=60) && (temp<70))
{
System.out.println("6oto70is heat");
}
else if((temp>=50) && (temp<60))
{
System.out.println("50to60 is veryhot");
}
else if((temp>=40) && (temp<50))                  

{
System.out.println("40to50 is hot");
}
else 
{
System.out.println("no cold");
}
}
} 
