package com.tallerspringbootmvc.walletservice.dto;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record WalletResponseDTO(
        Long walletId,
        BigDecimal balance,
        String currency
) {
}
