package com.ayoub.etatmicroservice;

import com.ayoub.etatmicroservice.entities.Etat;
import com.ayoub.etatmicroservice.repos.EtatRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EtatMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EtatMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(EtatRepository etatrepos) {
        return args -> {

            etatrepos.save(
                    Etat.builder()
                            .idEtat("1")
                            .nomEtat("disponible")
                            .build()
            );

            etatrepos.save(
                    Etat.builder()
                            .idEtat("2")
                            .nomEtat("indisponible")
                            .build()
            );
        };
    }
}