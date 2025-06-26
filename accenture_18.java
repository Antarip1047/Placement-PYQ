/* 
Ques: The program is supposed to calculate the sum of  distance between three points from each other.

For
x1 = 1 y1 = 1
x2 = 2 y2 = 4
x3 = 3 y3 = 6

Distance is calculated as : sqrt(x2-x1)2 + (y2-y1)2
*/
import java.util.*;
public class accenture_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x3=sc.nextInt();
        int y3=sc.nextInt();
        float z12=(float)Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2));
        float z23=(float)Math.sqrt(Math.pow((y3-y2),2)+Math.pow((x3-x2),2));
        float z31=(float)Math.sqrt(Math.pow((y1-y3),2)+Math.pow((x1-x3),2));
        System.out.println(z12+z23+z31);
        sc.close();
    }
}
