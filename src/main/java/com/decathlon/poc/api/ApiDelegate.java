package com.decathlon.poc.api;

import com.nimbusds.jwt.JWT;
import com.nimbusds.jwt.JWTParser;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.ServletWebRequest;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.Optional;

public class ApiDelegate {

    public HttpServletRequest getHttpRequest() {
        final ServletRequestAttributes attrs = (ServletRequestAttributes) RequestContextHolder
                .currentRequestAttributes();
        return attrs.getRequest();
    }

    public Optional<NativeWebRequest> getRequest() {
        return Optional.of(new ServletWebRequest(getHttpRequest()));
    }

    public Optional<String> getAuthorizationHeader() {
        return getRequest().map(r -> r.getHeader("Authorization"));
    }

    public String getUser() throws ParseException {
        JWT jwt = JWTParser.parse(getAuthorizationHeader().orElse("").replace("Bearer ", ""));
        return jwt.getJWTClaimsSet().getSubject();
    }
}
