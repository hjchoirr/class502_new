package org.choongang.global.advices;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.choongang.global.exceptions.CommonException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@ControllerAdvice("org.choongang")
public class CommonControllerAdvice {

    @ExceptionHandler(Exception.class)
    public ModelAndView exception(Exception e, HttpServletRequest request) {
        log.info("Advice 에서 유입");

        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

        if(e instanceof CommonException commonException) {
            status = commonException.getStatus();
        }
        ModelAndView mv = new ModelAndView();
        mv.setStatus(status);
        mv.setViewName("error/common");

        return mv;
    }
}
