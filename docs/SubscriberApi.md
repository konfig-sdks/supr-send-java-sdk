# SubscriberApi

All URIs are relative to *https://hub.suprsend.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addToDraftList**](SubscriberApi.md#addToDraftList) | **POST** /v1/subscriber_list/{list_id}/version/{version_id}/subscriber/add | Add Subscribers to Draft List |
| [**addToList**](SubscriberApi.md#addToList) | **POST** /v1/subscriber_list/{list_id}/subscriber/add | Add Subscribers to List |
| [**deleteDraftList**](SubscriberApi.md#deleteDraftList) | **PATCH** /v1/subscriber_list/{list_id}/version/{version_id}/delete | Delete Draft List |
| [**finishSyncDraftVersion**](SubscriberApi.md#finishSyncDraftVersion) | **PATCH** /v1/subscriber_list/{list_id}/version/{version_id}/finish_sync | Finish Sync |
| [**removeFromDraftList**](SubscriberApi.md#removeFromDraftList) | **POST** /v1/subscriber_list/{list_id}/version/{version_id}/subscriber/remove | Remove Subscribers from Draft List |
| [**updateUserPreferencesCategory**](SubscriberApi.md#updateUserPreferencesCategory) | **POST** /v1/subscriber/{distinct_id}/category/{category_slug} | Update User Preferences (Category level) |


<a name="addToDraftList"></a>
# **addToDraftList**
> Object addToDraftList(listId, versionId).subscriberAddToDraftListRequest(subscriberAddToDraftListRequest).execute();

Add Subscribers to Draft List

Add subscribers to a draft list with a version_id that uniquely identifies the draft list

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SuprSend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriberApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://hub.suprsend.com";
    
    configuration.sec0  = "YOUR API KEY";
    SuprSend client = new SuprSend(configuration);
    String listId = "_list_id_"; // Unique string idenitifier of the list to which user needs to be updated
    String versionId = "__version_id__"; // Unique string idenitifier of the draft version of the list to which user needs to be updated
    List<String> distinctIds = Arrays.asList(); // Array of subscriber_ids, uniquely identifying the subscribers to be added to the list.
    try {
      Object result = client
              .subscriber
              .addToDraftList(listId, versionId)
              .distinctIds(distinctIds)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriberApi#addToDraftList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .subscriber
              .addToDraftList(listId, versionId)
              .distinctIds(distinctIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriberApi#addToDraftList");
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
| **listId** | **String**| Unique string idenitifier of the list to which user needs to be updated | [default to _list_id_] |
| **versionId** | **String**| Unique string idenitifier of the draft version of the list to which user needs to be updated | [default to __version_id__] |
| **subscriberAddToDraftListRequest** | [**SubscriberAddToDraftListRequest**](SubscriberAddToDraftListRequest.md)|  | [optional] |

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

<a name="addToList"></a>
# **addToList**
> Object addToList(listId).subscriberAddToListRequest(subscriberAddToListRequest).execute();

Add Subscribers to List

API to add users / subscribers to the list

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SuprSend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriberApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://hub.suprsend.com";
    
    configuration.sec0  = "YOUR API KEY";
    SuprSend client = new SuprSend(configuration);
    String listId = "_list_id_"; // Unique string idenitifier of the list to which user needs to be updated
    List<String> distinctIds = Arrays.asList(); // Array of subscriber_ids, uniquely identifying the subscribers to be added to the list.
    try {
      Object result = client
              .subscriber
              .addToList(listId)
              .distinctIds(distinctIds)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriberApi#addToList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .subscriber
              .addToList(listId)
              .distinctIds(distinctIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriberApi#addToList");
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
| **listId** | **String**| Unique string idenitifier of the list to which user needs to be updated | [default to _list_id_] |
| **subscriberAddToListRequest** | [**SubscriberAddToListRequest**](SubscriberAddToListRequest.md)|  | [optional] |

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

<a name="deleteDraftList"></a>
# **deleteDraftList**
> Object deleteDraftList(listId, versionId).execute();

Delete Draft List

API to delete a list created in your workspace

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SuprSend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriberApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://hub.suprsend.com";
    
    configuration.sec0  = "YOUR API KEY";
    SuprSend client = new SuprSend(configuration);
    String listId = "listId_example"; // Unique string idenitifier of the list which you want to delete
    String versionId = "__version_id__"; // Unique identifier of the draft version of the list which needs to be deleted
    try {
      Object result = client
              .subscriber
              .deleteDraftList(listId, versionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriberApi#deleteDraftList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .subscriber
              .deleteDraftList(listId, versionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriberApi#deleteDraftList");
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
| **listId** | **String**| Unique string idenitifier of the list which you want to delete | |
| **versionId** | **String**| Unique identifier of the draft version of the list which needs to be deleted | [default to __version_id__] |

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

<a name="finishSyncDraftVersion"></a>
# **finishSyncDraftVersion**
> Object finishSyncDraftVersion(listId, versionId).execute();

Finish Sync

Finishes the sync for a draft version and makes that particular version live for the given list_id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SuprSend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriberApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://hub.suprsend.com";
    
    configuration.sec0  = "YOUR API KEY";
    SuprSend client = new SuprSend(configuration);
    String listId = "_list_id_"; // Unique string idenitifier of the list
    String versionId = "__version_id__"; // Unique string idenitifier of the draft version of the list which needs to be made active(live)
    try {
      Object result = client
              .subscriber
              .finishSyncDraftVersion(listId, versionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriberApi#finishSyncDraftVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .subscriber
              .finishSyncDraftVersion(listId, versionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriberApi#finishSyncDraftVersion");
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
| **listId** | **String**| Unique string idenitifier of the list | [default to _list_id_] |
| **versionId** | **String**| Unique string idenitifier of the draft version of the list which needs to be made active(live) | [default to __version_id__] |

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

<a name="removeFromDraftList"></a>
# **removeFromDraftList**
> Object removeFromDraftList(listId, versionId).subscriberRemoveFromDraftListRequest(subscriberRemoveFromDraftListRequest).execute();

Remove Subscribers from Draft List

Remove subscribers from a draft list with a version_id that uniquely identifies the draft list

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SuprSend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriberApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://hub.suprsend.com";
    
    configuration.sec0  = "YOUR API KEY";
    SuprSend client = new SuprSend(configuration);
    String listId = "_list_id_"; // Unique string idenitifier of the list to which user needs to be updated
    String versionId = "__version_id__"; // Unique string idenitifier of the draft version of the list to which user needs to be updated
    List<String> distinctIds = Arrays.asList(); // Array of subscriber_ids, uniquely identifying the subscribers to be removed from the list.
    try {
      Object result = client
              .subscriber
              .removeFromDraftList(listId, versionId)
              .distinctIds(distinctIds)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriberApi#removeFromDraftList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .subscriber
              .removeFromDraftList(listId, versionId)
              .distinctIds(distinctIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriberApi#removeFromDraftList");
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
| **listId** | **String**| Unique string idenitifier of the list to which user needs to be updated | [default to _list_id_] |
| **versionId** | **String**| Unique string idenitifier of the draft version of the list to which user needs to be updated | [default to __version_id__] |
| **subscriberRemoveFromDraftListRequest** | [**SubscriberRemoveFromDraftListRequest**](SubscriberRemoveFromDraftListRequest.md)|  | [optional] |

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

<a name="updateUserPreferencesCategory"></a>
# **updateUserPreferencesCategory**
> Object updateUserPreferencesCategory(distinctId, categorySlug).tenantId(tenantId).subscriberUpdateUserPreferencesCategoryRequest(subscriberUpdateUserPreferencesCategoryRequest).execute();

Update User Preferences (Category level)

API to update user category preferences

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SuprSend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SubscriberApi;
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
    String categorySlug = "categorySlug_example"; // notification category slug. You can get this from Notification Categories page on SuprSend dashboard -> Settings page
    String preference = "opt_in"; // choose one of the options: `opt_in` if the user has allowed notification in this category and `opt_out` if user wants to discontinue notification in this category
    List<String> optOutChannels = Arrays.asList(); // Add array of channels if user wants to unsubscribe from particular channels in this category. Add channels as `email`, `sms`, whatsapp`, `androidpush`, `inbox`, `iospush`, `slack`, `webpush`
    String tenantId = "tenantId_example"; // to fetch user preferences for a particular brand
    try {
      Object result = client
              .subscriber
              .updateUserPreferencesCategory(distinctId, categorySlug)
              .preference(preference)
              .optOutChannels(optOutChannels)
              .tenantId(tenantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriberApi#updateUserPreferencesCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .subscriber
              .updateUserPreferencesCategory(distinctId, categorySlug)
              .preference(preference)
              .optOutChannels(optOutChannels)
              .tenantId(tenantId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriberApi#updateUserPreferencesCategory");
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
| **categorySlug** | **String**| notification category slug. You can get this from Notification Categories page on SuprSend dashboard -&gt; Settings page | |
| **tenantId** | **String**| to fetch user preferences for a particular brand | [optional] |
| **subscriberUpdateUserPreferencesCategoryRequest** | [**SubscriberUpdateUserPreferencesCategoryRequest**](SubscriberUpdateUserPreferencesCategoryRequest.md)|  | [optional] |

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

