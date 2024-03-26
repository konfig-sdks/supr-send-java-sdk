# PreferenceApi

All URIs are relative to *https://hub.suprsend.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUserChannelPreferences**](PreferenceApi.md#getUserChannelPreferences) | **GET** /v1/subscriber/{distinct_id}/channel_preference | Get User Preferences (Channel level) |
| [**updateChannelPreferences**](PreferenceApi.md#updateChannelPreferences) | **POST** /v1/subscriber/{distinct_id}/channel_preference | Update User Preferences (Channel level) |


<a name="getUserChannelPreferences"></a>
# **getUserChannelPreferences**
> Object getUserChannelPreferences(distinctId).tenantId(tenantId).execute();

Get User Preferences (Channel level)

API to get user channel preferences

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SuprSend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PreferenceApi;
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
              .preference
              .getUserChannelPreferences(distinctId)
              .tenantId(tenantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PreferenceApi#getUserChannelPreferences");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .preference
              .getUserChannelPreferences(distinctId)
              .tenantId(tenantId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PreferenceApi#getUserChannelPreferences");
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

<a name="updateChannelPreferences"></a>
# **updateChannelPreferences**
> Object updateChannelPreferences(distinctId).tenantId(tenantId).preferenceUpdateChannelPreferencesRequest(preferenceUpdateChannelPreferencesRequest).execute();

Update User Preferences (Channel level)

API to update user channel preferences

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SuprSend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PreferenceApi;
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
    List<PreferenceUpdateChannelPreferencesRequestChannelPreferencesInner> channelPreferences = Arrays.asList(); // Use this to update channel level user preferences. Set `is_restricted - true` if the channel is opted_out by the user. This will only send critical notifications to the user which can't be opted out
    String tenantId = "tenantId_example"; // to fetch user preferences for a particular brand
    try {
      Object result = client
              .preference
              .updateChannelPreferences(distinctId)
              .channelPreferences(channelPreferences)
              .tenantId(tenantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PreferenceApi#updateChannelPreferences");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .preference
              .updateChannelPreferences(distinctId)
              .channelPreferences(channelPreferences)
              .tenantId(tenantId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PreferenceApi#updateChannelPreferences");
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
| **preferenceUpdateChannelPreferencesRequest** | [**PreferenceUpdateChannelPreferencesRequest**](PreferenceUpdateChannelPreferencesRequest.md)|  | [optional] |

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
| **200** | 200 |  -  |

