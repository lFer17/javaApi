package com.example.clinicDentist.controller;

import com.example.clinicDentist.model.Dentist;
import com.example.clinicDentist.service.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DentistController {
    @Autowired
    DentistService dentistService;
    @GetMapping("/dentist")
    public List<Dentist> getAll(){
       return dentistService.getAll();
    }
    @PostMapping("/dentist")
        public void addDentist(@RequestBody Dentist dentist){
        dentistService.addNewDentist(dentist);
    }
    @GetMapping("/dentist/{id}")
    public Dentist findDentistById (@PathVariable("id") Long id){
        return dentistService.finById(id);
    }
    @PutMapping("/dentist/{id}")
    public void updateDentist(@PathVariable("id") Long id,@RequestBody Dentist dentist){
        dentistService.updateDentistById(id,dentist);
    }
    @DeleteMapping("/dentist/{id}")
    public void deleteDentist(@PathVariable("id") Long id){
        dentistService.deleteByid(id);
    }
}
