package com.ayoub.telephone.restController;

import com.ayoub.telephone.dto.APIResponseDto;
import com.ayoub.telephone.dto.TelephoneDto;
import com.ayoub.telephone.service.TelephoneService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/telephone")
@AllArgsConstructor
public class TelephoneController {

    private TelephoneService telephoneService;

    @GetMapping("/{code}")
    public ResponseEntity<APIResponseDto> getTelephoneBycodeTelephone(
            @PathVariable("code") String code) {

        return new ResponseEntity<>(
                telephoneService.getTelephoneBycodeTelephone(code),
                HttpStatus.OK
        );
    }
}