package in.ecom.shoppingbackend.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.ecom.shoppingbackend.dao.UserDao;
import in.ecom.shoppingbackend.dto.Address;
import in.ecom.shoppingbackend.dto.Cart;
import in.ecom.shoppingbackend.dto.User;

@Repository("user_dao")
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean addUser(User user) {
		try {
			sessionFactory.openSession().save(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		// return false;
	}

	@Override
	public boolean addAddress(Address address) {
		try {
			sessionFactory.getCurrentSession().save(address);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean addCart(Cart cart) {

		try {
			sessionFactory.getCurrentSession().save(cart);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;	
		}
	}

}
