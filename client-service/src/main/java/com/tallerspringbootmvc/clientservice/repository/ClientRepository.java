package com.tallerspringbootmvc.clientservice.repository;

import com.tallerspringbootmvc.clientservice.model.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {

    boolean existsByEmail(String email);
}
