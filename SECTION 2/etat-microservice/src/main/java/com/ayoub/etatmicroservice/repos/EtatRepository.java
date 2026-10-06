package com.ayoub.etatmicroservice.repos;

import com.ayoub.etatmicroservice.entities.Etat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtatRepository extends JpaRepository<Etat, Long> {
    Etat findEtatById(Long idEtat);
}
