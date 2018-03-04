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
public class Cart {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int user_id;
	
	@Column(name="cart_line")
	private int cartLine;
	
	private double total;
	
	
}
