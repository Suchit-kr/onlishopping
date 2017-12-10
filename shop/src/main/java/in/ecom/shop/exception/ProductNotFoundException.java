/**
 * 
 */
package in.ecom.shop.exception;

import java.io.Serializable;

/**
 * @author kumasuch
 *
 */
public class ProductNotFoundException extends Exception implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5600458067343013944L;

	private String message;
	
	public String getMessage() {
		return message;
	}

	public ProductNotFoundException() {
		this("Product Not Found");
	}

	public ProductNotFoundException(String message) {
		this.message = System.currentTimeMillis() + " : " + message;

	}

	
}
