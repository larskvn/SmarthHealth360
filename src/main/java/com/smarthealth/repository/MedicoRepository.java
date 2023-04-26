package com.smarthealth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smarthealth.entity.MedicoEntity;

@Repository
public interface MedicoRepository  extends JpaRepository<MedicoEntity,Long>{
    @Query("select m from MedicoEntity m where m.estado='1'")
    List<MedicoEntity> findAllCustom();
    
}
