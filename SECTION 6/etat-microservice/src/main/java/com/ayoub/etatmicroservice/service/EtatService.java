package com.ayoub.etatmicroservice.service;

import com.ayoub.etatmicroservice.dto.EtatDto;

public interface EtatService {


    EtatDto getEtatById(Long id);
}
