# WorkflowApi

All URIs are relative to *https://hub.suprsend.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**configureTrigger**](WorkflowApi.md#configureTrigger) | **POST** /{workspace_key}/trigger | Trigger Workflow |


<a name="configureTrigger"></a>
# **configureTrigger**
> Object configureTrigger(workspaceKey).workflowConfigureTriggerRequest(workflowConfigureTriggerRequest).execute();

Trigger Workflow

API to configure and trigger workflow dynamically

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SuprSend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://hub.suprsend.com";
    
    configuration.sec0  = "YOUR API KEY";
    SuprSend client = new SuprSend(configuration);
    String name = "_workflow_name_"; // Unique name of the workflow. The workflow name should be easily identifiable for your reference at a later stage. You can see workflow-related analytics on the workflow page (how many notifications were sent, delivered, clicked or interacted).
    String template = "_template_slug_"; // Unique slug name of the template created on SuprSend dashboard. You can get this by clicking on the clipboard icon next to the Template name on SuprSend templates page.
    String notificationCategory = "transactional"; // Category in which your notification belongs. You can understand more about them in the 'Notification Category' documentation
    List<WorkflowConfigureTriggerRequestUsersInner> users = Arrays.asList(); // Array object of target users.
    String workspaceKey = "workspaceKey_example";
    String data = "{ \\\"key\\\": { \\\"k1\\\": \\\"v1\\\", \\\"k2\\\": \\\"v2\\\" } }"; // Mock data to replace the template variables.
    WorkflowConfigureTriggerRequestDelivery delivery = new WorkflowConfigureTriggerRequestDelivery();
    String delay = "delay_example"; // Workflow will be halted for the time mentioned in delay, and become active once the delay period is over. Format - `XXdXXhXXmXXs` or if its number (n) then delay is in seconds (n)
    LocalDate triggerAt = LocalDate.now(); // Trigger workflow on a specific date-time. Format - date string in ISO 8601 eg. \\\"2022-08-27T20:14:51.643Z\\\"
    String brandId = "brandId_example"; // string identifier of the brand this workflow is associated with
    String $idempotencyKey = "$idempotencyKey_example"; // Idempotency_key (valid for 24hrs)
    try {
      Object result = client
              .workflow
              .configureTrigger(name, template, notificationCategory, users, workspaceKey)
              .data(data)
              .delivery(delivery)
              .delay(delay)
              .triggerAt(triggerAt)
              .brandId(brandId)
              .$idempotencyKey($idempotencyKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#configureTrigger");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .workflow
              .configureTrigger(name, template, notificationCategory, users, workspaceKey)
              .data(data)
              .delivery(delivery)
              .delay(delay)
              .triggerAt(triggerAt)
              .brandId(brandId)
              .$idempotencyKey($idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowApi#configureTrigger");
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
| **workflowConfigureTriggerRequest** | [**WorkflowConfigureTriggerRequest**](WorkflowConfigureTriggerRequest.md)|  | [optional] |

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

