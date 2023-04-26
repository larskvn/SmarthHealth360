package com.smarthealth.entity;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity(name = "PacienteEntity")
@Table(name = "paciente")
public class PacienteEntity implements Serializable {
    private static final  long serialVersionUID=1L;

    @Id
    @NotNull
    @Column (name = "id")
    private long id;


    @NotNull
    @Column (name = "nombre")
    private String nombre;

    @Column (name = "apellido")
    private String apellido;


    @Column(name = "fecha_nacimiento")
    @Past(message = "La fecha de cumpleaños debe ser en el pasado" )
    private LocalDate fecha_nacimiento;


    @Email
    @Column(name = "correo_electronico")
    private String correo_electronico;

    
    @Column(name ="contrasena")
    @Size(min = 4)
    private String contrasena;


    @Digits(integer = 9, fraction = 0, message = "El teléfono debe contener solo números")
    @Column (name = "telefono")
    private long telefono;


    @ManyToOne
    @JoinColumn(name = "rol_id", nullable=false)
    private RolEntity rol_id;
    @PrePersist
    private void prePersist(){
        if (rol_id == null){
            RolEntity rolDefault=  new RolEntity();
            rolDefault.setId(2);
            rolDefault.setNombre("cliente");
            rolDefault.setEstado(true);
            rol_id=rolDefault;
        }
    
    }
   

    @Builder.Default
    @Column(name = "estado")
    private boolean estado = true;

    
}
