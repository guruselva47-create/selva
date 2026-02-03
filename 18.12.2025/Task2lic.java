import java.lang.*;
import java.util.*;
class Task2lic{
public static void main(String args[]){
       Scanner obj = new Scanner(System.in);
       System.out.println("Enter the number");
       int age=obj.nextInt();
       System.out.println("Enter the normal");
       String s=obj.next();
       if (age>=18)
       if (s.equals("yes"))
       {
 
       System.out.println("license approved");
       }
       else 
       {
      System.out.println("eye test faild");
       }
       else
       {
       System.out.println("wrong input");
       }

}}