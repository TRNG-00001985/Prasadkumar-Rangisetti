import java.util.*;
public class Array_Average {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of Array:");
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int j=0;j<n;j++) {
			sum+=arr[j];
		}
		float avg=sum/n;
		System.out.println("Average is: "+avg);
	}
}
