
public class Address {
	//Erica Manning
	private String houseNumber;
	private String street;
	private String apartmentNumber;
	private String city;
	private String state;
	private String postalCode;
	
	public Address(String houseNumber, String street, String apartmentNumber, String city, String state, String postalCode) {
		setHouseNumber(houseNumber);
		setStreet(street);
		setApartmentNumber(apartmentNumber);
		setCity(city);
		setState(state);
		setPostalCode(postalCode);
		
		if (getState() == null || getPostalCode() == null) {
			throw new IllegalArgumentException("This address was not added");
		}
	}
	
	public Address(String houseNumber, String street, String city, String state, String postalCode) {
		setHouseNumber(houseNumber);
		setStreet(street);
		setCity(city);
		setState(state);
		setPostalCode(postalCode);
		
		if (getState() == null || getPostalCode() == null) {
			throw new IllegalArgumentException("This address was not added");
		}
	}
	
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getApartmentNumber() {
		return apartmentNumber;
	}
	public void setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		if (state.length() == 2) {
			this.state = state;
		}
		else {
			this.state = null;
		}
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		if (postalCode.length() == 5) {
			this.postalCode = postalCode;
		}
		else {
			this.postalCode = null;
		}
	}
	
	public void print() {
		String houseNumber = this.getHouseNumber();
		String street = this.getStreet();
		String apartmentNumber = this.getApartmentNumber();
		String city = this.getCity();
		String state = this.getState();
		String postalCode = this.getPostalCode();
		
		if (apartmentNumber == null) {
			System.out.println(houseNumber + " " + street);
			System.out.println(city + ", " + state + " " + postalCode);
		}
		else {
			System.out.println(houseNumber + " " + street + " " + apartmentNumber);
			System.out.println(city + ", " + state + " " + postalCode);
		}
	}
	
	
}
