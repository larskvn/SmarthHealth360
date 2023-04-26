package com.smarthealth.service;

import java.util.List;
import java.util.Optional;

import com.smarthealth.entity.PacienteEntity;

public interface PacienteService  {


    public List<PacienteEntity> findAll();

    public List<PacienteEntity> findAllCustom();

    public Optional<PacienteEntity> findById(long Id);


    public PacienteEntity add(PacienteEntity p);

    public PacienteEntity update(PacienteEntity p);

    public PacienteEntity delete(PacienteEntity p);
    
    
}
