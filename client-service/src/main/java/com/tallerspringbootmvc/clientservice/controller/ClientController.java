package com.tallerspringbootmvc.clientservice.controller;

import com.tallerspringbootmvc.clientservice.dto.ClientRequestDTO;
import com.tallerspringbootmvc.clientservice.dto.ClientResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/clients")
public class ClientController {

    // http://localhost:8080 /api/v1/clients (POST, GET, PUT, PATCH, DELETE)
    // /http://localhost:8080api/v1/clients/2

    @PostMapping
    public ResponseEntity<ClientResponseDTO> createClient(@RequestBody ClientRequestDTO requestDTO) {
        // logica para la creación del usuario/cliente
        ClientResponseDTO responseDTO = new ClientResponseDTO();
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }

    @PutMapping(value = "{clientId}")
    public ResponseEntity<ClientResponseDTO> updateClientById(
            @PathVariable String clientId, @RequestBody ClientRequestDTO requestDTO
    ) {
        ClientResponseDTO responseDTO = new ClientResponseDTO();
        return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
    }


    @GetMapping(value = "/{clientId}")
    public ResponseEntity<?> getClientById(@PathVariable String clientId) {
        // llamado al método para obtener un cliente en el service
        ClientResponseDTO responseDTO = new ClientResponseDTO();

        return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
    }

    @DeleteMapping(value = "/{clientId}")
    public ResponseEntity<Void> deleteClientById(@PathVariable String clientId) {
        // llamado al método para obtener un cliente en el service

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
