package com.example.jpaapp;

import com.example.jpaapp.entities.Patient;
import com.example.jpaapp.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class JpaAppApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(JpaAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        this.patientRepository.save(new Patient(Long.valueOf(0),"Achraf",new Date(05/07/2001),true,20));
        int nb=this.patientRepository.findByMalade(false).size();
        System.out.println("malade : "+nb);

        System.out.println("malade :"+patientRepository.chercherPatient(true).size());

        for(int i=0;i<10;i++){
            patientRepository.save(new Patient(null,"taffah",new Date(14,25,2019),(i%2==0 ? true : false),i*11));
        }
    }
}
