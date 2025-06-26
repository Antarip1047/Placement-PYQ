/* 
Problem Description:

The function accepts an integer array ‘arr’ of size ‘n’ and an integer ‘d’ as its argument. The function needs to rotate the array ‘arr’ by ‘d’ positions to the right. The rotation should be done in place, without using any additional memory.

Input:
n: 5

arr: 1 2 3 4 5

d: 3

Output:
3 4 5 1 2
*/
import java.util.*;
public class accenture_22 {
    void rotate(int a[],int d){
        int t[]=new int[a.length];
        int j=0;
        for(int i=d-1;i<a.length;i++)
        {
            t[j]=a[i];
            j++;
        }
        for(int i=0;i<d-1;i++)
        {
            t[j]=a[i];
            j++;
        }
        for(int i=0;i<a.length;i++)
        System.out.print(t[i]+" ");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        accenture_22 ob=new accenture_22();
        ob.rotate(a,sc.nextInt());
        sc.close();
    }
}
