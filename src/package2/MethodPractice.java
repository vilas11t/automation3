package package2;

public class MethodPractice {
	
	public static void main(String[] args) {
		
		// ClassName nameofObject=new ClassName();
		// it is a instance of class
		
		MethodPractice obj1=new MethodPractice();
		
		obj1.method1();
		
		System.out.println("statement after method calling");
		
		
		int x=method2(10,15);
		
		System.out.println(x);
		
		
	}
	
	
	 void method1() {
		System.out.println("this is first method");
	}
	 
	static int method2(int a, int b) {
		 int c;
		 c=a+b;
		 return c;
	 }

}
