# BroadcastApi

All URIs are relative to *https://hub.suprsend.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**triggerMessageList**](BroadcastApi.md#triggerMessageList) | **POST** /{workspace_key}/broadcast | Trigger Broadcast |


<a name="triggerMessageList"></a>
# **triggerMessageList**
> Object triggerMessageList(workspaceKey).broadcastTriggerMessageListRequest(broadcastTriggerMessageListRequest).execute();

Trigger Broadcast

API to trigger broadcast messages on a list of users

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SuprSend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BroadcastApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://hub.suprsend.com";
    
    configuration.sec0  = "YOUR API KEY";
    SuprSend client = new SuprSend(configuration);
    String listId = "_list_id_"; // unique identifier to user list that you want to send broadcast messages to.
    String template = "_template_slug_"; // Unique slug name of the template created on SuprSend dashboard. You can get this by clicking on the clipboard icon next to the Template name on SuprSend templates page.
    String notificationCategory = "transactional"; // Category in which your notification belongs. You can understand more about them in the [Notification Category](https://docs.suprsend.com/docs/notification-category) documentation
    String workspaceKey = "workspaceKey_example";
    List<String> channels = Arrays.asList(); // If set, broadcast will be sent only on the channels defined here irrespective of communication channels present in user profile.
    String data = "{ \\\"key\\\": { \\\"k1\\\": \\\"v1\\\", \\\"k2\\\": \\\"v2\\\" } }"; // Mock data to replace the template variables.
    String delay = "delay_example"; // Broadcast will be halted for the time mentioned in delay, and become active once the delay period is over. Format - `XXdXXhXXmXXs` or if its number (n) then delay is in seconds (n)
    LocalDate triggerAt = LocalDate.now(); // Trigger broadcast on a specific date-time. Format - date string in ISO 8601 eg. \\\"2022-08-27T20:14:51.643Z\\\"
    String brandId = "brandId_example"; // string identifier of the brand this broadcast is associated with
    try {
      Object result = client
              .broadcast
              .triggerMessageList(listId, template, notificationCategory, workspaceKey)
              .channels(channels)
              .data(data)
              .delay(delay)
              .triggerAt(triggerAt)
              .brandId(brandId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastApi#triggerMessageList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .broadcast
              .triggerMessageList(listId, template, notificationCategory, workspaceKey)
              .channels(channels)
              .data(data)
              .delay(delay)
              .triggerAt(triggerAt)
              .brandId(brandId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastApi#triggerMessageList");
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
| **workspaceKey** | **String**|  | |
| **broadcastTriggerMessageListRequest** | [**BroadcastTriggerMessageListRequest**](BroadcastTriggerMessageListRequest.md)|  | [optional] |

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

