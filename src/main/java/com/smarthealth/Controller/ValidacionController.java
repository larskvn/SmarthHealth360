package com.smarthealth.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smarthealth.entity.ValidacionEntity;
import com.smarthealth.service.ValidacionService;

@RestController
@RequestMapping("/validacion")
public class ValidacionController {

    @Autowired
    private ValidacionService validacionservicio;

    @GetMapping
    public List<ValidacionEntity> findAll(){
        return validacionservicio.findAll();
    }

    @GetMapping("/Custom")
    public List<ValidacionEntity> findAllCustom(){
        return validacionservicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ValidacionEntity> findById(@PathVariable Long id){
        return validacionservicio.findById(id);
    }
    
    @PostMapping
    public ValidacionEntity add(@RequestBody ValidacionEntity v){
        return validacionservicio.add(v);
    }

    @PutMapping("/{id}")
    public ValidacionEntity update(@PathVariable Long id, @RequestBody ValidacionEntity v){
        v.setId(id);
        return validacionservicio.update(v);
    }

    @DeleteMapping("/{id}")
    public ValidacionEntity delete(@PathVariable Long id){
        ValidacionEntity objvalidacion = new ValidacionEntity();
        objvalidacion.setEstado(false);
        return validacionservicio.delete(ValidacionEntity.builder().id(id).build());
    }


}
