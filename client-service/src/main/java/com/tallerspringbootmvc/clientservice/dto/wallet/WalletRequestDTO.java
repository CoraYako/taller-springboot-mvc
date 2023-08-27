package com.tallerspringbootmvc.clientservice.dto.wallet;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;

@Builder
public record WalletRequestDTO(
        @Pattern(regexp = "[0-9]{8}") @NotEmpty @NotBlank String clientDocumentNumber
) {
}
