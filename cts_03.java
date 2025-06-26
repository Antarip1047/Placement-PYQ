/*
Problem Statement – Ritik wants a magic board, which displays a character for a corresponding number for his science project. Help him to develop such an application.
For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.
[Assume the number of inputs should be always 4 ]

Sample Input 1:

Enter the digits:
65
66
67
68
Sample Output 1:

65-A
66-B
67-C
68-D

Sample Input 2:

Enter the digits:
115
116
101
112
Sample Output 2:

115-s
116-t
101-e
112-p
 */
import java.util.*;
public class cts_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        char a1=(char)a;
        char b1=(char)b;
        char c1=(char)c;
        char d1=(char)d;
        System.out.println(a+"-"+a1);
        System.out.println(b+"-"+b1);
        System.out.println(c+"-"+c1);
        System.out.println(d+"-"+d1);
        sc.close();
    }
}
