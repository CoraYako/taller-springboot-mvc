package com.tallerspringbootmvc.walletservice.model.mapper;

import com.tallerspringbootmvc.walletservice.dto.WalletResponseDTO;
import com.tallerspringbootmvc.walletservice.model.WalletEntity;
import jakarta.validation.constraints.NotNull;

public interface WalletMapper {

    WalletResponseDTO toDTO(@NotNull WalletEntity entity);
}
