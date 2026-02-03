import java.lang.*;
import java.util.*;
class loop{
public static void main(String args[]){
       Scanner obj = new Scanner(System.in);
       System.out.println("Enter the starting value   :");
       int a=obj.nextInt();
       System.out.println("Enter the ending value   :");
       int b=obj.nextInt();
       for( int i= a;i<=b;i=i+1){
       System.out.println(i);
}
}
}