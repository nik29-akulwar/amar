package inheritance;

public class hierarchical {

	public static void main(String[] args) 
	{
		
		A a=new A();
		
		a.test();// using object a calling method of A class 
		
		B b=new B();
		b.test();// using object b calling method of A class 
		b.demo();// using object b calling method of B class 
		
		C c=new C();
		c.test();// using object c calling method of A class 
		c.sample();// using object c calling method of C class 
	
				

	}

}
