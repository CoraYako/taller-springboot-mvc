package com.tallerspringbootmvc.walletservice.service;

import com.tallerspringbootmvc.walletservice.dto.WalletRequestDTO;
import com.tallerspringbootmvc.walletservice.dto.WalletResponseDTO;
import com.tallerspringbootmvc.walletservice.model.WalletEntity;
import com.tallerspringbootmvc.walletservice.model.mapper.WalletMapper;
import com.tallerspringbootmvc.walletservice.repository.WalletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WalletServiceImpl implements WalletService {

    private final WalletRepository walletRepository;
    private final WalletMapper mapper;

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

    @Override
    public WalletResponseDTO getBalance(String clientDocumentNumber) {
        if (clientDocumentNumber.trim().isEmpty())
            throw new RuntimeException("Número de documento del cliente inválido.");

        Optional<WalletEntity> optionalWallet = walletRepository.findByClientDocumentNumber(clientDocumentNumber);
        return mapper.toDTO(optionalWallet.orElseThrow(() -> new RuntimeException("La billetera solicitada no se ecnuentra en la base de datos.")));
    }
}
