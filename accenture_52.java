/* 
You are given a string S and your task is to find and return the count of permutation formed by fixing the positions of the vowels present in the string.

Note:

• Ensure the result is non-negative

• If there are no consonants then return 0.

Input1:

ABC

Output2:

2
*/
import java.util.Scanner;

public class accenture_52 {
    public static int permutation(String s) {
        int count = 0, perm = 1, tmp = 0;
        int[] al = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') && al[c] == 0) {
                count++;
                al[c] = 1;
            } else if (al[c] != 0) {
                tmp++;
            }
        }
        if (count < 1)
            return 0;
        for (int i = 1; i <= count; i++) {
            perm *= i;
        }
        return perm + tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(permutation(s));
        sc.close();
    }
}
