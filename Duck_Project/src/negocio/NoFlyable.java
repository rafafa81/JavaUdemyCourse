package negocio;
import datos.IFlyable;

public class NoFlyable implements IFlyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("no vuelo");
	}

}
