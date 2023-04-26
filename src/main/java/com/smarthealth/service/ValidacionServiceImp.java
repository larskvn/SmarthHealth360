package com.smarthealth.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smarthealth.entity.ValidacionEntity;
import com.smarthealth.repository.ValidacionRepository;

@Service
public class ValidacionServiceImp implements ValidacionService {

    @Autowired
    private ValidacionRepository validacionrepositorio;

    @Override
    public List<ValidacionEntity> findAll() {
        return validacionrepositorio.findAll();
    }

    @Override
    public List<ValidacionEntity> findAllCustom() {
        return validacionrepositorio.findAllCustom();
    }

    @Override
    public Optional<ValidacionEntity> findById(long Id) {
        return validacionrepositorio.findById(Id);
    }

    @Override
    public ValidacionEntity add(ValidacionEntity v) {
        return validacionrepositorio.save(v);
    }

    @Override
    public ValidacionEntity update(ValidacionEntity v) {
        ValidacionEntity objvalidacion = validacionrepositorio.getById(v.getId());
        BeanUtils.copyProperties(v, objvalidacion);
        return validacionrepositorio.save(objvalidacion);

    }

    @Override
    public ValidacionEntity delete(ValidacionEntity v) {
        ValidacionEntity objvalidacion = validacionrepositorio.getById(v.getId());
        objvalidacion.setEstado(false);
        return validacionrepositorio.save(objvalidacion);

    }

}
