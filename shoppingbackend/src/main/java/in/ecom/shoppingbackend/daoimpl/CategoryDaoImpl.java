/**
 * 
 */
package in.ecom.shoppingbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.ecom.shoppingbackend.dao.CategoryDao;
import in.ecom.shoppingbackend.dto.Category;

/**
 * @author kumasuch
 * Category Dao File to work with Category related Dao Data
 */
@Repository(value = "categoryDao")
@Transactional
public class CategoryDaoImpl implements CategoryDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see in.ecom.shoppingbackend.dao.CategoryDao#getCategory()
	 */

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Category> getCategory() {

		String hql = "FROM Category where active = :active";

		Query<Category> query = sessionFactory.getCurrentSession().createQuery(hql);

		query.setParameter("active", true);

		return query.getResultList();

	}

	/*
	 * Get single category using category id
	 * 
	 * @see in.ecom.shoppingbackend.dao.CategoryDao#getCategoryById(int)
	 */
	@Override
	public Category getCategoryById(int id) {

		return sessionFactory.getCurrentSession().get(Category.class, id);
	}

	@Override
	public boolean addCategory(Category category) {
		try {
			sessionFactory.getCurrentSession().persist(category);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean updateCategory(Category category) {
		try {

			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean deleteCategory(Category category) {
		category.setActive(false);
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}
