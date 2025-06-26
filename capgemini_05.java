/* 
Problem Statement –

Write a function to solve the following equation a3 + a2b + 2a2b + 2ab2 + ab2 + b3.

 

Write a program to accept three values in order of a, b and c and get the result of the above equation.
*/
import java.util.*;
public class capgemini_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        //int c=sc.nextInt();
        int d=(int)Math.pow(a+b,3);
        System.out.println(d);
    }
}
