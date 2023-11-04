package com.sopra.generated.api;

import com.sopra.generated.model.ClientDTO;
import com.sopra.generated.model.ClientResultListDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link ClientApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-04T02:13:04.009845800+01:00[Europe/Madrid]")
public interface ClientApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /clients : Get All Actifs Clients
     *
     * @param currentPage  (required)
     * @param sizePage  (required)
     * @return SUCCESS (status code 200)
     *         or NOT FOUND (status code 404)
     *         or BAD REQUEST (status code 400)
     * @see ClientApi#getAllClients
     */
    default ResponseEntity<ClientResultListDTO> getAllClients(Integer currentPage,
        Integer sizePage) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"resultUserList\" : [ { \"lastName\" : \"lastName\", \"firstName\" : \"firstName\" }, { \"lastName\" : \"lastName\", \"firstName\" : \"firstName\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /clients/{idClient} : Retrieve an client
     *
     * @param idClient  (required)
     * @return SUCCESS (status code 200)
     *         or NOT FOUND (status code 404)
     *         or BAD REQUEST (status code 400)
     * @see ClientApi#getClient
     */
    default ResponseEntity<ClientDTO> getClient(Long idClient) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"identifiant\" : \"identifiant\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
