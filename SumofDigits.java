import java.util.Scanner;

public class SumofDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			int n=num%10;
			sum+=n;
			num=num/10;
		}
		System.out.println("Sum of the Number is : "+sum);
	}
}
