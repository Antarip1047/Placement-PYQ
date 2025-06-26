/*
Problem Statement

A carry is a digit that is transferred to left if sum of digits exceeds 9 while adding two numbers from right-to-left one digit at a time

You are required to implement the following function.

Int NumberOfCarries(int num1 , int num2);

The functions accepts two numbers ‘num1’ and ‘num2’ as its arguments. You are required to calculate and return  the total number of carries generated while adding digits of two numbers ‘num1’ and ‘ num2’.

Assumption: num1, num2>=0

Example:

Input
Num 1: 451
Num 2: 349
Output
2
Explanation:

Adding ‘num 1’ and ‘num 2’ right-to-left results in 2 carries since ( 1+9) is 10. 1 is carried and (5+4=1) is 10, again 1 is carried. Hence 2 is returned.

Sample Input

Num 1: 23

Num 2: 563

Sample Output

0
*/
import java.util.*;
public class accenture_10 {
    int NumberOfCarries(int num1 , int num2){
        int c=0;
        int n1=num1,n2=num2;
        int r=0;
        while(n1!=0&&n2!=0){
            int d1=n1%10,d2=n2%10;
            if(d1+d2+r>9){
                c++;
                int s=d1+d2+r;
                s/=10;
                r=s;
            }
            n1/=10;
            n2/=10;
        }
        while(n1!=0)
        {
            int d1=n1%10;
            if((d1+r)>9)
            {
                c++;
                int s=d1+r;
                s=s/10;
                r=s;
            }
            n1=n1/10;
        }
        while(n2!=0)
        {
            int d2=n2%10;
            if((d2+r)>9)
            {
                c++;
                int s=d2+r;
                s=s/10;
                r=s;
            }
            n2=n2/10;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        accenture_10 ob=new accenture_10();
        System.out.println(ob.NumberOfCarries(sc.nextInt(), sc.nextInt()));
        sc.close();
    }
}
