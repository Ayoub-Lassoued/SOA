package com.ayoub.telephone.service;

import com.ayoub.telephone.dto.APIResponseDto;

public interface TelephoneService {
    APIResponseDto getTelephoneBycodeTelephone(String codeTelephone);
}