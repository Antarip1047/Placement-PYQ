/* 
Rohan is a kid who has just learned about creating words from alphabets. He has written some words in the notepad of his father's laptop. Now his father wants to find the longest word written by Rohan using a computer program. Write a program to find the longest string in a given list of strings.

Example:
Input: you hello obtain
Output: The longest string is: obtain

Input: yes no number
Output: The longest string is: number
*/
import java.util.Scanner;

public class accenture_47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        String ch[]=s.split(" ");
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i].length()>max)
                max=ch[i].length();
        }
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i].length()==max)
                System.out.println("The longest string is: "+ch[i]);
        }
    }
}
