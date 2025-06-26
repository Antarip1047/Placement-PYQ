/* 
Single Digit:

Take a number input and reduce it to single digit and print the number:
the rules to be followed are:
i) If n is odd -> floor it to n/2
ii) If n is even -> floor it to (n-2)/2
iii) If n is less than 10, print it as it is
*/
import java.util.Scanner;

public class accenture_38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        while(n>9){
            double a=n;
            if(n%2==1){
                n=(int)Math.floor(a/2);
            }
            else{
                n=(int)Math.floor((a-2)/2); 
            }
        }
        System.out.println(n);
    }
}
