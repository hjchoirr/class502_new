package org.choongang.global.validators;


public interface RequiredValidator {
    default void checkRequired(String str, RuntimeException e) {
        if(str == null || str.equals(" ")) {
            throw e;
        }
    }
    default void checkTrue(boolean bool, RuntimeException e) {
        if(!bool) {
            throw e;
        }
    }
}
