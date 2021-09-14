package spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEmail {
    public String value() default "xxxx.com";
    public String message() default "email's ending must be xxxx.com";

    public Class <?>[] groups()default {};
    public Class<?extends Payload>[] payload() default {};

}
