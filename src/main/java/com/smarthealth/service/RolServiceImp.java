package com.smarthealth.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smarthealth.entity.RolEntity;
import com.smarthealth.repository.RolRepository;

@Service
public class RolServiceImp  implements RolService {

    @Autowired
    private RolRepository rolrepositorio;


    @Override
    public List<RolEntity> findAll() {
        return rolrepositorio.findAll();
    }

    @Override
    public List<RolEntity> findAllCustom() {
        return rolrepositorio.findAllCustom();
    }

    @Override
    public Optional<RolEntity> findById(long Id) {
        return rolrepositorio.findById(Id);
    }

    @Override
    public RolEntity add(RolEntity r) {
        return rolrepositorio.save(r);
    }

    @Override
    public RolEntity update(RolEntity r) {
        RolEntity objrol = rolrepositorio.getById(r.getId());
        BeanUtils.copyProperties(r, objrol);
        return rolrepositorio.save(objrol);
    }

    @Override
    public RolEntity delete(RolEntity r) {
        RolEntity objrol = rolrepositorio.getById(r.getId());
        objrol.setEstado(false);
        return rolrepositorio.save(objrol);
    }
    
}
