import java.util.ArrayList;
import java.util.Scanner;

public class cts_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]<a[j+1]){
                    a[j]=a[j]^a[j+1];
                    a[j+1]=a[j]^a[j+1];
                    a[j]=a[j]^a[j+1];
                }
            }
        }
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1])
                l.add(a[i]);
        }
        if((l.get(l.size()-1))>a[n-1])
            l.add(a[n-1]);
        for(int i:l){
            System.out.print(i);
        }
        System.out.println(l.get(k-1));
    }
}
