import java.util.Scanner;

public class MostCommonCharacter {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str=sc.next();
		char commanChar=RepeatedChar(str);
		System.out.println("Most Common Character : "+commanChar);
	}
	public static char RepeatedChar(String str) {
		int []charCounts=new int[256];
		for (int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			charCounts[c]++;
		}
		char mostCommonchar=' ';
		int maxCount=0;
		for(int i=0;i<charCounts.length;i++) {
			if(charCounts[i]>maxCount) {
				maxCount=charCounts[i];
				mostCommonchar=(char) i;
			}
		}
		return mostCommonchar ;
	}
}
