package contact;

public class Contact {

	private String ID;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;
	
	public Contact(String ID, String firstName, String lastName, String phoneNum, String address) {
		if (ID == null || ID.length() > 10) {
			throw new IllegalArgumentException("Input Invalid");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Input Invalid");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Input Invalid");
		}
		if (phoneNum == null || phoneNum.length() != 10) {
			throw new IllegalArgumentException("Input Invalid");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Input Invalid");
		}
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	public final String getID() {
		return ID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public String getAddress() {
		return address;
	}
	public void updateFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void updateLastName(String lastName) {
		this.lastName = lastName;
	}
	public void updatePhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void updateAddress(String address) {
		this.address = address;
	}
}
