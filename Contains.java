import java.util.Scanner;
public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String str=" Prasad kumar";
		String val=sc.next();
		boolean check=str.contains(val);
		System.out.println(str);
		System.out.println(check);
		System.out.println(str.isEmpty());
		System.out.println(str.trim());
		
	}


}
