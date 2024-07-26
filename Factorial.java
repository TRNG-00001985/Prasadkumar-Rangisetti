import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int factNum=1;
		for (int i=1;i<=n;i++) {
			factNum=i*factNum;
		}
		System.out.println(factNum);
	}

}
