package com.smarthealth.service;

import java.util.List;
import java.util.Optional;

import com.smarthealth.entity.EspecialidadEntity;

public interface EspecialidadService {
    
    public List<EspecialidadEntity> findAll();


    public List<EspecialidadEntity> findAllCustom();

    public Optional<EspecialidadEntity> findById(long Id);


    public EspecialidadEntity add(EspecialidadEntity e);

    public EspecialidadEntity update(EspecialidadEntity e);

    public EspecialidadEntity delete(EspecialidadEntity e);
}
