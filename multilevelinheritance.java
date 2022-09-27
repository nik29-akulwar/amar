package inheritance;

public class multilevelinheritance {

	public static void main(String[] args) 
	{
		son s=new son();// created object for son class
		
		s.receipe();//using sons object calling grandmothers method
		s.nature();//using sons object calling mothers method
		s.mobile();//using sons object calling sons(own) method
		
		//calling static method
		
		son.stories();//using sons class calling grandmothers static method
		son.look();//using sons class calling mothers static method
		son.laptop();//using sons class calling sons (own) static method
		
		grandmother g=new grandmother();
		
		g.stories();
		g.receipe();
		
		

	}

}
