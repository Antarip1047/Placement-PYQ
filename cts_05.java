/*
Problem Statement  – In a theater, there is a discount scheme announced where one gets a 10% discount on the total cost of tickets when there is a bulk booking of more than 20 tickets, and a discount of 2% on the total cost of tickets if a special coupon card is submitted. Develop a program to find the total cost as per the scheme. The cost of the k class ticket is Rs.75 and q class is Rs.150. Refreshments can also be opted by paying an additional of Rs. 50 per member.

Hint: k and q and You have to book minimum of 5 tickets and maximum of 40 at a time. If fails display “Minimum of 5 and Maximum of 40 Tickets”.  If circle is given a value other than ‘k’ or ‘q’ the output should be “Invalid Input”.

The ticket cost should be printed exactly to two decimal places.

Sample Input 1:

Enter the no of ticket:35
Do you want refreshment:y
Do you have coupon code:y
Enter the circle:k
Sample Output 1:

Ticket cost:4065.25
Sample Input 2:

Enter the no of ticket:1
Sample Output 2:

Minimum of 5 and Maximum of 40 Tickets
 */
import java.util.*;
public class cts_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of ticket:");
        int t=sc.nextInt();
        double total=0.0;
        if(t<5||t>40)
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
        else{
            System.out.print("Do you want refreshment:");
            String ref=sc.next();
            System.out.print("Do you have coupon code:");
            String code=sc.next();
            System.out.print("Enter the circle:");
            String circle=sc.next();
            if (circle.equalsIgnoreCase("k")) {
                total=t*75;
            }
            else if (circle.equalsIgnoreCase("q")) {
                total=t*150; 
            }
            else{
                System.out.println("INVALID INPUT");
            }
            if(t>20)
            total-=total*0.1;
            if(code.equalsIgnoreCase("y"))
            total-=total*0.02;
            if(ref.equalsIgnoreCase("y"))
            total+=t*50;
        }
        System.out.println(total);
        sc.close();
    }
}
