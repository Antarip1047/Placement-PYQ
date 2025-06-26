/* 
Problem Statement –

Capgemini in its online written test have a coding question, wherein the students are given a string with multiple characters that are repeated consecutively. You’re supposed to reduce the size of this string using mathematical logic given as in the example below :

Input :

aabbbbeeeeffggg

Output:

a2b4e4f2g3

Input :

abbccccc

Output:

ab2c5
*/
import java.util.Scanner;

public class capgemini_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        sc.close();
        int c=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1))
            c++;
            else
            {   
                sb.append(s.charAt(i-1));
                if(c>1)
                    sb.append(c);
                c=1;
            }
        }
        sb.append(s.charAt(s.length()-1));
        if(c>1)
            sb.append(c);
        System.out.println(sb);
    }
}
