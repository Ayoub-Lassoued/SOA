package com.ayoub.telephone.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EtatDto {
    private Long id;
    private String idEtat ;
    private String nomEtat;
}
