/*
Problem Statement

You are given a function,

Void *ReplaceCharacter(Char str[], int n, char ch1, char ch2);

The function accepts a string  ‘ str’ of length n and two characters ‘ch1’ and ‘ch2’ as its arguments . Implement the function to modify and return the string ‘ str’ in such a way that all occurrences of ‘ch1’ in original string are replaced by ‘ch2’ and all occurrences of ‘ch2’  in original string are replaced by ‘ch1’.

Assumption: String Contains only lower-case alphabetical letters.

Note:

Return null if string is null.
If both characters are not present in string or both of them are same , then return the string unchanged.
Example:

Input:
Str: apples
ch1:a
ch2:p
Output:
paales
Explanation:

‘A’ in original string is replaced with ‘p’ and ‘p’ in original string is replaced with ‘a’, thus output is paales
*/
import java.util.*;
public class accenture_11 {
    void ReplaceCharacter(String str, int n, char ch1, char ch2){
        String s="";
        str=str.toLowerCase();
        for(int i=0;i<n;i++){
            if(str.charAt(i)==ch1){
                s+=ch2;
            }
            else if(str.charAt(i)==ch2){
                s+=ch1;
            }
            else
            s+=str.charAt(i);
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch1=sc.next().charAt(0);
        char ch2=sc.next().charAt(0);
        accenture_11 ob=new accenture_11();
        ob.ReplaceCharacter(s,s.length(),ch1,ch2);
        sc.close();
    }
}
