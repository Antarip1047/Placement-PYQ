/* 
A string is called a "merry string" if the frequency of each letter in that string is 1.
You are provided with a string S of length N. Find and print the number of merry substrings of length four that can be formed from the given string, if no such string found, then print '0'

Input format:
The input conaiata of two lines:
The first line contains N which represents the length of the string S
The second line contains the string.

Output format:
Find and print the number of merry substrings of length four taht can be formed from the given string. if no such string found, then print '0'.

4<=N<=104

the input string should only consist of lower case English alphabets

Example:
Input1: 9
abcdefggh
Output1:4

Input2:6
gffcgi
Output2:1
*/
import java.util.HashMap;
import java.util.Scanner;

public class accenture_32 {
    static int freq(String str){
        HashMap<Character, Integer> m = new HashMap<>();
        for (char c : str.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0) + 1);
            if (m.get(c) > 1) {
                return 0; // Return 0 if a repeated character is found
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        sc.close();
        int c=0;
        for(int i = 0; i <= n - 4; i++) {
            String x = s.substring(i, i + 4);
            if(freq(x)==1)
                c++;
            else
                continue;
        }
        System.out.println(c);
    }
}

