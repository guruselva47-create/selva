import java.util.*;
public class age2
{
 public static void main(String arg[])
{
 Scanner obj=new Scanner (System.in);
 System.out.println("enter age");
 int age=obj.nextInt();
if ((age>=0) &&(age<30))
{
 System.out.print(" child");

}
else if ((age>=30) && (age<90))
{
System.out.print(" young adult");
}
else if ((age>=40) && (age<60))
{
System.out.print("middle adult");
}
else
{
System.out.print("senior"); 
}
}
}