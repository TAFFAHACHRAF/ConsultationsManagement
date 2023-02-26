package com.example.jpaapp.repositories;

import com.example.jpaapp.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    public List<Patient> findByMalade(Boolean m);
    @Query("select p from Patient p where p.malade=:x")
    public List<Patient> chercherPatient(@Param("x") Boolean malade);
}
