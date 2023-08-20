package com.tallerspringbootmvc.clientservice.service;

import com.tallerspringbootmvc.clientservice.dto.ClientRequestDTO;
import com.tallerspringbootmvc.clientservice.dto.ClientResponseDTO;
import com.tallerspringbootmvc.clientservice.model.ClientEntity;
import com.tallerspringbootmvc.clientservice.model.mapper.ClientMapper;
import com.tallerspringbootmvc.clientservice.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    @Override
    public ClientResponseDTO createClient(ClientRequestDTO requestDTO) {
        if (Objects.isNull(requestDTO))
            throw new RuntimeException("La request no puede contener un objeto vacío.");

        ClientEntity client = clientMapper.toEntity(requestDTO);
        client = clientRepository.save(client);


        clientRepository.save(client);
        clientRepository.findById(client.getId());



        return clientMapper.toDTO(client);
    }
}
