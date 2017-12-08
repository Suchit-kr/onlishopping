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
	
	public boolean addCategory(Category category);
	
	public boolean updateCategory(Category category);
	
	public boolean deleteCategory(Category category);
	
	
}
