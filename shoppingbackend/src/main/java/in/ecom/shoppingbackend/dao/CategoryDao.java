/**
 * 
 */
package in.ecom.shoppingbackend.dao;

import java.util.List;

import in.ecom.shoppingbackend.dto.Category;

/**
 * @author kumasuch
 *
 */
public interface CategoryDao {

	public List<Category> getCategory();

	public Category getCategoryById(int id);
}
