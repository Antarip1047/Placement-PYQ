/* 
You are given a binary string consisting of a sequence of '1's and '0's. This binary string is an encoded version of an English word. Each uppercase letter in the word is represented by a sequence of '1's of varying lengths,while '0's act as separators between these sequences. Your task is to decode the binary strng and determine the original word. 


Input: 
11101011110

Output:
CAD

*/
import java.util.Scanner;

public class accenture_51 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        String c[]=s.split("0");
        for(int i=0;i<c.length;i++)
        {
            System.out.print((char)(c[i].length()+64));
        }
    }
}
