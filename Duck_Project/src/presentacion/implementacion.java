package presentacion;
import negocio.*;

public class implementacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuackableImp sonidoNvo = new QuackableImp();
		FlyableImp yaVuelo = new FlyableImp();
		RubberDuck plastico = new RubberDuck();
		plastico.sound();
		plastico.move();
		plastico.setMove(yaVuelo);
		plastico.setSound(sonidoNvo);
		plastico.sound();
		plastico.move();
	}

}
