package com.tallerspringbootmvc.movementservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "movements")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
// Se encarga de registrar los movimientos del cliente
public class MovementEntity {

    private Long movementId;

    // relación con la transferencia hecha
    private Long transactionId;
    private Integer operationNumber;
    private Integer clientDocumentNumber;

    // puede ser DEPOSITO o TRANSFERENCIA
    private String transactionType;
    private BigDecimal amount;
    private LocalDateTime date;

    /**
     * Forma en la que pueden formatear fechas que provengan de una instancia de LocalDateTime
    private void dateFormatter() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        String stringDate = FORMATTER.format(localDateTime); // 26/08/2023 13:01
    }
    **/

}
