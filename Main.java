
public class Main {

	public static void main(String[] args) {
		int b=4;
		int h=0x11;
		System.out.println("Hello World"+b);
		System.out.println(b>>2);
		System.out.println(b>2?"yes":"No");
		System.out.println(h);
		int a=8;
		
//		Even or Odd using bitwise operators...
		if((a&1)==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
//		Swapping with bitwise..
		int n=4;
		int m=5;
		n=n^m;
		m=n^m;
		n=n^m;
		System.out.println(n+" "+m);
		
//		leap year
		
		int year=2024;
		if(year%4==0 && (year%400==0 ||year%100!=0)) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not Leap Year");
		}
//		prime number..
		
		
		int num=13;
		int count=0;
		for (int i=1;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		System.out.println(count<=1?"Prime":"Not Prime") ;
		
//		fizzBuzz fizz-> 3, buzz->5, fizzBuzz->3&5 and if none ->print number
		
		int fb=15;
		for(int i=1;i<=fb;i++) {
			if(i%3==0 && i%5==0) {
				System.out.print("FizzBuzz ");
			}
			else if(i%5==0) {
				System.out.print("Buzz ");
			} 
			else if(i%3==0) {
				System.out.print("Fizz ");
			}
			else {
				System.out.print(i+" ");
			}
		}

		
	}

}
