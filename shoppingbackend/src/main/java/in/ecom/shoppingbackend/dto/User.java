/**
 * 
 *//*
package in.ecom.shoppingbackend.dto;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.validation.constraints.NotNull;

import in.ecom.shoppingbackend.validator.isValidMobile;

*//**
 * @author kumasuch
 *
 *//*
@Entity
@Table(name = "USER_DETAILS")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "user_sequence")
	@TableGenerator(name = "user_sequence", table = "user_pk_table", pkColumnName = "id", pkColumnValue = "user_id", allocationSize = 1)
	private int uID;
	
	@NotNull
	private String uName;
	
	@NotNull
	private String uPassword;
	
	@NotNull
	private String uEmail;
	
	@NotNull
	@isValidMobile
	private BigInteger uMobile;

	public int getuID() {
		return uID;
	}

	public void setuID(int uID) {
		this.uID = uID;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public  BigInteger getuMobile() {
		return uMobile;
	}

	public void setuMobile(BigInteger uMobile) {
		this.uMobile = uMobile;
	}

	public User() {
		super();
	}

}
*/