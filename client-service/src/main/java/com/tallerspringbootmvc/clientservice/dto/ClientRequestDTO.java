package com.tallerspringbootmvc.clientservice.dto;

import jakarta.validation.constraints.*;
import lombok.Builder;

@Builder
public record ClientRequestDTO(
        @NotNull @Min(value = 1000000) @Max(value = 100000000) Integer documentNumber,
        @NotBlank @NotEmpty @NotNull String phoneNumber,
        @Email String email
) {
}
