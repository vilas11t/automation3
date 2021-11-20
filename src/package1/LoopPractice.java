package package1;

public class LoopPractice {
	
	// 
	
	public static void main(String[] args) {
		
		int a=183;   //8
		int sum=0;
		int r;
		int n=a;
		
		while(a>0) {
		r=a%10;
		sum=sum+r*r*r;
		a=a/10;
		}
		
		
		
		System.out.println("sum of digits="+sum);
		
				
	}
	
}

