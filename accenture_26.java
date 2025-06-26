/* 
Rock, Paper, Scissors
Two players A and B, are playing the game of Rock, Paper, Scissors. Player A chooses a move represented by a string value M; and the move can be one of the following 'rock', 'paper', or 'scissors' where.

-rock beats scissors
-scissors beats paper
-paper beats rock

your task is to find and return a string value representing the wining move for player B.

output is case sensitive

input 
*/
import java.util.*;
public class accenture_26 {
    static String check(String M){
        if(M.equals("rock"))
        return "paper";
        else if(M.equals("paper"))
        return "scissor";
        else
        return "rock";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String M=sc.nextLine();
        sc.close();
        System.out.println(check(M));
    }
}
