/* 
248 number
A number is said to be 248 number if the cpunt of 2's is equal to the count of 4's and count of 4's is equal to the count of 8's. The count of 2's should be atleast 1. Give a number N. Your task is to find 248 numbers in the interval [1,N]. Since the answer can be too long, print it modulo 1000000007.

Input Format:
The input consist of a single line.
The first line contains a single integer N.

Output Format:
Print the count of 248 numbers in the interval [1,N] mod 1000000007

Constrains: 
1<=N<=10^10

Example:
Input:
300
Output:
2

Explanation:
There are 2 numbers less than or equal to 300 that have 2,4,8,all three as their digits. The two numbers are 248 and 284. Both have equal 2's, 4's and 8's, i.e. 1.
*/
import java.util.Scanner;

public class accenture_35 {
    static int check(int n){
        int a[]=new int[10];
        while(n!=0){
            a[n%10]++;
            n/=10;
        }
        if(a[2]==a[4]&&a[8]==a[4]&&a[2]>=1)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int c=0;
        for(int i=1;i<=n;i++){
            if(check(i)==1){
                c++;
            }
        }
        System.out.println(c);
    }
}
