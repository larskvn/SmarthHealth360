package com.smarthealth.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smarthealth.entity.MedicoEntity;
import com.smarthealth.repository.MedicoRepository;

@Service
public class MedicoServiceImp implements MedicoService {

    @Autowired
    private MedicoRepository medicorepositorio;

    @Override
    public List<MedicoEntity> findAll() {
        return medicorepositorio.findAll();
    }

    @Override
    public List<MedicoEntity> findAllCustom() {
        return medicorepositorio.findAllCustom();
    }

    @Override
    public Optional<MedicoEntity> findById(long Id) {
        return medicorepositorio.findById(Id);
    }

    @Override
    public MedicoEntity add(MedicoEntity m) {
        return medicorepositorio.save(m);
    }

    @Override
    public MedicoEntity update(MedicoEntity m) {
        MedicoEntity objmedico = medicorepositorio.getById(m.getId());
        BeanUtils.copyProperties(m,objmedico);
        return medicorepositorio.save(objmedico);
    }

    @Override
    public MedicoEntity delete(MedicoEntity m) {
        MedicoEntity objmedico = medicorepositorio.getById(m.getId());
        objmedico.setEstado(false);
        return medicorepositorio.save(objmedico);
    }

    
    
}
