package com.tallerspringbootmvc.clientservice.model.mapper;

import com.tallerspringbootmvc.clientservice.dto.ClientRequestDTO;
import com.tallerspringbootmvc.clientservice.dto.ClientResponseDTO;
import com.tallerspringbootmvc.clientservice.model.ClientEntity;

public interface ClientMapper {

    // DTO ---> Entity
    ClientEntity toEntity(ClientRequestDTO dto);

    // Entity ---> DTO
    ClientResponseDTO toDTO(ClientEntity entity);
}
