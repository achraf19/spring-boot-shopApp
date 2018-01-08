package HF.Project.ShopApp.Model;

public class Address {

	private String city;
	private int postalCode;
	private String street;
	
	public Address(String city, int postalCode, String street) {
		super();
		this.city = city;
		this.postalCode = postalCode;
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	
	
	
}
