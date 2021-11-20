package package2;

public class MethodPractice2 {
   static int c;  // class per copy
   int a;
   float b;
	
	public static void main(String[] args) {
		int a=10;
		
		MethodPractice2 obj1=new MethodPractice2();
		MethodPractice2 obj2=new MethodPractice2();
		MethodPractice2 obj3=new MethodPractice2();
		obj1.c=30;
		obj2.c=40;
		
		
		obj1.a=10;
		obj2.a=20;
		obj3.a=30;
		
		
		
		
		System.out.println(a);
		
		System.out.println(obj2.a);
		
		
		
		
		
	}
	
	void method1() {
		int b=10;
		int c=b*b;
		System.out.println(c);
	}
	
	void methdo3() {
		System.out.println();
	}
	
	

}
