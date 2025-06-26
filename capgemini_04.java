/* 
Problem Statement –

You’re given an array of integers, print the number of times each integer has occurred in the array.

 

Example

Input :

10

1 2 3 3 4 1 4 5 1 2

 

Output :

1 occurs 3 times

2 occurs 2 times

3 occurs 2 times

4 occurs 2 times

5 occurs 1 times


*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class capgemini_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        sc.close();
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:a){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        m.forEach((key, value) -> System.out.println(key + " occurs " + value + " times"));
    }
}
