import java.lang.*;
import java.util.Scanner;
class mark{
      public static void main(String args[]){
      Scanner obj=new Scanner (System.in);
      System.out.println("enter the mark");
      int mark=obj.nextInt();
      if((mark>40) && (mark<70))
{
      System.out.println("enter a grade");
}
      else if((mark>100) && (mark<80))
{
      System.out.println("enter b grade");
}
      else
{
      System.out.println("enter fail");
}
}
}