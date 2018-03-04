/**
 * 
 */
package in.ecom.shoppingbackend.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author kumasuch
 *
 */
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="address_line_1")
	private String address1;
	
	@Column(name="address_line_2")
	private String address2;
	
	private String city;
	
	private String state;
	
	private String country;
	
	@Column(name="pin_code")
	private int pinCode;
	
	private boolean billing;
	
	private boolean shipping;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
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
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public boolean isBilling() {
		return billing;
	}

	public void setBilling(boolean billing) {
		this.billing = billing;
	}

	public boolean isShipping() {
		return shipping;
	}

	public void setShipping(boolean shipping) {
		this.shipping = shipping;
	}

	
	@Override
	public String toString() {
		return "Address [id=" + id + ", user_id=" + user_id + ", address1=" + address1 + ", address2=" + address2
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", pinCode=" + pinCode + ", billing="
				+ billing + ", shipping=" + shipping + "]";
	}

	public Address() {
		super();
	}
	
	
		
}
