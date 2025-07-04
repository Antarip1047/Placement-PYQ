/*
Problem Statement – Mayuri buys “N” no of products from a shop. The shop offers a different percentage of discount on each item. She wants to know the item that has the minimum discount offer, so that she can avoid buying that and save money.
[Input Format: The first input refers to the no of items; the second input is the item name, price and discount percentage separated by comma(,)]
Assume the minimum discount offer is in the form of Integer.

Note: There can be more than one product with a minimum discount.

Sample Input 1:

4

mobile,10000,20

shoe,5000,10

watch,6000,15

laptop,35000,5

Sample Output 1:

shoe

Explanation: The discount on the mobile is 2000, the discount on the shoe is 500, the discount on the watch is 900 and the discount on the laptop is 1750. So the discount on the shoe is the minimum.

Sample Input 2:

4

Mobile,5000,10

shoe,5000,10

WATCH,5000,10

Laptop,5000,10

Sample Output 2:

Mobile 

shoe 

WATCH 

Laptop
*/
import java.util.*;
public class cts_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int Price[]=new int[n];
        int Dis[]=new int[n];
        String name[]=new String[n];
        float d[]=new float[n];
        //String inp[]=new String[n];
        for(int i=0;i<n;i++){
            String str[]= sc.nextLine().split(",");
            name[i]=str[0];
            Price[i]=Integer.parseInt(str[1]);
            Dis[i]=Integer.parseInt(str[2]);
            d[i]=(float)((Dis[i]*Price[i])/100);
        }
        int idx[]=new int[n];
        int j=0;
        float min= Float.MAX_VALUE;
        for(int i=0;i< n;i++){
            if(d[i]<=min)
            {
                min=d[i];
                idx[j++]=i;
            }
        }
        for(int i=0;i< j;i++){
            System.out.println(name[idx[i]]);
        }
        sc.close();
    }
}
