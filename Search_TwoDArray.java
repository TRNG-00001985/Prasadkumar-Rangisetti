import java.util.*;
public class Search_TwoDArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][]array= {{1,2,3,4},{7,6,9,5}};
		int ele=sc.nextInt();
		boolean found=false;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if(ele==array[i][j]) {
					System.out.println("Element Found: "+array[i][j]);
					found=true;
					break;
				}
				}
			if(found)
				break;
			}
		if(!found) {
			System.out.println("Not Found");
		}
	}

}
