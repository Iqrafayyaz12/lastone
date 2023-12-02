package MavenG.First;
class bird
{
    public void color()
    {
    	System.out.println("Bird color is white");
    }
    
}
    class robin extends bird {
    	
    	  public void fun()
    {
    	System.out.println("class 2");

    }
}





public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//bird var= new bird();
		robin var2= new robin();
		var2.color();
		var2.fun();
	}

}
