# SyncApi

All URIs are relative to *https://hub.suprsend.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listStartSync**](SyncApi.md#listStartSync) | **POST** /v1/subscriber_list/{list_id}/start_sync | Start Sync |


<a name="listStartSync"></a>
# **listStartSync**
> Object listStartSync(listId).execute();

Start Sync

Starts sync on the active(live) version of the list, identified by list_id, and creates an empty draft version.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SuprSend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SyncApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://hub.suprsend.com";
    
    configuration.sec0  = "YOUR API KEY";
    SuprSend client = new SuprSend(configuration);
    String listId = "_list_id_"; // Unique identifier of the list on which the sync needs to start to create a draft version
    try {
      Object result = client
              .sync
              .listStartSync(listId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncApi#listStartSync");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .sync
              .listStartSync(listId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SyncApi#listStartSync");
      System.err.println("Status code: " + e.getStatusCode());
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
| **listId** | **String**| Unique identifier of the list on which the sync needs to start to create a draft version | [default to _list_id_] |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 |  -  |

