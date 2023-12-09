package com.samanecorporation.backend.ws;


import com.sopra.generated.api.ClientApi;
import com.sopra.generated.model.ClientDTO;
import com.sopra.generated.model.ClientResultDTO;
import com.sopra.generated.model.ClientResultListDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//ceci marche

//http://localhost:8080/ecommerce/api/clients/1
//http://localhost:8080/ecommerce/api/clients?currentPage=0&sizePage=2
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController implements ClientApi {

    @Override
    public ResponseEntity<ClientResultListDTO> getAllClients(Integer currentPage, Integer sizePage) throws Exception {
        ClientResultListDTO clientResultListDTO = new ClientResultListDTO();
        List<ClientResultDTO> clientResultDTOS = new ArrayList<>();
        ClientResultDTO clientDTO = new ClientResultDTO();
        clientDTO.setFirstName("Ngor");
        clientDTO.setLastName("SECK");
        clientResultDTOS.add(clientDTO);

        clientDTO = new ClientResultDTO();
        clientDTO.setFirstName("Oumar");
        clientDTO.setLastName("SECK");
        clientResultDTOS.add(clientDTO);

        clientDTO = new ClientResultDTO();
        clientDTO.setFirstName("Fatou");
        clientDTO.setLastName("SECK");
        clientResultDTOS.add(clientDTO);
        clientResultListDTO.setClientList(clientResultDTOS);

        return  ResponseEntity.ok(clientResultListDTO);
    }

    @Override
    public ResponseEntity<ClientDTO> getClient(Long idClient) throws Exception {
        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setIdClient(idClient);
        clientDTO.setFirstName("Moussa");
        clientDTO.setLastName("SECK");

        return ResponseEntity.ok(clientDTO);
    }

    @Override
    public ResponseEntity<ClientDTO> addClient(ClientDTO clientDTO) throws Exception {

        // Traitement pour lajout dans la base de donnees

        return ResponseEntity.ok(clientDTO);
    }

    @Override
    public ResponseEntity<ClientDTO> updateClient(Long idClient, ClientDTO clientDTO) throws Exception {
        // Traitement pour la mise a jour de la base de donnees

        clientDTO.setIdClient(idClient);

        return ResponseEntity.ok(clientDTO);
    }


}
