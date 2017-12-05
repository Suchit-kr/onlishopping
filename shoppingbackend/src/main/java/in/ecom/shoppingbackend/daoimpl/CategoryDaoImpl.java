/**
 * 
 */
package in.ecom.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import in.ecom.shoppingbackend.dao.CategoryDao;
import in.ecom.shoppingbackend.dto.Category;

/**
 * @author kumasuch
 *
 */
@Repository
public class CategoryDaoImpl implements CategoryDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see in.ecom.shoppingbackend.dao.CategoryDao#getCategory()
	 */

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Television");
		category1.setImageUrl("TV Images");
		category1.setDescription("Description for TV's");
		categories.add(category1);

		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Mobile");
		category2.setImageUrl("Mobile Images");
		category2.setDescription("Description for Mobile");
		categories.add(category2);

		Category category3 = new Category();
		category3.setId(3);
		category3.setName("Laptop");
		category3.setImageUrl("Laptop Images");
		category3.setDescription("Description for Laptop");
		categories.add(category3);

	}

	@Override
	public List<Category> getCategory() {
		return categories;

	}

	@Override
	public Category getCategoryById(int id) {
		for (Category category : categories) {
			if (category.getId() == id)
				return category;
		}
		return null;
	}

}
