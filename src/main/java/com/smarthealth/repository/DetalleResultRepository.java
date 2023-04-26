package com.smarthealth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smarthealth.entity.DetalleResultEntity;

@Repository
public interface DetalleResultRepository extends JpaRepository<DetalleResultEntity, Long>{
    @Query("select d from DetalleResultEntity d where d.estado='1'")
    List<DetalleResultEntity> findAllCustom();
    
}
