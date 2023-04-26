package com.smarthealth.service;

import java.util.List;
import java.util.Optional;

import com.smarthealth.entity.DetalleResultEntity;

public interface DetalleService {
    public List<DetalleResultEntity> findAll();

    public List<DetalleResultEntity> findAllCustom();

    public Optional<DetalleResultEntity> findById(long Id);


    public DetalleResultEntity add(DetalleResultEntity d);


    public DetalleResultEntity update(DetalleResultEntity d);

    public DetalleResultEntity delete(DetalleResultEntity d);
}
