
package com.smarthealth.service;

import java.util.List;
import java.util.Optional;

import com.smarthealth.entity.RolEntity;

public interface RolService {
    public List<RolEntity> findAll();

    public List<RolEntity> findAllCustom();

    public Optional<RolEntity> findById(long Id);
    
    public RolEntity add(RolEntity r);

    public RolEntity update(RolEntity r);

    public RolEntity delete(RolEntity r);
}
