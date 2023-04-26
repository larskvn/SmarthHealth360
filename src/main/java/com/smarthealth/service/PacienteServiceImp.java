package com.smarthealth.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smarthealth.entity.PacienteEntity;
import com.smarthealth.repository.PacienteRepository;

@Service
public class PacienteServiceImp implements  PacienteService{

    @Autowired
    private PacienteRepository pacienterepositorio;


    @Override
    public List<PacienteEntity> findAll() {
        return pacienterepositorio.findAll();
    }

    @Override
    public List<PacienteEntity> findAllCustom() {
        return pacienterepositorio.findAllCustom();

    }

    @Override
    public Optional<PacienteEntity> findById(long Id) {
        return pacienterepositorio.findById(Id);
    }

    @Override
    public PacienteEntity add(PacienteEntity p) {
        return pacienterepositorio.save(p);
    }

    @Override
    public PacienteEntity update(PacienteEntity p) {
        PacienteEntity objpaciente = pacienterepositorio.getById(p.getId());
        BeanUtils.copyProperties(p,objpaciente);
        return pacienterepositorio.save(objpaciente);
    }

    @Override
    public PacienteEntity delete(PacienteEntity p) {
        PacienteEntity objpaciente = pacienterepositorio.getById(p.getId());
        objpaciente.setEstado(false);
        return pacienterepositorio.save(objpaciente);
    }
    
}
