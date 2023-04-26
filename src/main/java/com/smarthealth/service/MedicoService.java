package com.smarthealth.service;

import java.util.List;
import java.util.Optional;

import com.smarthealth.entity.MedicoEntity;

public interface MedicoService {

    public List<MedicoEntity> findAll();

    public List<MedicoEntity> findAllCustom();

    public Optional<MedicoEntity> findById( long Id);
    
     
    public MedicoEntity add(MedicoEntity m);

    public MedicoEntity update(MedicoEntity m);

    public MedicoEntity delete(MedicoEntity m);
}
