package com.nicholas.backstage.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyConstraintValidator implements ConstraintValidator<MyConstraint,Object> {

    @Override
    public void initialize(MyConstraint constraintAnnotation) {
        System.out.println("初始化");
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {

        return false;
    }
}
