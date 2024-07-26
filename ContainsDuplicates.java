import java.util.Arrays;

public class ContainsDuplicates {

	public static void main(String[] args) {
		int []array= {1,2,5,3,7,9,4,1,9,3,2,4};
		boolean hasDuplicates=CheckDuplicates(array);
		System.out.println("Contains Duplicates : "+hasDuplicates);
		
	}
	public static boolean CheckDuplicates(int []arr) {
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]) {
				return true;
			}
		}
		return false;
	}

}
