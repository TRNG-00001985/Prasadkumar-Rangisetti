
public class WordCount {
	public static void main(String[] args) {
		String str="hi this is prasad kumar Rangisetti";
		if(str==null || str.isEmpty()) {
			System.out.println("0");
		}
		else {
			String [] words=str.trim().split(" ");
			System.out.println(words.length);
		}
		
	}
}
