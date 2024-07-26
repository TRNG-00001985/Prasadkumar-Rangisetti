import java.util.Arrays;
public class ArraysEquality {
	public static void main(String[] args) {
		int []arr1= {1,5,3,6,2};
		int []arr2= {1,3,4,2,6};
		int [][]mulArr1= {{1,2,3},{4,5,6}};
		int [][]mulArr2= {{1,2,3},{4,5,6}};	
		if(Arrays.equals(arr1,arr2)) {
			System.out.println("Arrays are Equal");
		}
		else {
			System.out.println("Arrays are Not Equal");
		}
		if(Arrays.deepEquals(mulArr1, mulArr2))
			System.out.println("2D Arrays are Equal");
		else
			System.out.println("2D Arrays are Not Equal");
	}
}
