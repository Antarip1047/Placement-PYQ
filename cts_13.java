/* 
Problem Statement – Raj wants to know the maximum marks scored by him in each semester. The mark should be between 0 to 100 ,if goes beyond the range display “You have entered invalid mark.”

Sample Input 1:

Enter no of semester:
3

Enter no of subjects in 1 semester:
3

Enter no of subjects in 2 semester:
4

Enter no of subjects in 3 semester:
2

Marks obtained in semester 1:
50
60
70

Marks obtained in semester 2:
90
98
76
67

Marks obtained in semester 3:
89
76

 

Sample Output 1:

Maximum mark in 1 semester:70
Maximum mark in 2 semester:98
Maximum mark in 3 semester:89
Sample Input 2:

Enter no of semester:
3

Enter no of subjects in 1 semester:
3

Enter no of subjects in 2 semester:
4

Enter no of subjects in 3 semester:
2

Marks obtained in semester 1:
55
67
98

Marks obtained in semester 2:
67
-98

Sample Output 2:

You have entered invalid mark.
*/

import java.util.Scanner;

public class cts_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no of semester:");
        int sems = sc.nextInt();
        int arr[] = new int [sems];
                
        for(int i=0;i< sems;i++) {
            System.out.println("Enter no of subjects in "+(i+1)+" semester:");
            arr[i]=sc.nextInt();
        }
        int maxMarks[] = new int[sems];
        for(int i=0;i< sems;i++) {
            System.out.println("Marks obtained in semester "+(i+1)+":");
            int max = sc.nextInt();
            if(max<0||max>100) {
                System.out.println("You have entered invalid mark.");
                System.exit(0);
            }
            for(int j=1;j< arr[i];j++) {
                int marks=sc.nextInt();
                if(marks<0||marks>100)
                {
                    System.out.println("You have entered invalid mark.");
                    System.exit(0);
                }

                if(max< marks)
                max=marks;
            }
            maxMarks[i]= max;
        }
        for(int i=0;i< sems;i++) {
            System.out.println("Maximum mark in "+(i+1)+" semester:"+maxMarks[i]);
        }
        sc.close();
    }
}
