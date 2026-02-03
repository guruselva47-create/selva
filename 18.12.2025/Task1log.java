import java.lang.*;
import java.util.*;
class Task1log{
public static void main(String args[]){
       Scanner obj = new Scanner(System.in);
       System.out.println("Enter the username");
       String us=obj.next();
       System.out.println("enter the password");
       int pass=obj.nextInt();
       if (us.equals("admin"))
       if(pass==1234){
       System.out.println("loginsuccess");
       }
       else 
       {
      System.out.println("wrong password");
       }
       else
       {
       System.out.println("wrong input");
       }

}}