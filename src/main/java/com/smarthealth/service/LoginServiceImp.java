package com.smarthealth.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.smarthealth.entity.LoginEntity;
import com.smarthealth.repository.LoginRepository;

public class LoginServiceImp implements LoginService {


    @Autowired
    private LoginRepository loginrepositorio;

    @Override
    public List<LoginEntity> findAll() {
        return loginrepositorio.findAll();
    }

    @Override
    public List<LoginEntity> findAllCustom() {
        return loginrepositorio.findAllCustom();
    }

    @Override
    public Optional<LoginEntity> findById(long Id) {
        return loginrepositorio.findById(Id);

    }

    @Override
    public LoginEntity add(LoginEntity l) {
        return loginrepositorio.save(l);
    }

    @Override
    public LoginEntity update(LoginEntity l) {
       LoginEntity objlogin = loginrepositorio.getById(l.getId_usuario());
       BeanUtils.copyProperties(l, objlogin);
       return loginrepositorio.save(objlogin);
    }

    @Override
    public LoginEntity delete(LoginEntity l) {
        LoginEntity objlogin = loginrepositorio.getById(l.getId_usuario());
        objlogin.setEstado(false);
        return loginrepositorio.save(objlogin);
    }
    
}
