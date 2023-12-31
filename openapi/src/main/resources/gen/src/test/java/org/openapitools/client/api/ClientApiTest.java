/*
 * API Client
 * Ecommerce API
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ClientDTO;
import org.openapitools.client.model.ClientResultListDTO;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClientApi
 */
@Disabled
public class ClientApiTest {

    private final ClientApi api = new ClientApi();

    /**
     * Add a client
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addClientTest() throws ApiException {
        ClientDTO clientDTO = null;
        ClientDTO response = api.addClient(clientDTO);
        // TODO: test validations
    }

    /**
     * Get All Actifs Clients
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllClientsTest() throws ApiException {
        Integer currentPage = null;
        Integer sizePage = null;
        ClientResultListDTO response = api.getAllClients(currentPage, sizePage);
        // TODO: test validations
    }

    /**
     * Retrieve an client
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getClientTest() throws ApiException {
        Long idClient = null;
        ClientDTO response = api.getClient(idClient);
        // TODO: test validations
    }

    /**
     * Add a client
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateClientTest() throws ApiException {
        Long idClient = null;
        ClientDTO clientDTO = null;
        ClientDTO response = api.updateClient(idClient, clientDTO);
        // TODO: test validations
    }

}
