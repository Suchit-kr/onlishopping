/**
 * 
 */
package in.ecom.shoppingbackend.dto;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author kumasuch
 *
 */
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "product_sequence")
	@TableGenerator(name = "product_sequence", table = "product_pk_table", pkColumnName = "id", pkColumnValue = "productValue", allocationSize = 1)
	private int id;
	private String code;
	@NotBlank(message = "Please Enter the Product Name")
	private String name;

	@NotBlank(message = "Please Enter the Brand Name")
	private String brand;

	@JsonIgnore
	@NotBlank
	@NotBlank(message = "Please Enter the Product Description")
	@Length(min = 50, max = 500, message = "Length must be in between 50 to 500 character")
	private String description;

	@Min(value = 1, message = "Price cannot be less than 1 ")
	private double unit_price;

	private int quantity;
	private boolean is_active;
	@NotNull
	private int category_id;
	private int supplier_id;
	private int purchases;
	private int views;

	@Transient
	private MultipartFile file;
	
	
	public Product() {
		this.code = "PRD" + UUID.randomUUID().toString().substring(26).toUpperCase();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public int getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}

	public int getPurchases() {
		return purchases;
	}

	public void setPurchases(int purchases) {
		this.purchases = purchases;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

}
