/* 
Write a program to count number of unique characters in a given string and return the count

input:
abcd
output:
4

input:
aabbccdddeeee
ouytput:
5

*/
import java.util.Scanner;

public class accenture_41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        int a[]=new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        int c=0;
        for(int i=0;i<26;i++){
            if(a[i]>0)
            c++;
        }
        System.out.println(c);
    }
}
