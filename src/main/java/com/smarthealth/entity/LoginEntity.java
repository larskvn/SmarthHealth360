package com.smarthealth.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
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

@Entity(name = "LoginEntity")
@Table(name = "login")
public class LoginEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @Column(name = "id_usuario")
    private long id_usuario;

    @Column(name = "contrasena")
    @NotNull
    private String contrasena;

    @Column(name = "fecha_login")
    private LocalDateTime fechaDateTime;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_usuario")
    private MedicoEntity medico;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_usuario")
    private PacienteEntity paciente;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_usuario")
    private AdministradorEntity administrador;


    @Column(name="estado")
    private boolean estado;

    
}
