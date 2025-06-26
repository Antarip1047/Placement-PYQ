/* 
Your are given an array A of Ssize N. Your task is to find the maximum length of the subsequence in which the difference of every consecutive element is divisible by k.

Not:
The input array is sorted in ascending order. The length of the subsequence must be greater than 1 and if there is no subsequence satisfying the condition, return -1.

Input format:
The inpur vonsists of two lines:
The first line consists two space seperated integers n and k.
The second line contains n soace-seperated integers denoting the array A

Output format:
Print a number representing the maximum length of the subsequence satisfying the consition

Constraints:
- 1<=N,k<=10^4
- 1<=arr[i]<=10^3

Example:
Input:
2 2
2 4
Output:
2

input:
3 3 
1 1 2
Output:
2
*/
import java.util.Scanner;

public class accenture_40 {
    static int subsequence(int[] a, int n, int k) {
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if ((a[i] - a[j]) % k == 0) {
                    m[i] = Math.max(m[i], m[j] + 1);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, m[i]);
        }
        if (max < 2)
            return -1;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        sc.close();
        System.out.println(subsequence(a, n, k));
    }
}

