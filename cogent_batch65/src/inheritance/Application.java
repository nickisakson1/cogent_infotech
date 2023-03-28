package inheritance;

public class Application {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		Address address = new Address();
		address.setHouseNo(245);
		address.setCityName("New York");
		address.setStreetNo(40);
		
		p.setPersonId(1001);
		p.setPersonName("Shiva");
		p.setAddress(address);
		
		System.out.println(p.getPersonId());
		System.out.println(p.getPersonName());
		System.out.println(p.getAddress().getHouseNo());
		System.out.println(p.getAddress().getCityName());
		System.out.println(p.getAddress().getStreetNo());
	}

}
