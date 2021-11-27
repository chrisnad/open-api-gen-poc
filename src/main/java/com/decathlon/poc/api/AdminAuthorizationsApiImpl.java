package com.decathlon.poc.api;

import com.decathlon.poc.admin.api.AdminAuthorizationsApiDelegate;
import com.decathlon.poc.admin.model.AdminAuthorization;
import org.springframework.http.ResponseEntity;

public class AdminAuthorizationsApiImpl extends ApiDelegate implements AdminAuthorizationsApiDelegate {

    @Override
    public ResponseEntity<AdminAuthorization> getCurrentUserAuthorizations() {
        return AdminAuthorizationsApiDelegate.super.getCurrentUserAuthorizations();
    }

}
