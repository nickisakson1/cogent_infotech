package mock_interview;

public class Manager {
	
	public static void main(String[] args) {
		
		Person[] pArray = new Person[10];
		int minAge;
		
		for(int i=0;i<pArray.length;i++){
			pArray[i] = new Person();
			pArray[i].setName("Person "+(i+1));
			pArray[i].setAge((i+15));
		}
		
		minAge = pArray[5].getAge();
		
		for(int i=0;i<pArray.length;i++){
			if(pArray[i].getAge()<minAge) {
				minAge = pArray[i].getAge();
			}
		}
		
		System.out.println("The lowest age is: "+minAge);
	}

}
