/*
Chocolate Distribution

you have a total of n chocolates that you want to distribute between two individuals, A and B. However, there are specific conditions for the distribution:

Person A must receive more chocolates than person B.
Person B must receive at least one chocolate.
Write a function chocolate_distribution_ways(n) that takes an integer n as input and returns the number of distinct ways you can distribute the chocolates netween A and B, Satisfying the given conditions.

Input:

n(1<=n<=100): An inetger representing the total number of chocolates.

Output:
Returns an integer representing the numbert of distinct ways the chocolates can be distributed.

input :4
output: 1
Explanation: (3,1) is the valid distribution

input :12
output: 5
Explanation: (11,1),(10,2),(9,3),(8,4),(7,5) is the valid distribution


*/
import java.util.Scanner;

public class accenture_28 {
    static int chocolate_distribution_ways(int n){
        int c=0;
        int a=n-1;
        int b=1;
        while(a>b){
            a--;
            b++;
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.println(chocolate_distribution_ways(n));
    }
}
