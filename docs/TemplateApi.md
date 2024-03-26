# TemplateApi

All URIs are relative to *https://hub.suprsend.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getContentChannel**](TemplateApi.md#getContentChannel) | **GET** /v1/template/{template_slug}/channel/{channel_slug} | Fetch Template content for a channel |
| [**getDetails**](TemplateApi.md#getDetails) | **GET** /v1/template/{template_slug} | Fetch Template details |
| [**getList**](TemplateApi.md#getList) | **GET** /v1/template | Fetch Template List |


<a name="getContentChannel"></a>
# **getContentChannel**
> TemplateGetContentChannelResponse getContentChannel(templateSlug, channelSlug).execute();

Fetch Template content for a channel

APIs to fetch the content of a particular channel in a template group. It will return data for live and draft version of a template.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SuprSend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://hub.suprsend.com";
    
    configuration.sec0  = "YOUR API KEY";
    SuprSend client = new SuprSend(configuration);
    String templateSlug = "templateSlug_example"; // Template group slug you want to fetch content details. You'll get the template slug by clicking on copy button next to template group name on SuprSend dashboard -> template details page.
    String channelSlug = "channelSlug_example"; // add one of the template channels  - `email`, `sms`, `whatsapp`, `inbox`, `slack`, `androidpush`, `iospush`, `webpush`
    try {
      TemplateGetContentChannelResponse result = client
              .template
              .getContentChannel(templateSlug, channelSlug)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getChannel());
      System.out.println(result.getIsActive());
      System.out.println(result.getIsEnabled());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getDisabledLanguages());
      System.out.println(result.getVersions());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#getContentChannel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TemplateGetContentChannelResponse> response = client
              .template
              .getContentChannel(templateSlug, channelSlug)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#getContentChannel");
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
| **templateSlug** | **String**| Template group slug you want to fetch content details. You&#39;ll get the template slug by clicking on copy button next to template group name on SuprSend dashboard -&gt; template details page. | |
| **channelSlug** | **String**| add one of the template channels  - &#x60;email&#x60;, &#x60;sms&#x60;, &#x60;whatsapp&#x60;, &#x60;inbox&#x60;, &#x60;slack&#x60;, &#x60;androidpush&#x60;, &#x60;iospush&#x60;, &#x60;webpush&#x60; | |

### Return type

[**TemplateGetContentChannelResponse**](TemplateGetContentChannelResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getDetails"></a>
# **getDetails**
> TemplateGetDetailsResponse getDetails(templateSlug).execute();

Fetch Template details

APIs to fetch the content of a template group. It will return data for live and draft version of a template.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SuprSend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://hub.suprsend.com";
    
    configuration.sec0  = "YOUR API KEY";
    SuprSend client = new SuprSend(configuration);
    String templateSlug = "templateSlug_example"; // Template group slug you want to fetch content details. You'll get the template slug by clicking on copy button next to template group name on SuprSend dashboard -> template details page.
    try {
      TemplateGetDetailsResponse result = client
              .template
              .getDetails(templateSlug)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getSlug());
      System.out.println(result.getIsActive());
      System.out.println(result.getDefaultLanguage());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getUpdatedBy());
      System.out.println(result.getLastTriggeredAt());
      System.out.println(result.getIsAutoTranslateEnabled());
      System.out.println(result.getEnabledLanguages());
      System.out.println(result.getChannels());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TemplateGetDetailsResponse> response = client
              .template
              .getDetails(templateSlug)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#getDetails");
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
| **templateSlug** | **String**| Template group slug you want to fetch content details. You&#39;ll get the template slug by clicking on copy button next to template group name on SuprSend dashboard -&gt; template details page. | |

### Return type

[**TemplateGetDetailsResponse**](TemplateGetDetailsResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getList"></a>
# **getList**
> TemplateGetListResponse getList().hasTagIdsAny(hasTagIdsAny).hasChannelsAny(hasChannelsAny).isActive(isActive).isArchived(isArchived).execute();

Fetch Template List

APIs to fetch the list of all templates in a workspace

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SuprSend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://hub.suprsend.com";
    
    configuration.sec0  = "YOUR API KEY";
    SuprSend client = new SuprSend(configuration);
    String hasTagIdsAny = "hasTagIdsAny_example"; // comma separated string of tag ids attached to the template
    String hasChannelsAny = "hasChannelsAny_example"; // comma separated string of channels. Returns templates which has any of the channels present from the channel string. Use these keys for channels - `email`, `sms`, `whatsapp`, `inbox`, `slack`, `androidpush`, `iospush`, `webpush`
    Boolean isActive = true; // Set `true` for published templates, `false` for templates which are in draft. Do not pass this key to return all templates.
    Boolean isArchived = true; // Set `true` to get archived templates, default = `false`
    try {
      TemplateGetListResponse result = client
              .template
              .getList()
              .hasTagIdsAny(hasTagIdsAny)
              .hasChannelsAny(hasChannelsAny)
              .isActive(isActive)
              .isArchived(isArchived)
              .execute();
      System.out.println(result);
      System.out.println(result.getMeta());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TemplateGetListResponse> response = client
              .template
              .getList()
              .hasTagIdsAny(hasTagIdsAny)
              .hasChannelsAny(hasChannelsAny)
              .isActive(isActive)
              .isArchived(isArchived)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#getList");
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
| **hasTagIdsAny** | **String**| comma separated string of tag ids attached to the template | [optional] |
| **hasChannelsAny** | **String**| comma separated string of channels. Returns templates which has any of the channels present from the channel string. Use these keys for channels - &#x60;email&#x60;, &#x60;sms&#x60;, &#x60;whatsapp&#x60;, &#x60;inbox&#x60;, &#x60;slack&#x60;, &#x60;androidpush&#x60;, &#x60;iospush&#x60;, &#x60;webpush&#x60; | [optional] |
| **isActive** | **Boolean**| Set &#x60;true&#x60; for published templates, &#x60;false&#x60; for templates which are in draft. Do not pass this key to return all templates. | [optional] |
| **isArchived** | **Boolean**| Set &#x60;true&#x60; to get archived templates, default &#x3D; &#x60;false&#x60; | [optional] |

### Return type

[**TemplateGetListResponse**](TemplateGetListResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

