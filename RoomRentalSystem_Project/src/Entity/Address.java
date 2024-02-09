package Entity;

public class Address {
	private String houseno;
	private String Streetname;
	private int pincode;
	
	public Address(String houseno, String streetname, int pincode) {
		super();
		this.houseno = houseno;
		Streetname = streetname;
		this.pincode = pincode;
	}
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public String getStreetname() {
		return Streetname;
	}
	public void setStreetname(String streetname) {
		Streetname = streetname;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", Streetname=" + Streetname + ", pincode=" + pincode + "]";
	}
	
}
