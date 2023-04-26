package com.smarthealth.service;

import java.util.List;
import java.util.Optional;

import com.smarthealth.entity.ResultadoEntity;

public interface ResultadoService {

    public List<ResultadoEntity> findAll();


    public List<ResultadoEntity> findAllCustom();

    public Optional<ResultadoEntity> findByID(long Id);


    public ResultadoEntity add(ResultadoEntity rs);

    public ResultadoEntity update(ResultadoEntity rs);

    public ResultadoEntity delete(ResultadoEntity rs);
}
