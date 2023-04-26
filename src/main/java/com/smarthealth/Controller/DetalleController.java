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

import com.smarthealth.entity.DetalleResultEntity;
import com.smarthealth.service.DetalleService;

@RestController
@RequestMapping("/detalle")
public class DetalleController {

    @Autowired
    private DetalleService detalleservicio;

    @GetMapping
    public List<DetalleResultEntity> findAll(){
        return detalleservicio.findAll();
    }

    @GetMapping("/Custom")
    public List<DetalleResultEntity> findAllCustom(){
        return detalleservicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<DetalleResultEntity> findById(@PathVariable Long id){
        return detalleservicio.findById(id);
    }
    @PostMapping
    public DetalleResultEntity add(@RequestBody DetalleResultEntity d){
        return detalleservicio.add(d);
    }

    @PutMapping("/{id}")
    public DetalleResultEntity update(@PathVariable Long id, @RequestBody DetalleResultEntity d){
        d.setId(id);
        return detalleservicio.update(d);
    }

    @DeleteMapping("/{id}")
    public DetalleResultEntity delete(@PathVariable Long id){
        DetalleResultEntity objdetalle = new DetalleResultEntity();
        objdetalle.setEstado(false);
        return detalleservicio.delete(DetalleResultEntity.builder().id(id).build());
    }



   
}
