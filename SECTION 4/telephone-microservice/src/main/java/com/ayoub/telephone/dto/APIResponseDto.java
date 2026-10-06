package com.ayoub.telephone.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class APIResponseDto {
    private TelephoneDto telephoneDto;
    private EtatDto etatDto;
}
