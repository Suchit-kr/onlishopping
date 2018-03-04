package in.ecom.shoppingbackendTest.dto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import in.ecom.shoppingbackend.dao.CategoryDao;
import in.ecom.shoppingbackend.dto.Category;

@ContextConfiguration()
public class CategoryTest {

	@Autowired
	private static AnnotationConfigApplicationContext context;

	@Autowired
	private static CategoryDao categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("in.ecom.shoppingbackend");
		context.refresh();

		categoryDAO = (CategoryDao) context.getBean("categoryDao");
	}

	@Test
	public void testAddCategory() {

		category = new Category();
		category.setName("Television");
		category.setImageUrl("TV Images");
		category.setDescription("Description for TV's");

		assertEquals("Successfully added a category to Category table inside database", true,
				categoryDAO.addCategory(category));

	}

	@Test
	public void testGetCategory() {
		System.out.println(context.getBean("sessionFactory"));
		assertEquals(1, categoryDAO.getCategory().size());
	}

	@Test
	public void testgetCategoryById() {

		category = categoryDAO.getCategoryById(1);

		assertEquals("Successfully get a category using ID from Category table", "Television", category.getName());
	}

	@Test
	public void testUpdateCategory() {
		Category category = new Category();
		category.setId(1);
		category.setName("Mobile");
		category.setDescription("Description for Mobile");

		assertTrue("Successfully tested Update Category Method", categoryDAO.updateCategory(category));
	}

	@Test
	public void testDeleteCategory() {
		category = categoryDAO.getCategoryById(1);
		assertTrue(categoryDAO.deleteCategory(category));
	}

	@AfterClass
	public static void destroy() {
		context.close();
	}
}
