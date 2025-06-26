/* 
Problem Description:

The function accepts a string ‘str’ as its argument. The function needs to reverse the order of the words in the string.

Input:

str: “Hello, World!”

Output:

	
!dlroW ,olleH
*/
import java.util.Scanner;

public class accenture_23 {
    void reverse(String s){
        String a="";
        for(int i=0;i<s.length();i++)
        a=s.charAt(i)+a;
        System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        accenture_23 ob=new accenture_23();
        ob.reverse(sc.nextLine());
        sc.close();
    }
}
