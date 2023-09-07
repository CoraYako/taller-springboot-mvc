package com.tallerspringbootmvc.clientservice.model.mapper;

import com.tallerspringbootmvc.clientservice.dto.client.ClientRequestDTO;
import com.tallerspringbootmvc.clientservice.dto.client.ClientResponseDTO;
import com.tallerspringbootmvc.clientservice.model.ClientEntity;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

@Validated
public interface ClientMapper {

    // DTO ---> Entity
    ClientEntity toEntity(@NotNull ClientRequestDTO dto);

    // Entity ---> DTO
    ClientResponseDTO toDTO(@NotNull ClientEntity entity);
}
