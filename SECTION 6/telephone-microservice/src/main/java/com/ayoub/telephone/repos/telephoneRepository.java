package com.ayoub.telephone.repos;

import com.ayoub.telephone.entities.Telephone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface telephoneRepository extends JpaRepository<Telephone,
        Long> {
    Telephone findByCodeTelephone(String codeTelephone);

}

