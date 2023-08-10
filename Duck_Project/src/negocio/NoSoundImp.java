package negocio;
import datos.IQuackable;

public class NoSoundImp implements IQuackable {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("No sound");
	}
	
}
