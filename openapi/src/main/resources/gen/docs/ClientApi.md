# ClientApi

All URIs are relative to *http://localhost:8080/ecommerce/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addClient**](ClientApi.md#addClient) | **POST** /clients | Add a client |
| [**getAllClients**](ClientApi.md#getAllClients) | **GET** /clients | Get All Actifs Clients |
| [**getClient**](ClientApi.md#getClient) | **GET** /clients-reference | Retrieve an client |
| [**updateClient**](ClientApi.md#updateClient) | **PUT** /clients-reference | Add a client |


<a name="addClient"></a>
# **addClient**
> ClientDTO addClient(clientDTO)

Add a client

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ecommerce/api");

    ClientApi apiInstance = new ClientApi(defaultClient);
    ClientDTO clientDTO = new ClientDTO(); // ClientDTO | 
    try {
      ClientDTO result = apiInstance.addClient(clientDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#addClient");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientDTO** | [**ClientDTO**](ClientDTO.md)|  | [optional] |

### Return type

[**ClientDTO**](ClientDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SUCCESS |  -  |
| **404** | NOT FOUND |  -  |
| **400** | BAD REQUEST |  -  |

<a name="getAllClients"></a>
# **getAllClients**
> ClientResultListDTO getAllClients(currentPage, sizePage)

Get All Actifs Clients

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ecommerce/api");

    ClientApi apiInstance = new ClientApi(defaultClient);
    Integer currentPage = 56; // Integer | 
    Integer sizePage = 56; // Integer | 
    try {
      ClientResultListDTO result = apiInstance.getAllClients(currentPage, sizePage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#getAllClients");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **currentPage** | **Integer**|  | |
| **sizePage** | **Integer**|  | |

### Return type

[**ClientResultListDTO**](ClientResultListDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SUCCESS |  -  |
| **404** | NOT FOUND |  -  |
| **400** | BAD REQUEST |  -  |

<a name="getClient"></a>
# **getClient**
> ClientDTO getClient(idClient)

Retrieve an client

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ecommerce/api");

    ClientApi apiInstance = new ClientApi(defaultClient);
    Long idClient = {"idClient":1}L; // Long | 
    try {
      ClientDTO result = apiInstance.getClient(idClient);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#getClient");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idClient** | **Long**|  | |

### Return type

[**ClientDTO**](ClientDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SUCCESS |  -  |
| **404** | NOT FOUND |  -  |
| **400** | BAD REQUEST |  -  |

<a name="updateClient"></a>
# **updateClient**
> ClientDTO updateClient(idClient, clientDTO)

Add a client

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/ecommerce/api");

    ClientApi apiInstance = new ClientApi(defaultClient);
    Long idClient = {"idClient":1}L; // Long | 
    ClientDTO clientDTO = new ClientDTO(); // ClientDTO | 
    try {
      ClientDTO result = apiInstance.updateClient(idClient, clientDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#updateClient");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idClient** | **Long**|  | |
| **clientDTO** | [**ClientDTO**](ClientDTO.md)|  | [optional] |

### Return type

[**ClientDTO**](ClientDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SUCCESS |  -  |
| **404** | NOT FOUND |  -  |
| **400** | BAD REQUEST |  -  |

