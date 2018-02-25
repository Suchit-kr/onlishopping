/**
 * 
 */
package in.ecom.shop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * @author kumasuch
 *
 */

@ControllerAdvice
public class GlobalExceptionHandler {

	@ResponseStatus(code=HttpStatus.NOT_FOUND)
	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView noExceptionHandlerFound() {
		ModelAndView model = new ModelAndView("error");

		model.addObject("errorTitle", "The Page not constructed");

		model.addObject("errorDescription", "The Page you requested is not available");

		model.addObject("title", "Error Page");
		
		return model;
	}
	
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	@ExceptionHandler(ProductNotFoundException.class)
	public ModelAndView handlerProductNotFoundException() {
		ModelAndView model = new ModelAndView("error");

		model.addObject("errorTitle", "Product Not available");

		model.addObject("errorDescription", "The Product you are looking for is not available, Please choose the correct product");

		model.addObject("title", "Product Unavailable");
		
		return model;
	}
}
