/**
 * 
 */
package in.ecom.shoppingbackend.dao;

import java.util.List;

import in.ecom.shoppingbackend.dto.Product;

/**
 * @author kumasuch
 *
 */
public interface ProductDao {

	public List<Product> getActiveProductList();
	
	public List<Product> getActiveProductByCategory(int categoryId);

	public Product get(int productId);

}
