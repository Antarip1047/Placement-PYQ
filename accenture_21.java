/* 
Problem Description:

The function accepts an integer array ‘arr’ of size ‘n’ as its argument. The function needs to return the index of an equilibrium point in the array, where the sum of elements on the left of the index is equal to the sum of elements on the right of the index. If no equilibrium point exists, the function should return -1.

Example:

Input:

n: 5

arr: 1 3 5 7 3

Output:
 	 	
3


*/
import java.util.*;
public class accenture_21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l,r,c=-1;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            l=0;
            for(int j=0;j<i;j++)
            l+=a[j];
            r=0;
            for(int j=i+1;j<n;j++)
            r+=a[j];
            if(l==r)
            {
                c=i;
                break;
            }
        }
        System.out.println(c);
    }
}
