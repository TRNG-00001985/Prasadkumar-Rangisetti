import java.util.*;

public class SubArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr= {1,2,3,4,5,6,7,8,9,0,0,9,8,7,6,5,4,3,2,1};
		int start=sc.nextInt();
		int end=sc.nextInt();
		int []subArray=Arrays.copyOfRange(arr,start,end);
		for(int i:subArray) {
			System.out.print(i+" ");
		}
		
		
		
	}

}
