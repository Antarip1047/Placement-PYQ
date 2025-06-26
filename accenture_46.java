/* 
Given an array of N integers, task is to replace elements with its rank in the array

Example 1:
Input: 20 15 26 2 98 6
Output: 4 3 5 1 6 2

Explanation: When sorted, the array is 2,6,15,20,26,98. So the rank of 2 is 1, rank of 6 is 2 and so on...
*/
import java.util.*;
public class accenture_46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        sc.close();
        int b[]=new int[n];
        for(int i=0;i<n;i++)
            b[i]=a[i];
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(b[j]==a[i])
                    a[i]=j+1;
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}
