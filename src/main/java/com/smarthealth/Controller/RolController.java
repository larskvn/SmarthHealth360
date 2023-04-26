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

import com.smarthealth.entity.RolEntity;
import com.smarthealth.service.RolService;

@RestController
@RequestMapping("/rol")
public class RolController {
    
    @Autowired
    private RolService rolservicio;

    @GetMapping
    public List<RolEntity> findAll(){
        return rolservicio.findAll();
    }

    @GetMapping("/Custom")
    public List<RolEntity> findAllCustom(){
        return rolservicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<RolEntity> findById(@PathVariable Long id){
        return rolservicio.findById(id);
    }

    @PostMapping
    public RolEntity add(@RequestBody RolEntity r){
        return rolservicio.add(r);
    }

    @PutMapping("/{id}")
    public RolEntity update(@PathVariable Long id, @RequestBody RolEntity r){
        r.setId(id);
        return rolservicio.update(r);
    }

    @DeleteMapping("/{id}")
    public RolEntity delete(@PathVariable Long id){
        RolEntity objrol = new RolEntity();
        objrol.setEstado(false);
        return rolservicio.delete(RolEntity.builder().id(id).build());
    }
}
