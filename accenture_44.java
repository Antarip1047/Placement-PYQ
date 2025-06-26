/* 
Write a function that takes a string as input, counts the number of lowercase and uppercase letters, sand convert the entire string into the case with the greater count. If the count are equal, leave the string unchanged.

Example:
Input:MADam
Output: MADAM

Input: madAM
Output: madam
*/
import java.util.Scanner;

public class accenture_44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        int u=0,l=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65&&s.charAt(i)<=90)
            u++;
            else if(s.charAt(i)>=97&&s.charAt(i)<=122)
            l++;
        }
        if(u==l)
        System.out.println(s);
        else if(u>l)
        System.out.println(s.toUpperCase());
        else
        System.out.println(s.toLowerCase());
    }
}
