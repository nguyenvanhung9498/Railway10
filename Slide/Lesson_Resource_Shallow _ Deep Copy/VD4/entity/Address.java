package entity;

public class Address {

	private String street;
	private String city;

	public Address(String street, String city) {
		this.street = street;
		this.city = city;
	}

	public Address(Address otherAddress) {
		this.street = otherAddress.street;
		this.city = otherAddress.city;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		String result = "\nStreet: " + street + "\n";
		result += "City: " + city;
		return result;
	}
}
