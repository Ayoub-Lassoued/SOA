package com.ayoub.telephone.service;

import com.ayoub.telephone.dto.APIResponseDto;
import com.ayoub.telephone.dto.EtatDto;
import com.ayoub.telephone.dto.TelephoneDto;
import com.ayoub.telephone.entities.Telephone;
import com.ayoub.telephone.repos.telephoneRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@AllArgsConstructor
@Service
public class TelephoneServiceImpl implements TelephoneService {

    private final telephoneRepository telRepository;
    //private final WebClient webClient;
    private APIClient apiClient;


    @Override
    public APIResponseDto getTelephoneBycodeTelephone(String codeTelephone) {

        Telephone telephone = telRepository.findByCodeTelephone(codeTelephone);

        /* EtatDto etatDto = webClient.get()
                .uri("http://localhost:8081/api/etat/" + telephone.getIdEtat())
                .retrieve()
                .bodyToMono(EtatDto.class)
                .block(); */
        EtatDto etatDto = apiClient.getEtatById(telephone.getIdEtat());

        TelephoneDto telephoneDto = new TelephoneDto(
                telephone.getId(),
                telephone.getNomTelephone(),
                telephone.getCodeTelephone(),
                telephone.getPrix(),
                telephone.getIdEtat(),
                etatDto.getNomEtat()
        );

        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setTelephoneDto(telephoneDto);
        apiResponseDto.setEtatDto(etatDto);

        return apiResponseDto;
    }
}