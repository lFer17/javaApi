package com.example.clinicDentist.service;

import com.example.clinicDentist.model.Dentist;
import com.example.clinicDentist.respository.DentistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DentistService {
    @Autowired
    DentistRepository dentistRepository;

    public DentistService(DentistRepository dentistRepository) {
        this.dentistRepository = dentistRepository;
    }
    public List<Dentist> getAll (){
         List <Dentist> dentistList = new ArrayList<>();
         dentistRepository.findAll().forEach(dentist->dentistList.add(dentist));
        return dentistList;
    }
    public void addNewDentist(Dentist dentist){
    dentistRepository.save(dentist);
    }
    public Dentist finById(Long id){
        return dentistRepository.findById(id).get();
    }
    public void deleteByid(Long id){
        dentistRepository.deleteById(id);
    }
    public void updateDentistById(Long id,Dentist dentist) {
        Dentist dentist1 = finById(id);
        dentist1.setName(dentist.getName());
        dentist1.setLastName(dentist.getLastName());
        dentist1.setRegistrationNumber(dentist.getRegistrationNumber());
        dentistRepository.save(dentist1);
    }
}
