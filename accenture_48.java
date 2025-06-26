/* 
wap to return an integer value representing the smallest prime number larger than N

Example 1:
input 1: 4
output 1: 5

Explanation:
Here the given value of N=4, and the smallest prime number greater than 4 is 5.
Therefore, 5 is the returned value

Example 2:
input 2: 12
output 2:13
*/
import java.util.Scanner;

public class accenture_48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        sc.close();
        int n=m+1;
        while(n<=Integer.MAX_VALUE){
            int c=0;
            for(int i=1;i<=n;i++){
                if(n%i==0)
                c++;
            }
            if(c==2)
            {
                System.out.println(n);
                break;
            }
            else
            n=n+1;
        }
    }
}
