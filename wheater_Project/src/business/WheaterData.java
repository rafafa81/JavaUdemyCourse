package business;
import Data.*;
import java.util.*;

public class WheaterData implements ISubject {
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WheaterData() {
		observers=new ArrayList();
	}

	@Override
	public void registerObserver(IObserver observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
		
	}

	@Override
	public void removeObserver(IObserver observer) {
		// TODO Auto-generated method stub
		int x = observers.indexOf(observer);
		if (x>=0) {
			observers.remove(x);
		}
	}

	@Override
	public void updateObsevers() {
		// TODO Auto-generated method stub
		for(int x=0; x<observers.size();x++) {
			IObserver observerLocal = (ObserverImp) observers.get(x);
			observerLocal.update(temperature,humidity,pressure);
		}
	}
	 
	
	public void wheaterChange(float temperature, float humidity, float pressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		updateObsevers();
	}
}
