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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity(name = "DetalleResultEntity")
@Table(name = "detalle_resultado")
public class DetalleResultEntity implements Serializable {
   private static final long serialVersionUID=1L;

   @Id
   @Column(name = "id")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;


   @ManyToOne
   @JoinColumn(name = "resultado_id", nullable = false)
   private ResultadoEntity resultado_id;


   @Column(name = "diagnostico")
   private String diagnostico;


   @Column(name = "tratamiento")
   private String tratamiento;


   @Column(name = "recomendacion")
   private String recomendacion;



   @Column(name = "estado")
   private boolean estado;
   
   
}
