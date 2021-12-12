package com.decathlon.poc.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.context.request.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Slf4j
public class ApiDelegate {

    public HttpServletRequest getHttpRequest() {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        if (requestAttributes instanceof ServletRequestAttributes servletRequestAttributes) {
            return servletRequestAttributes.getRequest();
        }
        log.debug("Not called in the context of an HTTP request");
        return null;
    }

    public Optional<NativeWebRequest> getRequest() {
        return Optional.of(new ServletWebRequest(getHttpRequest()));
    }

    public String getUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        // implement your own logic to get the user
        return authentication == null ? "no auth user" : authentication.getName();
    }

}
