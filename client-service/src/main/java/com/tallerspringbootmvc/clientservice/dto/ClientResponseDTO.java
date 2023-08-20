package com.tallerspringbootmvc.clientservice.dto;

import lombok.Builder;

@Builder
public record ClientResponseDTO(
        Long clientId,
        Integer documentNumber,
        String phoneNumber,
        String email
) {
}