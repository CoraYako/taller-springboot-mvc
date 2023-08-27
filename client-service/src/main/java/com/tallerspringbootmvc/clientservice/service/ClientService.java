package com.tallerspringbootmvc.clientservice.service;

import com.tallerspringbootmvc.clientservice.dto.client.ClientRequestDTO;

public interface ClientService {

    void createClient(ClientRequestDTO requestDTO);
}
