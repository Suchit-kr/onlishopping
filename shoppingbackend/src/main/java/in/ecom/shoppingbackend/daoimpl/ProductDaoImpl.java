/**
 * 
 */
package in.ecom.shoppingbackend.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.ecom.shoppingbackend.dao.ProductDao;
import in.ecom.shoppingbackend.dto.Product;

/**
 * @author kumasuch
 *
 */
@Repository(value = "productDao")
@Transactional
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * (non-Javadoc)
	 * 
	 * @see in.ecom.shoppingbackend.dao.ProductDao#getProductList()
	 */

	@Override
	public List<Product> getActiveProductList() {
		String hql = "from Product where is_active = :active";
		Session session = sessionFactory.openSession();
		try {

			@SuppressWarnings("unchecked")
			Query<Product> query = session.createQuery(hql);

			query.setParameter("active", true);

			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();

		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getActiveProductByCategory(int categoryId) {
		String hql = "FROM Product where is_active = :active AND category_id= :id";

		return sessionFactory.getCurrentSession().createQuery(hql).setParameter("active", true)
				.setParameter("id", categoryId).getResultList();

	}

	@Override
	public Product get(int productId) {
		String hql = "FROM Product where id= :productId";
		return (Product) sessionFactory.getCurrentSession().createQuery(hql).setParameter("productId", productId)
				.getSingleResult();
	}

	@Override
	public boolean addProduct(Product product) {
		try {
			sessionFactory.getCurrentSession().save(product);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}
