package member.validators;

import global.exceptions.ValidationException;

public interface RequiredValidation {
    default void checkRequired(String str, String message) {
        if(str == null || str.isBlank()) {
            throw new ValidationException(message);
        }
    }
}
