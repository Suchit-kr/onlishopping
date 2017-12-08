/**
 * 
 */
package in.ecom.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kumasuch
 *
 */
@Controller
public class CartController {

	
	@RequestMapping(value="/cart/add/{id}/product")
	public void addProductToCart(@PathVariable("id") String productId) {
		
		
		
	}
}
