import java.util.*;
public class flags
{
public static void main(String v[])
{Scanner obj= new Scanner(System.in);
System.out.println("What is color of national flags? ");
System.out.println("enter the color :");
String colour=obj.next();
if (colour.equals("white"))
{
System.out.println("Peace");
}
else if(colour.equals("green"))
{
System.out.println("Nature");
}

else if(colour.equals("orange"))
{
System.out.println("Sacrification");
}
else
{
System.out.println("Wrong input");
}
}
}
