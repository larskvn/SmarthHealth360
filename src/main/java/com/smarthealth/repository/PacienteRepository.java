package com.smarthealth.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smarthealth.entity.PacienteEntity;

@Repository
public interface PacienteRepository  extends JpaRepository<PacienteEntity,Long>{
    @Query("select p from PacienteEntity p where p.estado='1'")
    List<PacienteEntity> findAllCustom();
    
}
