
public class Patterns {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		 triangle
		for (int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=5;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		pyramid..
		
		for(int i=5;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
//		diamond..
		
		for(int i=5;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<5;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
