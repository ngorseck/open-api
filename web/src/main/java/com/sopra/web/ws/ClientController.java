package com.sopra.web.ws;

import com.sopra.generated.api.ClientApiDelegate;
import com.sopra.generated.model.ClientDTO;
import com.sopra.generated.model.ClientResultDTO;
import com.sopra.generated.model.ClientResultListDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClientController implements ClientApiDelegate {

    @Override
    public ResponseEntity<ClientResultListDTO> getAllClients(Integer currentPage, Integer sizePage) throws Exception {
        ClientResultListDTO clientResultListDTO = new ClientResultListDTO();
        List<ClientResultDTO> clientResultDTOS = new ArrayList<>();
        ClientResultDTO clientDTO = new ClientResultDTO();
        clientDTO.setFirstName("Ngor");
        clientDTO.setLastName("SECK");
        clientResultDTOS.add(clientDTO);
        clientResultListDTO.setResultUserList(clientResultDTOS);

        return  ResponseEntity.ok(clientResultListDTO);
    }

    @Override
    public ResponseEntity<ClientDTO> getClient(Long idClient) throws Exception {
        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setIdentifiant("1234");
        clientDTO.setFirstName("Ngor");
        clientDTO.setLastName("SECK");

        return ResponseEntity.ok(clientDTO);
    }
}
