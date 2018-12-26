package abst;

public class Abstc extends Abstra{

	@Override
	public void saving() {
	System.out.println("10%");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit() {
	System.out.println("20%");
		// TODO Auto-generated method stub
		
	}
public static void main(String[] args) {
	Abstc pa=new Abstc();
	pa.saving();
	pa.deposit();
	pa.fixed();		
}
}
