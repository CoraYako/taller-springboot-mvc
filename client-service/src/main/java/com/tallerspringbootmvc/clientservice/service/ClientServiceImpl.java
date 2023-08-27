package com.tallerspringbootmvc.clientservice.service;

import com.tallerspringbootmvc.clientservice.dto.client.ClientRequestDTO;
import com.tallerspringbootmvc.clientservice.dto.wallet.WalletRequestDTO;
import com.tallerspringbootmvc.clientservice.model.ClientEntity;
import com.tallerspringbootmvc.clientservice.model.mapper.ClientMapper;
import com.tallerspringbootmvc.clientservice.repository.ClientRepository;
import com.tallerspringbootmvc.clientservice.utils.WalletAPIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;
    private final WalletAPIClient apiClient;

    @Override
    public void createClient(ClientRequestDTO requestDTO) {
        if (Objects.isNull(requestDTO))
            throw new RuntimeException("El Cliente no puede ser nulo.");

        ClientEntity client = clientMapper.toEntity(requestDTO);

        WalletRequestDTO walletRequestDTO = WalletRequestDTO.builder()
                .clientDocumentNumber(client.getDocumentNumber())
                .build();

        apiClient.createWallet(walletRequestDTO);

        clientRepository.save(client);
    }
}
