/**
 * 
 */
package in.ecom.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author kumasuch
 *
 */
@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("page");
		model.addObject("title", "Home");
		model.addObject("userClickHome", true);
		return model;
	}
	
	@RequestMapping(value="/about")
	public ModelAndView about() {
		ModelAndView model=new ModelAndView("page");
		model.addObject("title","About-Us");
		model.addObject("userClickAbout",true);
		return model;
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contact() {
		ModelAndView model=new ModelAndView("page");
		model.addObject("title","Contact-Us");
		model.addObject("userClickContactus",true);
		return model;
	}
	
	@RequestMapping(value="/products")
	public ModelAndView viewProducts() {
		ModelAndView model=new ModelAndView("page");
		model.addObject("title","View-Products");
		model.addObject("userClickViewProducts",true);
		return model;
	}

	

}
