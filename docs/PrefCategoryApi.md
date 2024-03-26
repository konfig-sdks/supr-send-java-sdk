# PrefCategoryApi

All URIs are relative to *https://hub.suprsend.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUserPreferencesAllCategories**](PrefCategoryApi.md#getUserPreferencesAllCategories) | **GET** /v1/subscriber/{distinct_id}/category | Get User Preferences (All Categories) |


<a name="getUserPreferencesAllCategories"></a>
# **getUserPreferencesAllCategories**
> Object getUserPreferencesAllCategories(distinctId).tenantId(tenantId).execute();

Get User Preferences (All Categories)

API to get user category preferences

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SuprSend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PrefCategoryApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://hub.suprsend.com";
    
    configuration.sec0  = "YOUR API KEY";
    SuprSend client = new SuprSend(configuration);
    String distinctId = "distinctId_example"; // distinct_id of the user whose preferences should be fetched
    String tenantId = "tenantId_example"; // to fetch user preferences for a particular brand
    try {
      Object result = client
              .prefCategory
              .getUserPreferencesAllCategories(distinctId)
              .tenantId(tenantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PrefCategoryApi#getUserPreferencesAllCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .prefCategory
              .getUserPreferencesAllCategories(distinctId)
              .tenantId(tenantId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PrefCategoryApi#getUserPreferencesAllCategories");
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
| **distinctId** | **String**| distinct_id of the user whose preferences should be fetched | |
| **tenantId** | **String**| to fetch user preferences for a particular brand | [optional] |

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
| **200** | 200 |  -  |

