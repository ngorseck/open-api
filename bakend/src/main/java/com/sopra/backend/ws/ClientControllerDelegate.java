package com.sopra.backend.ws;

import com.sopra.generated.api.ClientApi;
import com.sopra.generated.api.ClientApiDelegate;
import com.sopra.generated.model.ClientDTO;
import com.sopra.generated.model.ClientResultDTO;
import com.sopra.generated.model.ClientResultListDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//Ceci ne marche pas

//http://localhost:8080/clients/1
//http://localhost:8080/clients?currentPage=0&sizePage=2
@RestController("${openapi.aPIDeTest.base-path::/service/api}")
public class ClientControllerDelegate implements ClientApiDelegate {

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
        clientDTO.setIdentifiant(Long.toString(idClient));
        clientDTO.setFirstName("Ngor");
        clientDTO.setLastName("SECK");

        return ResponseEntity.ok(clientDTO);
    }
}
