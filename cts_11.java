/* 
Problem Statement –

IIHM institution is offering a variety of courses to students. Students have a facility to check whether a particular course is available in the institution. Write a program to help the institution accomplish this task. If the number is less than or equal to zero display “Invalid Range”.

Assume maximum number of courses is 20.

Sample Input 1:

Enter no of course:
5

Enter course names:
Java

Oracle

C++

Mysql

Dotnet

Enter the course to be searched:
C++

Sample Output 1:

C++ course is available

Sample Input 2: 

Enter no of course:
3

Enter course names:
Java

Oracle

Dotnet

Enter the course to be searched:
C++

Sample Output 2:

C++ course is not available

Sample Input 3:

Enter no of course:
0

Sample Output 3:

Invalid Range
*/
import java.util.*;

public class cts_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of courses:");
        int n=sc.nextInt();
        if(n<1||n>20){
            System.out.println("Invalid range");
            System.exit(0);
        }
        String s[]=new String[n];
        System.out.println("Enter the course names:");
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        System.out.println("Enter the course to be searched");
        String x=sc.next();
        sc.close();
        int f=-1;
        for(int i=0;i<s.length;i++){
            if(s[i].equalsIgnoreCase(x)){
                System.out.println(x+" course is available");
                f=0;
                break;
            }
        }
        if(f==-1)
        System.out.println(x+" course not available");
    }
}