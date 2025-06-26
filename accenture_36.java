/* 
A party has been organised on cruise. The party is organised for a limited time(T). The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array. The task is to fing the maximum nuimber of guests present on the cruise at any given instance within T hours.

Example 1:
Input:
5   -> Value of T
[7,0,5,1,3] -> E[], Elements of E[0] to E[n-1], where input each element is seperated by new line
[1,2,1,3,4] -> L[], Elements of L[0] to L[n-1], where input each element is seperated by new line

Output:
8   ->Maximum number of guests on cruise at an instance.


*/
import java.util.Scanner;

public class accenture_36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int E[]=new int[n];
        int L[]=new int[n];
        for (int i = 0; i < n; i++)
            E[i]=sc.nextInt();
        for (int i = 0; i < n; i++)
            L[i]=sc.nextInt();
        sc.close();
        int s=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            s+=E[i]-L[i];
            if(s>max)
                max=s;
        }
        System.out.println(max);
    }
}
