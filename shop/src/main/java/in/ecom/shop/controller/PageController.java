/**
 * 
 */
package in.ecom.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ecom.shoppingbackend.dao.CategoryDao;
import in.ecom.shoppingbackend.dao.ProductDao;
import in.ecom.shoppingbackend.dto.Category;
import in.ecom.shoppingbackend.dto.Product;

/**
 * @author kumasuch
 *
 */
@Controller
public class PageController {

	//private static final Logger logger = LoggerFactory.getLogger(PageController.class);

	@Autowired
	private CategoryDao categoryDao;

	@Autowired
	private ProductDao productDao;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("page");

		//logger.info("Inside page controller logger");

		model.addObject("categories", categoryDao.getCategory());
		model.addObject("title", "Home");
		model.addObject("userClickHome", true);
		return model;
	}

	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView model = new ModelAndView("page");
		model.addObject("title", "About-Us");
		model.addObject("userClickAbout", true);
		return model;
	}

	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView model = new ModelAndView("page");
		model.addObject("title", "Contact-Us");
		model.addObject("userClickContactus", true);
		return model;
	}

	@RequestMapping(value = "/show/all/products")
	public ModelAndView getAllProducts() {
		ModelAndView model = new ModelAndView("page");

		model.addObject("title", "Products");
		model.addObject("categories", categoryDao.getCategory());
		model.addObject("userClickViewProducts", true);

		return model;
	}

	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView getAllProductsById(@PathVariable("id") int id) {
		ModelAndView model = new ModelAndView("page");

		Category category = categoryDao.getCategoryById(id);

		model.addObject("title", category.getName());
		model.addObject("categories", categoryDao.getCategory());
		model.addObject("category", category);
		model.addObject("userClickCategoryViewProducts", true);

		return model;
	}

	/*
	 * vIEW sINGLE pRODUCT
	 */

	@RequestMapping(value = "/show/{id}/product")
	public ModelAndView showSingleProduct(@PathVariable("id") int productId) {
		ModelAndView model = new ModelAndView("page");
		Product product = productDao.get(productId);

		model.addObject("title", product.getName());
		model.addObject("product", product);

		model.addObject("userClickCategoryViewSingleProducts", true);

		return model;
	}

}
