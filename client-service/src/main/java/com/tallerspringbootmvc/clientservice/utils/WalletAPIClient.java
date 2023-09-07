package com.tallerspringbootmvc.clientservice.utils;

import com.tallerspringbootmvc.clientservice.dto.wallet.WalletRequestDTO;
import com.tallerspringbootmvc.clientservice.dto.wallet.WalletResponseDTO;
import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "WALLET-SERVICE", url = "http://localhost:8081/api/v1/wallets")
public interface WalletAPIClient {

    @PostMapping
    void createWallet(@Valid @RequestBody WalletRequestDTO requestDTO);

    @GetMapping(value = "/{clientDocumentNumber}")
    ResponseEntity<WalletResponseDTO> getBalance(@PathVariable String clientDocumentNumber);
}
