package com.tallerspringbootmvc.clientservice.dto.client;

import lombok.Builder;

@Builder
public record ClientResponseDTO(
        Long clientId,
        String documentNumber,
        String phoneNumber,
        String email
) {
}