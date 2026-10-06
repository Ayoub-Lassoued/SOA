package com.ayoub.etatmicroservice.service;

import com.ayoub.etatmicroservice.dto.EtatDto;
import com.ayoub.etatmicroservice.entities.Etat;
import com.ayoub.etatmicroservice.repos.EtatRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class EtatServiceImpl implements EtatService {

    private EtatRepository etatRepository;

    @Override
    public EtatDto getEtatById(Long id) {

        Etat etat = etatRepository.findById(id).get();

        return new EtatDto(
                etat.getId(),
                etat.getIdEtat(),
                etat.getNomEtat()
        );
    }
}