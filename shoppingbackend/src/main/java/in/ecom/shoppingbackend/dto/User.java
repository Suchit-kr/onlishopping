/**
 * 
 */
package in.ecom.shoppingbackend.dto;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.validation.constraints.NotNull;

/**
 * @author kumasuch
 *
 */
@Entity
@Table(name = "USER_DETAILS")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/*
	 * @TableGenerator(name = "user_sequence", table = "user_pk_table", pkColumnName
	 * = "id", pkColumnValue = "user_id", allocationSize = 1)
	 */
	private int id;

	@NotNull
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@NotNull
	private String email;

	@NotNull
	private String contactNumber;

	@NotNull
	private String role;

	@NotNull
	private String password;

	@NotNull
	private boolean enabled;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String string) {
		this.contactNumber = string;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public User() {
		super();
	}

}
