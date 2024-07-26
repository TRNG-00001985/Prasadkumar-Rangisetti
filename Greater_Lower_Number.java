import java.util.*;
public class Greater_Lower_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println(a+" is greatest number");
			if(b<c) {
				System.out.println(b+" b is Lowest Number");
			}
			else {
				System.out.println(c+" is Lowest Number");
			}
		}
		else if(b>a && b>c) {
			System.out.println(b+ " is greatest Number");
			if(a<c) {
				System.out.println(a+"  is Lowest Number");
			}
			else {
				System.out.println(c+" is Lowest Number");
			}
		}
		else {
			System.out.println(c+" is greatest Number");
			if(b<a) {
				System.out.println(b+" b is Lowest Number");
			}
			else {
				System.out.println(a+" is Lowest Number");
			}
		}


	}

}
