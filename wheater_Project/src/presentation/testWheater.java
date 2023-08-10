package presentation;
import business.*;
public class testWheater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WheaterData wheaterData= new WheaterData();
		ObserverImp observer1=new ObserverImp(wheaterData);
		ObserverImp observer2=new ObserverImp(wheaterData);
		ObserverImp observer3=new ObserverImp(wheaterData);
		
		wheaterData.wheaterChange(20.10f, 30.10f, 40.10f);
		wheaterData.wheaterChange(20.20f, 30.20f, 40.20f);
		
	}

}
