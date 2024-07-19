package org.choongang.global;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class Utils {

    private final MessageSource messageSource;
    private final HttpServletRequest request;

    public Map<String, List<String>> getErrorMessages(Errors errors) {
        System.out.println("---------------------------");
        errors.getFieldErrors().forEach(a -> System.out.println("** a.getField()=" + a.getField() + "|a.getCode()=" + a.getCode()
        + "|a.getRejectedValue()=" + a.getRejectedValue() + "|a.getDefaultMessage()=" + a.getDefaultMessage() + "|a.getClass().getName()=" + a.getClass().getName()
                + "|--getCodeMessages(a.getCodes()=" + getCodeMessages(a.getCodes())
        ));
        System.out.println("---------------------------");
        errors.getGlobalErrors().forEach(a-> System.out.println("#**# a.getCode()=" + a.getCode() + " a.getDefaultMessage()=" + a.getDefaultMessage()
        + " a.getObjectName()=" + a.getObjectName() + " getCodeMessages(a.getCodes())=" + getCodeMessages(a.getCodes())));

        // FieldErrors
        Map<String, List<String>> messages = errors.getFieldErrors()
                .stream()
                .collect(Collectors.toMap(FieldError::getField, e -> getCodeMessages(e.getCodes())));

        // GlobalErrors
        List<String> gMessages = errors.getGlobalErrors()
                .stream()
                .flatMap(e -> getCodeMessages(e.getCodes()).stream()).toList();

        if (!gMessages.isEmpty()) {
            messages.put("global", gMessages);
        }
        return messages;
    }


    public List<String> getCodeMessages(String[] codes) {
        ResourceBundleMessageSource ms = (ResourceBundleMessageSource) messageSource;
        ms.setUseCodeAsDefaultMessage(false);

        List<String> messages = Arrays.stream(codes)
                .map(c -> {
                    try {
                        return ms.getMessage(c, null, request.getLocale());
                    } catch (Exception e) {
                        return "";
                    }
                })
                .filter(s -> !s.isBlank())
                .toList();

        ms.setUseCodeAsDefaultMessage(true);
        return messages;
    }
}