package com.example.clinicDentist.service;

import com.example.clinicDentist.model.Pacient;
import com.example.clinicDentist.respository.PacientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PacientService {
    @Autowired
    PacientRepository pacientRepository;
    public void addPaciente(Pacient pacient){
        pacientRepository.save(pacient);
    }

    public List <Pacient> getAllPacients(){
        List <Pacient> pacientList = new ArrayList<>();
        pacientRepository.findAll().forEach(pacient-> pacientList.add(pacient));
        return pacientList;
    }
    public Pacient findPacientById(Long id){
        return pacientRepository.findById(id).get();
    }
    public void removePacientById(Long id){
        pacientRepository.deleteById(id);
    }
    public void updatePacient(Long id, Pacient pacient){
        Pacient pacientUpdate = findPacientById(id);
        pacientUpdate.setName(pacient.getName());
        pacientUpdate.setLastName(pacient.getLastName());
        pacientUpdate.setAddres(pacient.getAddres());
        pacientUpdate.setPassword(pacient.getPassword());
        pacientRepository.save(pacientUpdate);
    }

}
