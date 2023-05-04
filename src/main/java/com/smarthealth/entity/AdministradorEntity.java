package com.smarthealth.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder    
@AllArgsConstructor
@NoArgsConstructor
@Data   

@Entity(name = "AdministradorEntity")
@Table(name = "administrador")
public class AdministradorEntity implements Serializable{
    private static final long serialVersionUID=1L;

    @Id
    @NotNull
    @Column(name = "id")
    private long id;

    @Column(name = "nombre")
    private String nombre;


    @Column(name = "apellido")
    private String apellido;

    @Column(name = "contrasena")
    private String contrasena;


    @ManyToOne
    @JoinColumn(name = "rol_id", nullable = false)
    private String rol_id;


    @Column(name = "estado")
    private boolean estado;
    



    
}
