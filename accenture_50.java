import java.util.Arrays;
import java.util.Scanner;

public class accenture_50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        sc.close();
        Arrays.sort(a);
        for(int i=1;i<n;i++){
            if(a[i]!=(a[i-1]+1))
                System.out.println(a[i-1]+1);
        }
    }
}
