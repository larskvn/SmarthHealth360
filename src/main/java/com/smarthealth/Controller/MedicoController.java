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

import com.smarthealth.entity.MedicoEntity;
import com.smarthealth.service.MedicoService;

@RestController
@RequestMapping("/medico")
public class MedicoController {
    
    @Autowired
    private MedicoService medicoservicio;

    @GetMapping
    public List<MedicoEntity> findAll(){
        return medicoservicio.findAll();
    }

    @GetMapping("/Custom")
    public List<MedicoEntity> findAllCustom(){
        return medicoservicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<MedicoEntity> findById(@PathVariable Long id){
        return medicoservicio.findById(id);
    }

    @PostMapping
    public MedicoEntity add(@RequestBody MedicoEntity m){
        return medicoservicio.add(m);
    }

    @PutMapping("/{id}")
    public MedicoEntity update(@PathVariable Long id, @RequestBody  MedicoEntity m){
        m.setId(id);
        return medicoservicio.update(m);
        
    }

    @DeleteMapping("/{id}")
    public MedicoEntity delete(@PathVariable Long id){
        MedicoEntity objmedico = new MedicoEntity();
        objmedico.setEstado(false);
        return medicoservicio.delete(MedicoEntity.builder().id(id).build());
    }
}
