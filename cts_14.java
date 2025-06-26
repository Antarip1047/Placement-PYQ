/* 
Problem Statement – Bela  teaches her daughter  to find the factors of a given number.  When she provides a number to her daughter, she should tell the factors of that number.  Help her to do this, by writing a program.  Write a class FindFactor.java and write the main method in it.
Note : 

If the input provided is negative, ignore the sign and provide the output. If the input is zero
If the input is zero the output should be “No Factors”.
 

Sample Input 1 :

54

Sample Output 1 :

1, 2, 3, 6, 9, 18, 27, 54

Sample Input 2 :

-1869

Sample Output 2 :

1, 3, 7, 21, 89, 267, 623, 1869
*/
import java.util.*;
public class cts_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(n==0){
            System.out.println("No factors");
            System.exit(0);
        }
        if(n<0){
            n=n*(-1);
            for(int i=1;i<n;i++){
                if(n%i==0)
                System.out.print(i+", ");
            }
            System.out.print(n);
        }
        else{
            for(int i=1;i<n;i++){
                if(n%i==0)
                System.out.print(i+", ");
            }
            System.out.print(n);
        }
    }
}
