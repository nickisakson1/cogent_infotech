package cogent.infotech.com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name ="User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@Column(unique=true)
	private String username;
	private String password;
	private String email;
	private String userType;
	
	@OneToMany(cascade= {CascadeType.MERGE, CascadeType.REMOVE}, mappedBy = "aapproved_by")
	@JsonIgnore
	private List<Answer> answersApproved = new ArrayList<>();
	
	@OneToMany(cascade= {CascadeType.MERGE, CascadeType.REMOVE}, mappedBy = "acreated_by")
	@JsonIgnore
	private List<Answer> answersCreated = new ArrayList<>();
	
	@OneToMany(cascade = {CascadeType.MERGE, CascadeType.REMOVE}, mappedBy ="qapproved_by")
	@JsonIgnore
	private List<Question> questionApproved = new ArrayList<>();
	
	@OneToMany(cascade = {CascadeType.MERGE, CascadeType.REMOVE}, mappedBy ="qcreated_by")
	@JsonIgnore
	private List<Question> questionCreated = new ArrayList<>();
	
	public User() {
		super();
	}
	public User(int id, String name, String username, String password, String email, String userType) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.userType = userType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	

}
