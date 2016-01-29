package no.student.haspau.westerdals.dto.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

/**
 * Created by Paul on 29.01.2016.
 */
public class CustomerValidator implements ConstraintValidator<ValidCustomer, LocalDate> {

    @Override
    public void initialize(ValidCustomer validCustomer) {

    }

    @Override
    public boolean isValid(LocalDate age, ConstraintValidatorContext constraintValidatorContext) {

        if (age == null)
            System.out.println("Age is not set");
            return false;


    }

}

