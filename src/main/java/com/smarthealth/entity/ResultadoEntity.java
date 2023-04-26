package com.smarthealth.entity;

import java.io.Serializable;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity(name = "ResultadoEntity")
@Table(name = "resultado")
public class ResultadoEntity implements Serializable{
    private static final long serialVersionUID=1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(name = "fecha_prueba")
    @Past(message = "La fecha de cumpleaños debe ser en el pasado")
    private LocalDate fecha_prueba;

    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private PacienteEntity paciente_id;


    @ManyToOne
    @JoinColumn(name = "medico_id", nullable = false)
    private MedicoEntity medico_id; 


    @ManyToOne
    @JoinColumn(name = "especialidad_id",nullable = false)
    private EspecialidadEntity especialidad_id;

    @Column(name = "estado")
    private boolean estado;

    
}
