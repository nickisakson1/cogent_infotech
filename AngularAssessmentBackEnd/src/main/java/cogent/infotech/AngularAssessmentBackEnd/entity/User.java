package cogent.infotech.AngularAssessmentBackEnd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long userId;
	private String userName;
	private long userAge;
	private long userSalary;
	private boolean showForm;
	
	public User() {
		
	}

	public User(String userName, long userAge, long userSalary, boolean showForm) {
		super();
		this.userName = userName;
		this.userAge = userAge;
		this.userSalary = userSalary;
		this.showForm = showForm;
	}
	
	public User(String userName, long userAge, long userSalary) {
		super();
		this.userName = userName;
		this.userAge = userAge;
		this.userSalary = userSalary;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getUserAge() {
		return userAge;
	}

	public void setUserAge(long userAge) {
		this.userAge = userAge;
	}

	public long getUserSalary() {
		return userSalary;
	}

	public void setUserSalary(long userSalary) {
		this.userSalary = userSalary;
	}
	
	public boolean getShowForm() {
		return showForm;
	}

	public void setShowForm(boolean showForm) {
		this.showForm = showForm;
	}
	
}
