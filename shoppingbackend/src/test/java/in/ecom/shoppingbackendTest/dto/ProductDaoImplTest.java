/**
 * 
 */
package in.ecom.shoppingbackendTest.dto;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ecom.shoppingbackend.dao.ProductDao;


/**
 * @author kumasuch
 *
 */
public class ProductDaoImplTest {

	@Autowired
	private static AnnotationConfigApplicationContext context;

	@Autowired
	private static ProductDao productDAO;

	//private Product product;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("in.ecom.shoppingbackend");
		context.refresh();

		productDAO = (ProductDao) context.getBean("productDao");
	}
	
	
	@Test
	public void testGetProduct() {
		assertEquals("Get Product Test successfully completed", 5, productDAO.getActiveProductList().size());
	}
	

	
	@Test
	public void testGetProductByCategory() {
		assertEquals("Get Product by category successfull",2, productDAO.getActiveProductByCategory(1).size());
		assertEquals("Get Product by category successfull",0, productDAO.getActiveProductByCategory(2).size());
		assertEquals("Get Product by category successfull",3, productDAO.getActiveProductByCategory(3).size());
	}
	
	
	@Test
	public void testGet() {
		assertEquals("samsung", productDAO.get(2).getBrand());
	}

}

