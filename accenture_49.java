/* 
Consecutive difference

There is a coding project which takes an array A of integer. Your task is to calculate the difference between each consecutive pair of numbers and return an integer array representing the difference of consecutive numbers.

note: The difference should be calculated as the second number minus the first number

Input: 5 4 3 2 1
Output: -1 -1 -1 -1
*/
import java.util.Scanner;

public class accenture_49 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n-1];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        sc.close();
        for(int i=0;i<n-1;i++)
            b[i]=a[i+1]-a[i];
        for(int i=0;i<n-1;i++)
            System.out.print(b[i]+" ");
    }
}
