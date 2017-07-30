package sweat.like.a.pro.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy=NameValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface IsValidName {
	
	String message() default "You cannot use forbidden words";
	
	Class<?>[] groups() default {};
	
	String forbiddenWords();

	Class<? extends Payload>[] payload() default {};

	
}
