
public class MaxMinusMin {
	public static void main(String[] args) {
		int []arr= {9,10,2,5,8,3,9};
		int minNum=arr[0];
		int maxNum=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]<minNum) {
				minNum=arr[i];
			}
			if(arr[i]>maxNum) {
				maxNum=arr[i];
			}
		}
		System.out.println("Maximum Minus Minimum  is:"+(maxNum-minNum));
	}
}
