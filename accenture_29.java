/* 
Favourite Number of Rohan

Rohan enjoys mathematics and has a few favourite numbers. Therefore, Rohan prefers positive integers whose sole lucky digits in the decimal notation are 4 anf 7. For instance, lucky numbers are 47,744,4, where unlucky numbers are 5,17,467. If a number can be divided evenly by a lucky number, Rohan considers it to be almost lucky.


*/
import java.util.Scanner;

public class accenture_29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={4,7,44,47,74,77,444,447,474,477,744,747,774,777};
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<a.length;i++){
            if(n%a[i]==0){
                System.out.println("Almost lucky");
                break;
            }
        }
    }
}
