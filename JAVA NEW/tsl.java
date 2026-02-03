import java.util.*;
  
public class tsl {
  public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter basic");
int basic=obj.nextInt();
System.out.println ("enter hra");
int hra=obj.nextInt();
System.out.println ("enter da");
int da=obj.nextInt();
int	totalsalary=basic+hra+da;
 System.out.println("basic: "+ basic);
	System.out.println("hra: "+ hra);
	System.out.println("da"+da);
   	System.out.println("totalsalary"+totalsalary);
  }
}