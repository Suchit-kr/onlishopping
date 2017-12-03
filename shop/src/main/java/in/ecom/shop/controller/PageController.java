/**
 * 
 */
package in.ecom.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		model.addObject("greeting", "Welcome to test Page");
		return model;
	}

	/*@RequestMapping(value = "/test")
	public ModelAndView test(@RequestParam(value="greeting", required=false) String greeting) {
		if(greeting==null) {
			greeting="Hello there";
		}
		ModelAndView model = new ModelAndView("page");
		model.addObject("greeting", greeting);
		return model;
	}*/
	
	@RequestMapping(value = "/test/{greeting}")
	public ModelAndView test(@PathVariable(value="greeting") String greeting) {
		if(greeting==null) {
			greeting="Hello there";
		}
		ModelAndView model = new ModelAndView("page");
		model.addObject("greeting", greeting);
		return model;
	}

}
