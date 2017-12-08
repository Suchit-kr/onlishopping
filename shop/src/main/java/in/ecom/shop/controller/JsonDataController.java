/**
 * 
 */
package in.ecom.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import in.ecom.shoppingbackend.dao.ProductDao;
import in.ecom.shoppingbackend.dto.Product;

/**
 * @author kumasuch
 *
 */
@RestController
@RequestMapping(value="/json/data")
public class JsonDataController {
	@Autowired
	private ProductDao productDao;
	

	
	@ResponseBody
	@RequestMapping(value = "/all/products", method = RequestMethod.GET)
	public List<Product> getAllProducts() {

		return productDao.getActiveProductList();
	}
	
	@ResponseBody
	@RequestMapping(value="/category/{id}/products", method=RequestMethod.GET)
	public List<Product> getProductByCategory(@PathVariable("id")int categoryId){
		return productDao.getActiveProductByCategory(categoryId);
	}
	
	


}
