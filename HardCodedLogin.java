import java.util.Scanner;

public class HardCodedLogin {
	private static final String userName="admin";
	private static final String password="admin123";
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean login=false;
		do {
			System.out.println("welcome to Login");
			System.out.println("1. Login");
			System.out.println("2. Exit");
			System.out.println("Choose an Option");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter User Name : ");
				String username=sc.next();
				System.out.println("Enter Password : ");
				String psw=sc.next();
				if(userName.equals(username) && password.equals(psw)) {
					System.out.println("Login Successful..");
					login=true;
				}else {
					System.out.println("Invalid Login Details..");
					
				}
				break;
			case 2:
				System.out.println("Exiting..");
				return;
			default:
				System.out.println("Enter Valid Option..");
				return;
			}
			
		}while(!login);

	}

}
