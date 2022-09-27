package inheritance;

public class singlelevelinheritance {

	public static void main(String[] args) 
	{
		mother m=new mother();
		
		son s=new son();
		 
		m.nature();// using mothers object calling mother method
		
		mother.look();// mother calling its own static method
		
		s.mobile();// using sons object calling sons method 
		
		son.laptop(); //son calling its own static mathod
		
		s.nature();// using sons object calling mothers method 
		
		son.look();// son calling mothers static method
		
		

	}

}
