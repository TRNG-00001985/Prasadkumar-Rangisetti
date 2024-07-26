import java.util.Arrays;

public class FindElementIndex {

	public static void main(String[] args) {
		String []arr= {"Prasad","Ashok","Raju","Mani"};
		String str="PrasadKumar";
		char ch='s';
		int  strIndex=str.indexOf(ch);
		System.out.println("index of "+ch+" is : "+strIndex);
		
		
		String target="Raju";
		int arrIndex=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(target)) {
				arrIndex=i;
				break;
			}
		}
		System.out.println("Index of "+target+" is : "+arrIndex);
		
		int index=Arrays.asList(arr).indexOf("Mani");
		System.out.println("Index is : "+index);
		
		
		
	}

}
