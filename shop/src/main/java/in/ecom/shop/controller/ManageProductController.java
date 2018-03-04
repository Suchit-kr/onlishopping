/**
 * 
 */
package in.ecom.shop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.ws.rs.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import in.ecom.shop.util.FileUploadUtility;
import in.ecom.shoppingbackend.dao.CategoryDao;
import in.ecom.shoppingbackend.dao.ProductDao;
import in.ecom.shoppingbackend.dto.Category;
import in.ecom.shoppingbackend.dto.Product;

/**
 * @author kumasuch
 *
 */

@Controller
@RequestMapping(value = "/manage")
public class ManageProductController {

	private static final Logger logger= LoggerFactory.getLogger(ManageProductController.class);
	
	
	@Autowired
	private CategoryDao categoryDao;

	@Autowired
	private ProductDao productDao;

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public ModelAndView manageProducts(@RequestParam(name = "operation", required = false) String operation,
			@RequestParam(name = "result", required = false) boolean result) {
		
		ModelAndView model = new ModelAndView("page");

		model.addObject("title", "Manage Products");
		model.addObject("userClickManageProducts", true);
		Product newProduct = new Product();
		newProduct.setSupplier_id(1);
		newProduct.setIs_active(true);

		model.addObject("product", newProduct);

		if (operation != null) {
			if (operation.equals("product")) {
				if (result) {
					model.addObject("message", "Product Submission Successfull");
				} else {
					model.addObject("message", "Product Submission Failed");
				}

			}
		}

		return model;

	}

	@RequestMapping(value = "/products", method = RequestMethod.POST)
	@ResponseStatus(code=HttpStatus.CREATED)
	public String handleProductSubmission(@Valid @ModelAttribute("product") Product newproduct, BindingResult bindingResult,
			Model model, HttpServletRequest request) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("title", "Manage Products");
			model.addAttribute("userClickManageProducts", true);
			model.addAttribute("error Message", "Please Enter the correct inputs");

			return "page";
		}

		if(!newproduct.getFile().getOriginalFilename().equals("")) {
			logger.info("Inside File Upload support");
			FileUploadUtility.uploadFile(request,newproduct.getFile(),newproduct.getCode());
		}
		
		
		boolean result = productDao.addProduct(newproduct);

		if (result != false) {
			return "redirect:/manage/products?operation=product&result=true";
		} else {
			return "redirect:/manage/products?operation=product&result=false";
		}
	}

	@ModelAttribute(name = "categories")
	public List<Category> getCategories() {

		return categoryDao.getCategory();
	}
	
	@RequestMapping(value="/json/products")
	@ResponseBody
	public List<Product> getAllProductsJson(){
		return productDao.getActiveProductList();
	}

}
