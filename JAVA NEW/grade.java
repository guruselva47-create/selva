import java.util.*;  
public class grade{
  public static void main(String[] args) 
{
	Scanner obj=new  Scanner (System.in);
	System.out.println("enter mark:");
	int mark=obj.nextInt();
		
  if((mark>90)&&(mark<=100))
{
System.out.println("A grade");
  
}
else if ((mark>80)&&(mark<90))
{
System.out.println("B grade");
}
else if ((mark>70)&&(mark<80))
{
System.out.println("c grade");
}
System.out.println("no grade");	
}
}