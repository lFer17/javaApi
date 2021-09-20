package com.example.clinicDentist.controller;

import com.example.clinicDentist.model.Pacient;
import com.example.clinicDentist.service.PacientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PacientController {

    @Autowired
    PacientService pacientService;

    @GetMapping("/pacient")
    public List<Pacient> getAllPacients(){
      return  pacientService.getAllPacients();
    }
    @PostMapping("/pacient")
    public void addPacient(@RequestBody Pacient pacient){
        pacientService.addPaciente(pacient);
    }
    @PutMapping("/pacient/{id}")
    public void updatePacienteById(@PathVariable("id") Long id, @RequestBody Pacient pacient){
        pacientService.updatePacient(id,pacient);
    }

    @DeleteMapping("/pacient/{id}")
    public void removePacientByid(@PathVariable("id") Long id){
        pacientService.removePacientById(id);
    }


}
