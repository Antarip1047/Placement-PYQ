import java.util.*;
public class accenture_25 {
    int reverse(int a){
        int r=0;
        while(a!=0){
            r=r*10+a%10;
            a/=10;
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int m=sc.nextInt();
        int n=sc.nextInt();
        sc.close();
        int s=0;
        accenture_25 ob=new accenture_25();
        for(int i=m;i<=n;i++){
            s+=ob.reverse(i);
        }
        System.out.println(s);
    }
}
