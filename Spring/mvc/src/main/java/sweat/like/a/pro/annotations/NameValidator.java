package sweat.like.a.pro.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<IsValidName, String>{
	
	private String forbiddenWords;
	
	public boolean isValid(String beanProperty, ConstraintValidatorContext context) {
		if(beanProperty == null || beanProperty.matches(this.forbiddenWords))
		return false;
		return true;
	}

	/*
	 * This method takes forbidden words set by user for this validation.
	 * Later it is used by isValid Method to perform the actual validation
	 */
	public void initialize(IsValidName isValidName) {
		this.forbiddenWords = isValidName.forbiddenWords();
	}
}
