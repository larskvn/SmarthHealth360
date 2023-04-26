package com.smarthealth.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smarthealth.entity.DetalleResultEntity;
import com.smarthealth.repository.DetalleResultRepository;

@Service
public class DetalleServiceImp  implements DetalleService{

    @Autowired
    private DetalleResultRepository detallerepositorio;

    @Override
    public List<DetalleResultEntity> findAll() {
        return detallerepositorio.findAll();
    }

    @Override
    public List<DetalleResultEntity> findAllCustom() {
        return detallerepositorio.findAllCustom();
    }

    @Override
    public Optional<DetalleResultEntity> findById(long Id) {
        return detallerepositorio.findById(Id);
    }

    @Override
    public DetalleResultEntity add(DetalleResultEntity d) {
        return detallerepositorio.save(d);
    }

    @Override
    public DetalleResultEntity update(DetalleResultEntity d) {
        DetalleResultEntity objdetalle = detallerepositorio.getById(d.getId());
        BeanUtils.copyProperties(d,objdetalle);
        return detallerepositorio.save(objdetalle);
    }

    @Override
    public DetalleResultEntity delete(DetalleResultEntity d) {
        DetalleResultEntity objdetalle = detallerepositorio.getById(d.getId());
        objdetalle.setEstado(false);
        return detallerepositorio.save(objdetalle);
    }
    
}
