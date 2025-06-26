/* 
Who is the winner

Elections are conducted in a town that has population N. All the people of the town, cast votes in the various candidates in town. The people of the town they realised that the votes of only for the candidates 18 and above years of age should be considered. Find out the candidate who is the winner if only the votes of age group 18 and above are considred. If the winner cannot be decided or there is a tie, print -1. You are given an array vote which represents the candidate to whom the vote is given by ith and another array of age which represents the age of that particular voter.

Input Format:
The input consist of 3 lines:
The first line will contain one value N, the size of the arrays.
The second line will contain N space separated positive integers, denoting the array of the vote
The third line will contain N space separated integers denoting the array of age

Output Format:
Print the number which represent the winner. If the winner cannot be decided or there is a tie, print -1.

Constraints:
1<=N<=200

Example:
Input:
10
1   1  2  3  4  1  2  2  3  1
24 13 35 15 50 16 20 18 25 64
Output:
2

Explanation:
So, candidate 1 gets 4 votes, candidate 2 gets 3 votes, candidate 3 gets 2 votes, and candidate 4 gets 1 vote. But the 2nd and 6th vote given to candidate 1 are from age group, So they are not considered. So, the new vote count is candidate 1 gets 2 votes, candidate 2 gets 3 votes, candidate 3 gets 2 votes and candidate 4 gets 1 vote.

Input2:
3
1 2 3
10 12 15
Output:
-1
*/
import java.util.*;
public class accenture_33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int vote[]=new int[n];
        int age[]=new int[n];
        for(int i=0;i<n;i++)
            vote[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            age[i]=sc.nextInt();
        int val[]=new int[10];
        for(int i=0;i<10;i++)
            val[i]=0;
        for(int i=0;i<n;i++){
            if(age[i]>=18){
                val[vote[i]]++;
            }
        }
        int win=-1;
        int max=Integer.MIN_VALUE;
        boolean tie = false;
        for(int i=0;i<10;i++){
            if(val[i]>max){
                max=val[i];
                win=i;
                tie=false;
            }
            else if(val[i]==max&&max!=Integer.MIN_VALUE){
                tie=true;
            }
        }
        if(tie||max==0)
            System.out.println(-1);
        else
            System.out.println(win);
        sc.close();
    }
}
