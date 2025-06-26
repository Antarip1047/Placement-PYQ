/* 
A number is called happy number if it leads to 1 after a sequence of steps wherein each step number is replaced by the sum of squares of its digits trhat is if we start with Happy number and keep replacing digitts square sum, we reach 1.

examples:

input: m=19
output:  True
19 is a happy number
1^2+9^2=82
8^2+2^2=68
6^2+8^2=100
1^2+0^2+0^2=1
as we reached to 1, 19 is a happy number
*/
import java.util.Scanner;

public class accenture_30 {
    static String happy(int n){
        int m=n;
        while(m>9){
            int s=0;
            while(m>0){
                int d=m%10;
                s+=(int)Math.pow(d, 2);
                m/=10;
            }
            if(s==1)
            return "True";
            else
            m=s;
        }
        if(m==1)
        return "True";
        else
        return "False";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.println(happy(n));
    }
}
