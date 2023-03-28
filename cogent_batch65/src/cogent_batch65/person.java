package cogent_batch65;

public class person {
	
	// data members
	int personId;
	String firstName;
	String lastname;
	String address;
	int age;
	
	// default constructor
	public person() {
		
	}

	// parameterized constructor
	public person(int personId, String firstName, String lastname,
			String address, int age) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.lastname = lastname;
		this.address = address;
		this.age = age;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
