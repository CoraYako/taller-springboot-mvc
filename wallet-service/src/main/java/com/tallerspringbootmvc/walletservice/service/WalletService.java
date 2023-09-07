package com.tallerspringbootmvc.walletservice.service;

import com.tallerspringbootmvc.walletservice.dto.WalletRequestDTO;
import com.tallerspringbootmvc.walletservice.dto.WalletResponseDTO;

public interface WalletService {

    void createWallet(WalletRequestDTO requestDTO);

    WalletResponseDTO getBalance(String clientDocumentNumber);
}
