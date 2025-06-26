/* 
Maximum Subarray Sum
 
Problem Description:

Given an array of integers, find the maximum subarray sum. A subarray is a contiguous subsequence of the array.

Explanation:

Given an array of integers, such as [-2, 1, -3, 4, -1, 2, 1, -5, 4], the algorithm should determine that the maximum subarray sum is 6 ([4, -1, 2, 1]).
*/
import java.util.*;
public class accenture_24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        sc.close();
        int max=Integer.MIN_VALUE;
        int s;
        for(int i=0;i<n;i++){
            s=0;
            for(int j=i;j<n;j++){
                s+=a[j];
                max=Math.max(max, s);
            }
        }
        System.out.println(max);
    }
}
