package ge.games.gegames.validation;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = EmailOrPhoneValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EmailOrPhone{
    String message() default "Must be a valid email or phone number";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
