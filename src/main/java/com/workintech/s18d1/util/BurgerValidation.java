package com.workintech.s18d1.util;

import com.workintech.s18d1.exceptions.BurgerException;
import org.springframework.http.HttpStatus;

public class BurgerValidation {

    public static void checkName(String name){
        if (name == null || name.trim().isEmpty()) {
            throw new BurgerException("Burger name cannot be null", HttpStatus.BAD_REQUEST);
        }
    }

}
