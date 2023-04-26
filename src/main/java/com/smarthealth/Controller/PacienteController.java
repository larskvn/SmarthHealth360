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

import com.smarthealth.entity.PacienteEntity;
import com.smarthealth.service.PacienteService;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
    

    @Autowired
    private PacienteService pacienteservicio;

    @GetMapping
    public List<PacienteEntity> findAll(){
        return pacienteservicio.findAll();
    }

    @GetMapping("/Custom")
    public List<PacienteEntity> findAllCustom(){
        return pacienteservicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<PacienteEntity> findById(@PathVariable Long id){
        return pacienteservicio.findById(id);
    }

    @PostMapping
    public PacienteEntity add(@RequestBody PacienteEntity p){
        return pacienteservicio.add(p);
    }

    @PutMapping("/{id}")
    public PacienteEntity update(@PathVariable Long id, @RequestBody PacienteEntity p){
        p.setId(id);
        return pacienteservicio.update(p);
    }

    @DeleteMapping("/{id}")
    public PacienteEntity delete(@PathVariable Long id){
        PacienteEntity objpaciente = new PacienteEntity();
        objpaciente.setEstado(false);
        return pacienteservicio.delete(PacienteEntity.builder().id(id).build());
    }
}
