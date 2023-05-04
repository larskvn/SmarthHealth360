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

import com.smarthealth.entity.LoginEntity;
import com.smarthealth.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
   
    @Autowired
    private LoginService loginservicio;

    @GetMapping
    public List<LoginEntity> findAll(){
        return loginservicio.findAll();
    }

    @GetMapping("/Custom")
    public List<LoginEntity> findAllCustom(){
        return loginservicio.findAllCustom();
    }


    @GetMapping("/{id}")
    public Optional<LoginEntity> findById(@PathVariable Long id){
        return loginservicio.findById(id);
    }


    @PostMapping
    public LoginEntity add(@RequestBody LoginEntity l){
        return loginservicio.add(l);
    }

    @PutMapping("/{id}")
    public LoginEntity update(@PathVariable Long id, @RequestBody LoginEntity l){
        l.setId_usuario(id);
        return loginservicio.update(l);
    }

    @DeleteMapping("/{id}")
    public LoginEntity delete(@PathVariable Long id){
        LoginEntity objlogin = new LoginEntity();
        objlogin.setEstado(false);
        return  loginservicio.delete(LoginEntity.builder().id_usuario(id).build());
    }


}
