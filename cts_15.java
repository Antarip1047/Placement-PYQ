/* 
Wap to print the prime numbers less than or equals to n. The number should not contain 0 in it.

input1:
4
Output1: 
2 (2,3)

input2:
2
Output2:
1 (2)
*/

import java.util.ArrayList;
import java.util.Scanner;

public class cts_15 {
    static void print(ArrayList<Integer> a){
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));
            if (i < a.size() - 1) {
                System.out.print(", "); // Print a comma only between elements
            }
        }
    }
    static int zeros(int n){
        int c=0;
        while(n!=0){
            if(n%10==0)
                c++;
            n/=10;
        }
        if(c==0)
            return 1;
        else
            return 0;
    }

    static int is_prime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int c=0;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(is_prime(i)==1){
                if(zeros(i)==1){
                    c++;
                    a.add(i);
                }
            }
        }
        System.out.print(c + " ( ");
        print(a);
        System.out.print(" )");
    }
}
