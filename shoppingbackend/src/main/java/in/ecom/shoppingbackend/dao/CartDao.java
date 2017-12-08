package in.ecom.shoppingbackend.dao;

public interface CartDao {

	public void addProducttoCart(int productId);
	
	public void deleteProductFromCart(int productId);
	
	public void updateCart(); 
	
}
