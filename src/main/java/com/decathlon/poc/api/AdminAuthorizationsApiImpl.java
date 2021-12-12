package com.decathlon.poc.api;

import com.decathlon.poc.admin.api.AdminAuthorizationsApiDelegate;
import com.decathlon.poc.admin.model.AdminAuthorization;
import com.decathlon.poc.admin.model.CountryList;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminAuthorizationsApiImpl extends ApiDelegate implements AdminAuthorizationsApiDelegate {

    @Override
    public ResponseEntity<AdminAuthorization> getCurrentUserAuthorizations() {
        return ResponseEntity.ok(new AdminAuthorization().countries(new CountryList().countries(List.of("FR", "AT"))).role("myRole").uid(getUser()));
    }

}
