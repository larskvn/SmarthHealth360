package com.smarthealth.service;



import java.util.List;
import java.util.Optional;

import com.smarthealth.entity.ValidacionEntity;
public interface ValidacionService  {

    public List<ValidacionEntity> findAll();

    public List<ValidacionEntity> findAllCustom();

    public Optional<ValidacionEntity> findById( long Id);


    public ValidacionEntity add(ValidacionEntity v);

    public ValidacionEntity update(ValidacionEntity v);


    public ValidacionEntity delete(ValidacionEntity v);
    
}
