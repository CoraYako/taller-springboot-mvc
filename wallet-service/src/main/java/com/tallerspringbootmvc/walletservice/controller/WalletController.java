package com.tallerspringbootmvc.walletservice.controller;

import com.tallerspringbootmvc.walletservice.dto.WalletRequestDTO;
import com.tallerspringbootmvc.walletservice.dto.WalletResponseDTO;
import com.tallerspringbootmvc.walletservice.service.WalletService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/wallets")
@RequiredArgsConstructor
public class WalletController {

    private final WalletService walletService;

    @PostMapping
    public ResponseEntity<Void> createWallet(@Valid @RequestBody WalletRequestDTO requestDTO) {
        walletService.createWallet(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping(value = "/{clientDocumentNumber}")
    public ResponseEntity<WalletResponseDTO> getBalance(@PathVariable String clientDocumentNumber) {
        WalletResponseDTO responseDTO = walletService.getBalance(clientDocumentNumber);
        return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
    }
}
