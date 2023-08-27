package com.tallerspringbootmvc.walletservice.service;

import com.tallerspringbootmvc.walletservice.dto.WalletRequestDTO;

public interface WalletService {

    void createWallet(WalletRequestDTO requestDTO);
}
