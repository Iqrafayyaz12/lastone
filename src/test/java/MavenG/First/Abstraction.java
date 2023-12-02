package MavenG.First;

public  class Abstraction extends Childabstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		Abstraction variab= new Abstraction();
		
		variab.engine();
		variab.enginecolor();
		
	}

	@Override
	public void enginecolor() {
		// TODO Auto-generated method stub
		System.out.print("engine color is blue ");
	}

}
