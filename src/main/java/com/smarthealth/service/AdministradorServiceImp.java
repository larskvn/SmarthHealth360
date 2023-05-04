package com.smarthealth.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smarthealth.entity.AdministradorEntity;
import com.smarthealth.repository.AdministradorRepository;

@Service
public class AdministradorServiceImp implements AdministradorService {

    @Autowired
    private AdministradorRepository adminrepositorio;

    @Override
    public List<AdministradorEntity> findAll() {
        return adminrepositorio.findAll();
    }

    @Override
    public List<AdministradorEntity> findAllCustom() {
        return adminrepositorio.findAllCustom();
    }

    @Override
    public Optional<AdministradorEntity> findById(long Id) {
       return adminrepositorio.findById(Id);
    }

    @Override
    public AdministradorEntity add(AdministradorEntity a) {
       return adminrepositorio.save(a);
    }

    @Override
    public AdministradorEntity update(AdministradorEntity a) {
       AdministradorEntity objadmin = adminrepositorio.getById(a.getId());
       BeanUtils.copyProperties(a,objadmin);
       return adminrepositorio.save(objadmin);
    }

    @Override
    public AdministradorEntity delete(AdministradorEntity a) {
       AdministradorEntity objadmin = adminrepositorio.getById(a.getId());
       objadmin.setEstado(false);
       return adminrepositorio.save(objadmin);
    }
    
}
