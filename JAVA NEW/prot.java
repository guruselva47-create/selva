import java.util.*;
public class prot
{
public static void main(String args[])

{

Scanner obj=new Scanner(System.in);
System.out.print("Enter rain of 0-30");
int rain=obj.nextInt();
if((rain>=0) && (rain<10))
{
System.out.println("oto9is normal");
}
else if((rain>=10) && (rain<20))
{
System.out.println("10to19 is medimum");
}
else if((rain>=20) && (rain<30))

{
System.out.println("20to29 is high");
}
else 
{
System.out.println("no found");
}
}
} 
