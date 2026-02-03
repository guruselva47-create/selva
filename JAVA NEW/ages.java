import java.lang.*;
import java.util.Scanner;
class Age{
public static void main(String args[]){
       Scanner obj=new Scanner(System.in);
       System.out.println("Ente the mark");
       int mark=obj.nextInt();
       if (mark>70&& mark<0)
{
      System.out.println("a grade");
}
       else if (mark<50 && mark>0)
{
      System.out.println("B grade");
}
       else
{
     System.out.println("Fail");
}
}
}