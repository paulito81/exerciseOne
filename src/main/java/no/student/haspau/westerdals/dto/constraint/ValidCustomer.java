package no.student.haspau.westerdals.dto.constraint;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Paul on 29.01.2016.
 */
@Constraint(validatedBy = CustomerValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidCustomer {
    String message() default "Invalid Customer";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
