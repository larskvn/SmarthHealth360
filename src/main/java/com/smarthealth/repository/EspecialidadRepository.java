package com.smarthealth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smarthealth.entity.EspecialidadEntity;

@Repository
public interface EspecialidadRepository  extends JpaRepository<EspecialidadEntity , Long>{

    @Query("select e from EspecialidadEntity e where e.estado='1'")
    List<EspecialidadEntity> findAllCustom();
    
}
