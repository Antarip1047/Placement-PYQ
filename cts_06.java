/*
Problem Statement – Rhea Pandey’s teacher has asked her to prepare well for the lesson on seasons. When her teacher tells a month, she needs to say the season corresponding to that month. Write a program to solve the above task.

Spring – March to May,
Summer – June to August,
Autumn – September to November and,
Winter – December to February.
Month should be in the range 1 to 12.  If not the output should be “Invalid month”.

Sample Input 1:

Enter the month:11
Sample Output 1:

Season:Autumn
Sample Input 2:

Enter the month:13
Sample Output 2:

Invalid month
 */
import java.util.*;
public class cts_06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the month:");
        int m=sc.nextInt();
        sc.close();
        if(m>=13||m<1)
        {
            System.out.println("Invalid month");
            System.exit(0);
        }
        else{
            if(m>=3&&m<=5)
            System.out.println("Spring");
            else if(m>=6&&m<=8)
            System.out.println("Summer");
            else if(m>=9&&m<=11)
            System.out.println("Autumn");
            else
            System.out.println("Winter");
        }
    }
}
