package com.tallerspringbootmvc.walletservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "wallets")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WalletEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long walletId;

    // pueden utilizar el ID del cliente
    private String clientDocumentNumber;
    private BigDecimal balance;

    // tipo de moneda, puede ser ENUM o String
    private String currency;
}
