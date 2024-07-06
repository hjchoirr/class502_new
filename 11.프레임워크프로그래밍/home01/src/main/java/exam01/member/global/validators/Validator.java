package exam01.member.global.validators;

import org.springframework.stereotype.Component;

@Component
public interface Validator <T>{
    void check(T form);
}
