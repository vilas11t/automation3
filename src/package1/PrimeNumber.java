package package1;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=13;
		// 2   - n-1   
		int t=0;
		
		for (int i = 2; i <=n-1 ; i++) {
			if(n%i==0) {
				t=1;
				break;
			}
				
		}
		
		if(t==1) {
			System.out.println(n+" is not prime no");
		}
		else
			System.out.println(n+ " is prime no");
	}

}
