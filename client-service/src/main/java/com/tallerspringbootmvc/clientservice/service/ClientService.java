package com.tallerspringbootmvc.clientservice.service;

import com.tallerspringbootmvc.clientservice.dto.client.ClientRequestDTO;
import com.tallerspringbootmvc.clientservice.dto.wallet.WalletResponseDTO;

public interface ClientService {

    void createClient(ClientRequestDTO requestDTO);

    WalletResponseDTO getBalance(String documentNumber);
}
