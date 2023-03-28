package inheritance;

import cogent_batch65.Car;
import cogent_batch65.SportCar;

public class MethodOverridingDemo {

	public static void main(String[] args) {
		Person p = new Person();
		
		p.behavior();
		
		p = new Parent();
		
		p.behavior();
		
		p = new Children();
		
		p.behavior();
		
		p = new Colleague();
		
		p.behavior();
		
	}
}
