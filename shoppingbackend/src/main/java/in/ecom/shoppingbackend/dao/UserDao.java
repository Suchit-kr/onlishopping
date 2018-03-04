package in.ecom.shoppingbackend.dao;

import in.ecom.shoppingbackend.dto.Address;
import in.ecom.shoppingbackend.dto.Cart;
import in.ecom.shoppingbackend.dto.User;

public interface UserDao {

	public boolean addUser(User user);
	
	public boolean addAddress(Address address);
	
	public boolean addCart(Cart cart);
}
