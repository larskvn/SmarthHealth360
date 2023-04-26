package com.smarthealth.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smarthealth.entity.ResultadoEntity;
import com.smarthealth.repository.ResultadoRepository;

@Service
public class ResultadoServiceImp  implements ResultadoService{

    @Autowired
    private ResultadoRepository resultadorepositorio;

    @Override
    public List<ResultadoEntity> findAll() {
        return resultadorepositorio.findAll();
    }

    @Override
    public List<ResultadoEntity> findAllCustom() {
            return resultadorepositorio.findAllCustom();
    }

    @Override
    public Optional<ResultadoEntity> findByID(long Id) {
        return resultadorepositorio.findById(Id);
    }

    @Override
    public ResultadoEntity add(ResultadoEntity rs) {
        return resultadorepositorio.save(rs);
    }

    @Override
    public ResultadoEntity update(ResultadoEntity rs) {
        ResultadoEntity objresultado = resultadorepositorio.getById(rs.getId());
        BeanUtils.copyProperties(rs, objresultado);
        return resultadorepositorio.save(objresultado);
    }

    @Override
    public ResultadoEntity delete(ResultadoEntity rs) {
        ResultadoEntity objresultado = resultadorepositorio.getById(rs.getId());
        objresultado.setEstado(false);
        return resultadorepositorio.save(objresultado);
    }

    
}
