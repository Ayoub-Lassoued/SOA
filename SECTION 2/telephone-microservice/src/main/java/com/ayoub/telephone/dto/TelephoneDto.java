package com.ayoub.telephone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TelephoneDto {
    private Long id;
    private String nomTelephone;
    private String codeTelephone;
    private double prix;
    private String idEtat;
    private String nomEtat;
}