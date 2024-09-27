package com.example.lab5gtics.controller;


import com.example.lab5gtics.entity.Lugare;
import com.example.lab5gtics.entity.Persona;
import com.example.lab5gtics.entity.Viaje;
import com.example.lab5gtics.repository.LugareRepository;
import com.example.lab5gtics.repository.MascotaRepository;
import com.example.lab5gtics.repository.PersonaRepository;
import com.example.lab5gtics.repository.ViajeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller

public class lab5Controller {

    private final PersonaRepository personaRepository;
    private final MascotaRepository mascotaRepository;

    private final ViajeRepository viajeRepository;

    private final LugareRepository lugareRepository;

    public lab5Controller(PersonaRepository personaRepository, MascotaRepository mascotaRepository, ViajeRepository viajeRepository, LugareRepository lugareRepository){
        this.personaRepository = personaRepository;
        this.viajeRepository = viajeRepository;
        this.mascotaRepository = mascotaRepository;
        this.lugareRepository = lugareRepository;
    }


    @GetMapping("/home")
    public String homepage(){

        return "home";
    }

    @GetMapping("/viajes")
    public String viajes(Model model){
        model.addAttribute("listaViajes", viajeRepository.findAll());
        return "viajes";
    }

    @GetMapping("/lugares")
    public String lugares(Model model){
        model.addAttribute("listaLugares", lugareRepository.findAll());
        return "lugares";
    }

    @GetMapping("/mascotas")
    public String mascotas(Model model){
        model.addAttribute("listaMascotas", mascotaRepository.findAll());
        return "mascotas";
    }
    @GetMapping("/viajes/new")
    public String nuevoviaje(Model model){
        model.addAttribute("listaLugares", lugareRepository.findAll());
        model.addAttribute("listaPersonas", personaRepository.findAll());
        Viaje viaje = new Viaje();
        model.addAttribute("viaje", viaje);
        return "registrarViaje";
    }
}
