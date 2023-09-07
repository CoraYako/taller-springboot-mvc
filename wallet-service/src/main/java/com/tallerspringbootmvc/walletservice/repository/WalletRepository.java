package com.tallerspringbootmvc.walletservice.repository;

import com.tallerspringbootmvc.walletservice.model.WalletEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WalletRepository extends JpaRepository<WalletEntity, Long> {

    Optional<WalletEntity> findByClientDocumentNumber(String clientDocumentNumber);
}
