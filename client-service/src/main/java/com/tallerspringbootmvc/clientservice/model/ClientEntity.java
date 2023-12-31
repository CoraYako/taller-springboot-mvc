package com.tallerspringbootmvc.clientservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "clients")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String documentNumber;
    private String phoneNumber;
    private String email;
    private boolean isValidated;
}
