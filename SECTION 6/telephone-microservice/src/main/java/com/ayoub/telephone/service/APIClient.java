package com.ayoub.telephone.service;

import com.ayoub.telephone.dto.EtatDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8081", value = "ETAT-MICROSERVICE")
@FeignClient(name="ETAT-MICROSERVICE")
public interface APIClient {

    @GetMapping("api/etat/{id}")
    EtatDto getEtatById(@PathVariable("id") String idEtat);
}