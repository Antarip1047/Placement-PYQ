/* 
Problem Description:

The function accepts an integer array ‘arr’ of size ‘n’ and an integer ‘d’ as its argument. The function needs to rotate the array ‘arr’ by ‘d’ positions to the right. The rotation should be done in place, without using any additional memory.

 

Example:

Input:

n: 5
	 	
3 4 5 1 2

d: 3
	 	
Output:

arr: 1 2 3 4 5
*/
import java.util.Scanner;

public class accenture_20 {
    void rotate(int arr[],int n,int d){
        int t[]=new int[n];
        int j=0;
        for(int i=d;i<n;i++){
            t[j]=arr[i];
            j++;
        }
        for(int i=0;i<d;i++){
            t[j]=arr[i];
            j++;
        }
        for(int i=0;i<n;i++){
            System.out.print(t[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("n: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.print("d: ");
        int d=sc.nextInt();
        sc.close();
        accenture_20 ob=new accenture_20();
        ob.rotate(a, n, d);
    }
}
