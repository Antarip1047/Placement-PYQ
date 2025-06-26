/* 
Climbing stairs

Alicec climbs a staircase and takes N steps to reach the top. In each turn Alice can climb 1 or M stairs. Find the minimum number of climbs to reach the top.

input format:
the input consists of a single line:
the first line contains two space separated integers N and M.

output format
Print the number that represents the minimum number of climbs required to reach the top.

Constraints:
- 1<=N<=10^9
- 1<=M<=10^9

Example:
Input:
5 1
output:
5

Explanation:
Alice can reach the top by 0->1->2->3->4->5

input2:
6 4
output:
3
*/
import java.util.Scanner;

public class accenture_34 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    sc.close();
    if(n%m==0)
        System.out.println(n/m);
    else
        System.out.println((n/m)+(n%m));
   } 
}
