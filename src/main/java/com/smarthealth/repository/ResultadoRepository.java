package com.smarthealth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smarthealth.entity.ResultadoEntity;

@Repository
public interface ResultadoRepository extends JpaRepository<ResultadoEntity, Long> {
    @Query("select rs from ResultadoEntity rs where rs.estado='1' ")
    List<ResultadoEntity> findAllCustom();
    
}
