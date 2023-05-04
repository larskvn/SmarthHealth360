package com.smarthealth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smarthealth.entity.AdministradorEntity;

@Repository
public interface AdministradorRepository  extends JpaRepository<AdministradorEntity, Long>{
    @Query("Select a from AdministradorEntity a where a.estado='1' ")
    List<AdministradorEntity> findAllCustom();
    
}
