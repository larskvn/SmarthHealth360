package com.smarthealth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smarthealth.entity.LoginEntity;

@Repository
public interface LoginRepository extends JpaRepository<LoginEntity, Long> {
    @Query("select l from LoginEntity  l where l.estado= '1'")

    List<LoginEntity> findAllCustom();
    
}
