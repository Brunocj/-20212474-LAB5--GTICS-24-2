package com.example.lab5gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "viajes")
public class Viaje {
    @Id
    @Column(name = "idViajes", nullable = false)
    private Integer id;

    @Column(name = "punto_recojo", length = 45)
    private String puntoRecojo;

    @Column(name = "cant_personas", length = 45)
    private String cantPersonas;

    @Column(name = "cant_perros", length = 45)
    private String cantPerros;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Persona_idPersona", nullable = false)
    private Persona personaIdpersona;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Lugares_idLugares", nullable = false)
    private Lugare lugaresIdlugares;

}