import java.util.Scanner;

public class accenture_43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        String ans="";int i=0;
	    for(i=0;i<s.length();i++){
	        if(s.charAt(i)>=97 && s.charAt(i)<=122){
	            ans=ans+((char)(s.charAt(i)-32));
	        }
	        else
	            break;
	    }
	
	    for(int j=i;j<s.length();j++){
	        if(s.charAt(j)>=65 && s.charAt(j)<=90){
	            System.out.println(ans);
	            ans="";
	            ans=ans+((char)(s.charAt(j)+32));
	        }
	        else{
	            ans+=((char)(s.charAt(j)-32));
	        }
	    }
	    System.out.println(ans);
    }
}
