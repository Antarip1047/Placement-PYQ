/* 
Given an integer n, there are n no. of bulbs, initially all the bulbs are on.

There are n bulbs that are initially off. You first turn on all the bulbs, then you turn off every second bulb.

On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). For the ith round, you toggle every i bulb. For the nth round, you only toggle the last bulb.

Return the number of bulbs that are on after n rounds.

Example:

Input: 3
Output: 1

Input: 1
Output: 0
*/
import java.util.Scanner;

public class accenture_31 {
    static int bulb(int n){
        if(n<=1)
        return 0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=1;
        for(int i=1;i<n;i++){
            for(int j=i;j<n;j=j+i+1){
                if(a[j]==0)
                    a[j]=1;
                else
                    a[j]=0;
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]==1)
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.println(bulb(n));
    }
}
