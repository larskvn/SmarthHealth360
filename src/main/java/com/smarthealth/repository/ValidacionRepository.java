package com.smarthealth.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smarthealth.entity.ValidacionEntity;


@Repository
public interface ValidacionRepository  extends JpaRepository<ValidacionEntity, Long>{
    

    @Query("select v from ValidacionEntity v where v.estado = '1'")
    List<ValidacionEntity> findAllCustom();
    
}
