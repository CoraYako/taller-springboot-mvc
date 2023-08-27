package com.tallerspringbootmvc.walletservice.model.mapper;

import com.tallerspringbootmvc.walletservice.dto.WalletResponseDTO;
import com.tallerspringbootmvc.walletservice.model.WalletEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Validated
public class WalletMapperImpl implements WalletMapper {

    @Override
    public WalletResponseDTO toDTO(WalletEntity entity) {
        return WalletResponseDTO.builder()
                .walletId(entity.getWalletId())
                .balance(entity.getBalance())
                .currency(entity.getCurrency())
                .build();
    }
}
