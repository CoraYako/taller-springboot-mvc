package com.tallerspringbootmvc.walletservice.service;

import com.tallerspringbootmvc.walletservice.dto.WalletRequestDTO;
import com.tallerspringbootmvc.walletservice.model.WalletEntity;
import com.tallerspringbootmvc.walletservice.model.mapper.WalletMapper;
import com.tallerspringbootmvc.walletservice.repository.WalletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class WalletServiceImpl implements WalletService {

    private final WalletRepository walletRepository;

    @Override
    public void createWallet(WalletRequestDTO requestDTO) {
        if (requestDTO.clientDocumentNumber().trim().isEmpty())
            throw new RuntimeException("El número de documento del cliente debe ser válido.");

        WalletEntity wallet = WalletEntity.builder()
                .clientDocumentNumber(requestDTO.clientDocumentNumber())
                .balance(BigDecimal.valueOf(0))
                .currency("USD")
                .build();

        walletRepository.save(wallet);
    }
}
