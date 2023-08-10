package negocio;
import datos.*;

public class RubberDuck extends Duck{
	private static IFlyable flyable= new NoFlyable();
	private static IQuackable quackable= new SquickImp();
	public RubberDuck() {
		super(flyable,quackable);
	}

}
