package com.tallerspringbootmvc.clientservice.controller;

import com.tallerspringbootmvc.clientservice.constants.ClientConstants;
import com.tallerspringbootmvc.clientservice.dto.client.ClientRequestDTO;
import com.tallerspringbootmvc.clientservice.dto.wallet.WalletResponseDTO;
import com.tallerspringbootmvc.clientservice.service.ClientService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = ClientConstants.BASE_URI)
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @PostMapping
    public ResponseEntity<Void> createClient(@Valid @RequestBody ClientRequestDTO requestDTO) {
        clientService.createClient(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping(value = "/balance/{documentNumber}")
    public ResponseEntity<WalletResponseDTO> getBalance(@PathVariable String documentNumber) {
        WalletResponseDTO responseDTO = clientService.getBalance(documentNumber);
        return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
    }
}
