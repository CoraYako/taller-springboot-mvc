package com.tallerspringbootmvc.clientservice.dto.wallet;

import java.math.BigDecimal;

public record WalletResponseDTO(
        Long walletId,
        BigDecimal balance,
        String currency
) {
}
