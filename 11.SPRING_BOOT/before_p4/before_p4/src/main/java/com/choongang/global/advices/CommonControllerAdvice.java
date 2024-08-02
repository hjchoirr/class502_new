package com.choongang.global.advices;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice("com.choongang")
public class CommonControllerAdvice {

    @ExceptionHandler
    public ModelAndView exception(Exception e){
        ModelAndView mv = new ModelAndView("exception");
        mv.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        mv.addObject("errMsg", e.getMessage());
        mv.setViewName("/front/error/common");
        return mv;
    }
}
