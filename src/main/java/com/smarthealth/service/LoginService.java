package com.smarthealth.service;

import java.util.List;
import java.util.Optional;

import com.smarthealth.entity.LoginEntity;

public interface LoginService {

    public List<LoginEntity> findAll();

    public List<LoginEntity> findAllCustom();

    public Optional<LoginEntity> findById( long Id);

    public LoginEntity add(LoginEntity l);

    public LoginEntity update(LoginEntity l);

    public LoginEntity delete(LoginEntity l);

    
    
}
