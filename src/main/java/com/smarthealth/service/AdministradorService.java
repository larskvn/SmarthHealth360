package com.smarthealth.service;

import java.util.List;
import java.util.Optional;

import com.smarthealth.entity.AdministradorEntity;

public interface AdministradorService {

    public List<AdministradorEntity> findAll();

    public List<AdministradorEntity> findAllCustom();

    public Optional<AdministradorEntity> findById( long Id);

    public AdministradorEntity add(AdministradorEntity a);

    public AdministradorEntity update(AdministradorEntity a);

    public AdministradorEntity delete(AdministradorEntity a);

    
}
