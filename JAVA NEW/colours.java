import java.util.Scanner;
+
{ 
 public static void main(String args[])
{
 Scanner obj=new Scanner(System.in);
 System.out.println("light");
 String light=obj.nextLine();
 if(light.equals("red"))
{
 System.out.println("stop");
}
else if(light.equals("yellow"))
{
System.out.println("ready");
}
else if (light.equals("green"))
{
System.out.println("go");
}
else
{
System.out.println("wrong input");
}
}
}