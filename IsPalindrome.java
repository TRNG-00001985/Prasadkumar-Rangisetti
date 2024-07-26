import java.util.*;
public class IsPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String rev="";
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
		}
		System.out.println(rev);
		
		if(str.equals(rev)) {
			System.out.println("Palimdrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
