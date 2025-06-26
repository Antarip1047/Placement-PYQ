/* 
Given an array nums, print an array answer such that answer[i] is equal to the product of all elements of nums except nums[i].

input1:
4
1 2 3 4

output1:
24 12 8 6

input2:
5
-1 1 0 -3 3

output2:
0 0 9 0 0
*/
import java.util.Scanner;

public class cts_16 {
    static int prod(int a[],int c){
        int p=1;
        for(int i=0;i<c;i++){
            p*=a[i];
        }
        for(int i=c+1;i<a.length;i++){
            p*=a[i];
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
        int answer[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            answer[c]=prod(nums,i);
            c++;
        }
        for(int i=0;i<n;i++){
            System.out.print(answer[i]+" ");
        }
    }
}
