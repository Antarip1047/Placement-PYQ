/* 
You are given an integer 'n'. Wap to calculate and return the sum of the digits in 'n' after converting it to its binary representation. 

Example
Input:15
Output:4
Explanation: Binary of 15 is 1111, so sum of digits of 1111 = 4.
*/
import java.util.Scanner;

public class accenture_45 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        String s = Integer.toBinaryString(n);
        char c[]=s.toCharArray();
        int p=0;
        for(int i=0;i<s.length();i++){
            p+=(int)(c[i]-'0');
        }
        System.out.println(p);
    }
}
