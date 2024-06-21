package org.choongang.global.exceptions;

import jakarta.servlet.http.HttpServletResponse;

public class UnAuthorizedException extends CommonException {
    public UnAuthorizedException() {
        super("접근 권한 없음", HttpServletResponse.SC_UNAUTHORIZED);
    }
}
