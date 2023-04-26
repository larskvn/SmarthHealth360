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

import com.smarthealth.entity.EspecialidadEntity;
import com.smarthealth.service.EspecialidadService;

@RestController
@RequestMapping("/especialidad")
public class EspecialidadController {

    @Autowired
    private EspecialidadService especialidadservicio;

    @GetMapping
    public List<EspecialidadEntity> findAll(){
        return especialidadservicio.findAll();
    }

    @GetMapping("/Custom")
    public List<EspecialidadEntity> findAllCustom(){
        return especialidadservicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<EspecialidadEntity> findById( @PathVariable Long id){
        return especialidadservicio.findById(id);
    }

    @PostMapping
    public EspecialidadEntity add(@RequestBody EspecialidadEntity e){
        return especialidadservicio.add(e);
    }

    @PutMapping("/{id}")
    public EspecialidadEntity update(@PathVariable Long id, @RequestBody EspecialidadEntity e){
        e.setId(id);
        return especialidadservicio.update(e);
    }

    @DeleteMapping("/{id}")
    public EspecialidadEntity delete(@PathVariable Long id){
        EspecialidadEntity objespecialidad = new EspecialidadEntity();
        objespecialidad.setEstado(false);
        return especialidadservicio.delete(EspecialidadEntity.builder().id(id).build());
    }
}
