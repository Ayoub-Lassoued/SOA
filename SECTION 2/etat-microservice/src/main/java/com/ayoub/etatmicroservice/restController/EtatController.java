package com.ayoub.etatmicroservice.restController;

import com.ayoub.etatmicroservice.config.Configuration;
import com.ayoub.etatmicroservice.dto.EtatDto;
import com.ayoub.etatmicroservice.service.EtatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/etat")

public class EtatController {
    @Autowired
    Configuration configuration;


    @Value("${build.version}")
    private String buildVersion;


    public EtatController(EtatService etatService) {
        this.etatService = etatService;
    }

    private EtatService etatService;

    @GetMapping("{id}")
    public ResponseEntity<EtatDto> findEtatById(
            @PathVariable("id") Long id) {

        return new ResponseEntity<EtatDto>(
                etatService.getEtatById(id),
                HttpStatus.OK
        );
    }

    @GetMapping("/version")
    public ResponseEntity<String> version()
    {
        return ResponseEntity.status(HttpStatus.OK).body(buildVersion);
    }
    @GetMapping("/author")
    public ResponseEntity<String> retrieveAuthorInfo() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(configuration.getName()+" "+configuration.getEmail() );
    }
}