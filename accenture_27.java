/* 
Magical Number

you are given a program to find teh count of magical number from 1 to N. A magical number is defined by the following criteria:

-convert each number in the range 1 to N to its binary representation
-replace '0' with '1' and '1' with '2' in the binary string
-calculate the sum of the digits in the modified binary string. If the resultant number is odd, then its considered as magical number

your task is to find and return an integer value representing the count of the magical number present in the given range

input1: an integer value N representing the range of numbers
*/
import java.util.*;
public class accenture_27 {
    static int magical(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            String s=Integer.toBinaryString(i);
            //System.out.println(s);
            String bin=s.replace('1', '2').replace('0', '1');
            //System.out.println(bin);
            int sum=0;
            for(int j=0;j<bin.length();j++)
                sum+=bin.charAt(j)-'0';
            if(sum%2!=0)
                c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.close();
        System.out.println(magical(N));
    }
}
