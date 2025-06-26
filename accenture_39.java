/* 
Happy Number:
A number is called happy if it leads to 1 after a sequence of steps wherein each step number is replaced by the sum of squares of its digit that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1. 

Examples : 

Input: n = 19
Output: True
19 is Happy Number,
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
As we reached to 1, 19 is a Happy Number.

Input: n = 20
Output: False
A number will not be a Happy Number when it makes a loop in its sequence that is it touches a number in sequence which already been touched. So to check whether a number is happy or not, we can keep a set, if the same number occurs again we flag result as not happy
*/
import java.util.Scanner;
public class accenture_39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int s;
        while(n>9){
            s=0;
            while(n>0){
                int d=n%10;
                s+=d*d;
                //System.out.println(s);
                n/=10;
            }
            n=s;
            //System.out.println(n);
        }
        if(n==1)
        System.out.println("Happy number");
        else
        System.out.println("Not Happy number");
    }
}