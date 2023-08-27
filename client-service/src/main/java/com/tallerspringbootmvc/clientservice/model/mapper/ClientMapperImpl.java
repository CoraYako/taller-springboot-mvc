package com.tallerspringbootmvc.clientservice.model.mapper;

import com.tallerspringbootmvc.clientservice.dto.client.ClientRequestDTO;
import com.tallerspringbootmvc.clientservice.dto.client.ClientResponseDTO;
import com.tallerspringbootmvc.clientservice.model.ClientEntity;
import org.springframework.stereotype.Component;

@Component
public class ClientMapperImpl implements ClientMapper {

    @Override
    public ClientEntity toEntity(ClientRequestDTO dto) {
        return ClientEntity.builder()
                .documentNumber(dto.documentNumber())
                .phoneNumber(dto.phoneNumber())
                .email(dto.email())
                .build();
    }

    @Override
    public ClientResponseDTO toDTO(ClientEntity entity) {
        return ClientResponseDTO.builder()
                .clientId(entity.getId())
                .documentNumber(entity.getDocumentNumber())
                .phoneNumber(entity.getPhoneNumber())
                .email(entity.getEmail())
                .build();
    }
}
