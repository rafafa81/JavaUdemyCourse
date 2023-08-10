package business;
import Data.*;

public class ObserverImp implements IObserver{
	ISubject wheaterData;
	private static int idObserver;
	private int id;
	public ObserverImp(ISubject wheaterData) {
		this.id=++ObserverImp.idObserver;
		this.wheaterData=wheaterData;
		wheaterData.registerObserver(this);
	}
	@Override
	public void update(float temperature,float humidity,float pressure) {
		// TODO Auto-generated method stub
		System.out.println("tuvimos un cambio en observer: "+this.id);
		System.out.println(""+temperature);
		System.out.println(""+humidity);
		System.out.println(""+pressure);
	}

}
