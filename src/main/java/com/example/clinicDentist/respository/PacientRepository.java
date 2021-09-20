package com.example.clinicDentist.respository;

import com.example.clinicDentist.model.Pacient;
import org.springframework.data.repository.CrudRepository;

public interface PacientRepository extends CrudRepository<Pacient,Long> {
}
