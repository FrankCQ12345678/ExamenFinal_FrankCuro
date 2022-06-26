package edu.elp.FranklinCuro.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.elp.FranklinCuro.entity.Asignatura;
import edu.elp.FranklinCuro.service.IAsignaturaService;
import elp.edu.examendbbautista.entity.Asignatura;
import elp.edu.examendbbautista.service.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;


import java.util.List;
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RestController
@RequestMapping("index")
public class Buscar {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private IAsignaturaService asignaturaService;

    @GetMapping("/listaAsignatura")
    public List<Asignatura> listaAsignatura(){
        return this.asignaturaService.listaAsignaturas();
    }

    @GetMapping("/bycodigo/{denoSig}")
    public Asignatura asignaturaBySigla(@PathVariable("denoSig") String denoSig){
        return this.asignaturaService.obtenerPorDenominacionOrSigla(denoSig);
    }

    @PostMapping("/guardar")
    public String registrarEstudiante(@RequestBody String jsonAsignatura) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        Asignatura asignatura = this.objectMapper.readValue(jsonAsignatura,Asignatura.class);

        this.asignaturaService.guardarAsignatura(asignatura);

        return "Se guardó correctamente";
    }
}
