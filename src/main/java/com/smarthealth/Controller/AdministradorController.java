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

import com.smarthealth.entity.AdministradorEntity;
import com.smarthealth.service.AdministradorService;

@RestController
@RequestMapping("/administrador")
public class AdministradorController {
    @Autowired
    AdministradorService adminservicio;

    @GetMapping
    private List<AdministradorEntity> findAll(){
        return adminservicio.findAll();
    }

    @GetMapping("/Custom")
    public List<AdministradorEntity> findAllCustom(){
        return adminservicio.findAllCustom();

    }
    
    @GetMapping("/{id}")
    public Optional<AdministradorEntity> findById(@PathVariable Long id){
        return adminservicio.findById(id);
    }

    @PostMapping
    public AdministradorEntity add(@RequestBody AdministradorEntity a){
       return adminservicio.add(a);
    }

    @PutMapping("/{id}")
    public AdministradorEntity update(@PathVariable Long id, @RequestBody AdministradorEntity a){
       a.setId(id);
        return adminservicio.update(a);

    }

    @DeleteMapping("/{id}")
    public AdministradorEntity delete(@PathVariable Long id){
        AdministradorEntity objadmin = new AdministradorEntity();
        objadmin.setEstado(false);
        return adminservicio.delete(AdministradorEntity.builder().id(id).build());
    }


}
