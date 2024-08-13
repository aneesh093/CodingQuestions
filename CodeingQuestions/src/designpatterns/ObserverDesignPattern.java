package designpatterns;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Aneesh.Mathai
 * 
 * Observer Design Pattern is used to determine how the objects are talking to each other 
 * whenever there is an update or changes to object
 */


public class ObserverDesignPattern {

	public static void main(String[] args) {
		
		SubjectImpl subject=new SubjectImpl();
		
		Observer observer1 = new ObserverImpl();
        subject.registerObserver(observer1);
 
        Observer observer2 = new ObserverImpl();
        subject.registerObserver(observer2);
 
        subject.setValue(10);
	}
}

interface Observer{
	public  void update(int val);
}

class ObserverImpl implements Observer{
	@Override
	public void update(int val) {
		System.out.println("Updated Observer");
	}
}

interface Subject{
	public  void setValue(int value);
	public  void registerObserver(Observer ob);
}

class SubjectImpl implements Subject{

	int value;
	List<Observer> list=new ArrayList<>();
	@Override
	public void setValue(int value) {
		this.value=value;
		notifyObserver();
	}

	@Override
	public void registerObserver(Observer ob) {
		list.add(ob);
	}
	
	public void notifyObserver() {
		 for (Observer observer : list) {
	            observer.update(value);
	      }
	}
	
}