package com.example.clinicDentist.respository;

import com.example.clinicDentist.model.Dentist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DentistRepository extends CrudRepository <Dentist,Long>{

}
