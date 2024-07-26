import java.util.*;
public class Sorting_String_Array {
	public static void main(String[] args) {
		int [] arr= {7,4,9,3,8,2,1};
		String [] str= {"prasad","raju","Anji","sai","Naga"};
//		Array sorting..
		for(int i=0;i<arr.length;i++) {
			int temp=0;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		for (int k = 0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		
//		String sorting..
		for(int i=0;i<str.length;i++) {
			String temp="";
			for (int j=0;j<str.length-i-1;j++) {
				if(str[j].compareTo(str[j+1])>0) {
					temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
					
				}
			}
		}
		
		for(String ch:str) {
			System.out.print(ch+" ");
		}
	}
}
