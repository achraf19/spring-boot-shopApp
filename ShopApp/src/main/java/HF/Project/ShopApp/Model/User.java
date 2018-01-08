package HF.Project.ShopApp.Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import HF.Project.ShopApp.Model.Address;

@Document(collection = "users")
public class User {
	@Id
	private Long id;
	private String firtName;
	private String lastName;
	private String email;
	private String password;
	private Address address;
	
	
	public User(String firtName, String lastName, String email, String password, Address address) {
		super();
		
		this.firtName = firtName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.address = address;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirtName() {
		return firtName;
	}


	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
	
}