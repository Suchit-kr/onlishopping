/*package in.ecom.shoppingbackend.validator;

import java.math.BigInteger;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MobileValidator implements ConstraintValidator<isValidMobile, BigInteger> {

	BigInteger validMobile = new BigInteger("9999999999");
 
	@Override
	public void initialize(isValidMobile isValidMobile) {
		
	}
	
	@Override
	public boolean isValid(BigInteger mobileNumber, ConstraintValidatorContext ctx) {
		int result = mobileNumber.compareTo(validMobile);
		if (mobileNumber != null)
			if (result == 1 || result == 0)
				return true;
		return false;
	}

}
*/