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

import com.smarthealth.entity.ResultadoEntity;
import com.smarthealth.service.ResultadoService;

@RestController
@RequestMapping("/resultado")
public class ResultadoController {
    
    @Autowired
    private ResultadoService resultadoservicio;

    @GetMapping 
    public List<ResultadoEntity> findAll(){
        return resultadoservicio.findAll();
    }

    @GetMapping("/Custom")
    public List<ResultadoEntity> findAllCustom(){
        return resultadoservicio.findAllCustom();

    }

    @GetMapping("/{id}")
    public Optional<ResultadoEntity> findByID(@PathVariable Long id){
        return resultadoservicio.findByID(id);
    }

    @PostMapping
    public ResultadoEntity add (@RequestBody ResultadoEntity rs){
        return resultadoservicio.add(rs);
    }

    @PutMapping("/{id}")
    public ResultadoEntity update(@PathVariable Long id, @RequestBody ResultadoEntity rs){
        rs.setId(id);
        return resultadoservicio.update(rs);
    }

    @DeleteMapping("/{id}")
    public ResultadoEntity delete(@PathVariable Long id){
        ResultadoEntity objresultado = new ResultadoEntity();
        objresultado.setEstado(false);
        return resultadoservicio.delete(ResultadoEntity.builder().id(id).build());
    }
}
