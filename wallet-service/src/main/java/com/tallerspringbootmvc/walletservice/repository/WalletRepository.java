package com.tallerspringbootmvc.walletservice.repository;

import com.tallerspringbootmvc.walletservice.model.WalletEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<WalletEntity, Long> {
}
