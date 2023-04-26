package com.smarthealth.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smarthealth.entity.EspecialidadEntity;
import com.smarthealth.repository.EspecialidadRepository;

@Service
public class EspecialidadServiceImp  implements EspecialidadService{


    @Autowired
    private EspecialidadRepository especialidadrepositorio;

    @Override
    public List<EspecialidadEntity> findAll() {
        return especialidadrepositorio.findAll();
    }

    @Override
    public List<EspecialidadEntity> findAllCustom() {
        return especialidadrepositorio.findAllCustom();
    }

    @Override
    public Optional<EspecialidadEntity> findById(long Id) {
        return especialidadrepositorio.findById(Id);
    }

    @Override
    public EspecialidadEntity add(EspecialidadEntity e) {
        return especialidadrepositorio.save(e);
    }

    @Override
    public EspecialidadEntity update(EspecialidadEntity e) {
        EspecialidadEntity objespecialidad = especialidadrepositorio.getById(e.getId());
        BeanUtils.copyProperties(e, objespecialidad);
        return especialidadrepositorio.save(objespecialidad);

    }

    @Override
    public EspecialidadEntity delete(EspecialidadEntity e) {
        EspecialidadEntity objespecialidad = especialidadrepositorio.getById(e.getId());
        objespecialidad.setEstado(false);
        return especialidadrepositorio.save(objespecialidad);
    }
    
}
