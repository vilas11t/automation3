package package1;

public class Palindrome {
	public static void main(String[] args) {
		
		int n=123;
		int a=n;
		int rev=0;
		
		while(n>0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;		
			
		}
		
		if(rev==a)
			System.out.println(a +" is palindrome no");
		else
			System.out.println(a+ " is not palindrome no");
	}

}
