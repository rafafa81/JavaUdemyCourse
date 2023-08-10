package datos;

public class Duck {
	private IFlyable flyable;
	private IQuackable quackable;
	
	public Duck(IFlyable flyable,IQuackable quackable) {
		this.flyable=flyable;
		this.quackable=quackable;
	}
	public void move() {
		this.flyable.fly();
	}
	public void sound() {
		this.quackable.quack();
	}
	public void setSound(IQuackable quackable ) {
		this.quackable=quackable;
	}
	public void setMove(IFlyable flyable) {
		this.flyable=flyable;
	}
}
