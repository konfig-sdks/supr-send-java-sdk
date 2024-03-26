# EventApi

All URIs are relative to *https://hub.suprsend.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**triggerEvent**](EventApi.md#triggerEvent) | **POST** /event | Trigger an Event |


<a name="triggerEvent"></a>
# **triggerEvent**
> Object triggerEvent().eventTriggerEventRequest(eventTriggerEventRequest).execute();

Trigger an Event

API used to pass event which can then be used to trigger workflows created on SuprSend dashboard

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SuprSend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://hub.suprsend.com";
    
    configuration.sec0  = "YOUR API KEY";
    SuprSend client = new SuprSend(configuration);
    String distinctId = "_distinct_id_"; // distinct_id of recipient who should receive the notification
    String event = "_event_name_"; // string identifier for the event like `product_purchased`
    List<EventTriggerEventRequestUserOperationsInner> $userOperations = Arrays.asList(); // Creating & updating users on SuprSend is done by sending an `$user_operations` event. All changes can be combined in one API call in an easy to replay format
    String properties = "{}"; // a dictionary representing event attributes like `first_name`. Event properties can be used to pass template variables in case of event based trigger
    String brandId = "brandId_example"; // string identifier of the brand this event is associated with
    String $idempotencyKey = "$idempotencyKey_example"; // Idempotency key (valid for 24hours)
    try {
      Object result = client
              .event
              .triggerEvent(distinctId, event)
              .$userOperations($userOperations)
              .properties(properties)
              .brandId(brandId)
              .$idempotencyKey($idempotencyKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#triggerEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .event
              .triggerEvent(distinctId, event)
              .$userOperations($userOperations)
              .properties(properties)
              .brandId(brandId)
              .$idempotencyKey($idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#triggerEvent");
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
| **eventTriggerEventRequest** | [**EventTriggerEventRequest**](EventTriggerEventRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | 202 |  -  |

