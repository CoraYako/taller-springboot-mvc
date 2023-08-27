package com.tallerspringbootmvc.walletservice.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public record WalletRequestDTO(
        @Pattern(regexp = "[0-9]{8}") @NotEmpty @NotBlank String clientDocumentNumber
) {
}
