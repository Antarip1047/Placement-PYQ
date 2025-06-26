/* 
char*MoveHyphen(char str[],int n);

The function accepts a string “str” of length ‘n’, that contains alphabets and hyphens (-). Implement the function to move all hyphens(-) in the string to the front of the given string.

NOTE:- Return null if str is null.

Example :-

Input:
str.Move-Hyphens-to-Front
Output:
—MoveHyphenstoFront
Explanation:-

The string “Move-Hyphens -to-front” has 3 hyphens (-), which are moved to the front of the string, this output is “— MoveHyphen”

Sample Input

Str: String-Compare
Sample Output-

-StringCompare
*/
import java.util.*;
public class accenture_09 {
    String MoveHyphen(String str,int n){
        String s="";
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='-')
            s=str.charAt(i)+s;
            else
            s=s+str.charAt(i);
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        accenture_09 ob=new accenture_09();
        System.out.println(ob.MoveHyphen(s,s.length()));
        sc.close();
    }
}
