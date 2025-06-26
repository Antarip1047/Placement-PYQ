/* 
Googly Prime

A "googly number" is defined as a number that is derived from the sum of its individual digits. For example, if N=43, the sum of its individual digits is 4+3=7, making it a google number.

Your task is to write a function to determine whether a given positive integer N is a google prime or not.

A googly prime is a googly number that is also a prime number.

Write a function is_googly_prime(N) that takes an integer N as input and returns True if it is a googly prime, and False ptherwise.

Input:
An integer N (1<=N<=10^6), where N is the number to be checked.
Output:
Return True if N is a googly prime, and False otherwise.
*/
import java.util.Scanner;

public class accenture_42 {
    static int prime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                c++;
        }
        if(c==2)
        return 1;
        else
        return 0;
    }
    static boolean is_googly_prime(int n){
        int s=0;
        while(n!=0){
            s+=n%10;
            n/=10;
        }
        if(prime(s)==1)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(is_googly_prime(n))
        System.out.println("True");
        else
        System.out.println("False");
    }
}
