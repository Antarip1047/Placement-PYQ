/* 
Superior Element

Wap to find superior element in an array.
A superior element is an element in array which is greater than all the elemenths on its right hand side in the array
The right-most element is also a superior element.

Create a function,
int Find_Number_of_Superior_Element(int arr[],int n)

Example:
input:
6
8 10 6 2 9 7
Output:
3
*/
import java.util.Scanner;

public class accenture_37 {
    static int Find_Number_of_Superior_Element(int arr[],int n){
        int c = 0;
        int maxFromRight = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                c++;
                maxFromRight = arr[i];
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++)
            a[i]=sc.nextInt();
        sc.close();
        System.out.println(Find_Number_of_Superior_Element(a, n));
    }
}
