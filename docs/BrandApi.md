# BrandApi

All URIs are relative to *https://hub.suprsend.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**brandDataGet**](BrandApi.md#brandDataGet) | **GET** /v1/brand/{brand_id} | Get Brand data |
| [**createOrUpdate**](BrandApi.md#createOrUpdate) | **POST** /v1/brand/{brand_id} | Create / Update Brands |
| [**getCategories**](BrandApi.md#getCategories) | **GET** /v1/brand/{brand_id}/category | Get Brand Default Preference |
| [**listGet**](BrandApi.md#listGet) | **GET** /v1/brand | Get Brand list |
| [**updateDefaultPreference**](BrandApi.md#updateDefaultPreference) | **POST** /v1/brand/{brand_id}/category/{category_slug} | Update Brand Default Preference |


<a name="brandDataGet"></a>
# **brandDataGet**
> Object brandDataGet(brandId).execute();

Get Brand data

API to get brand settings corresponding to a brand id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SuprSend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://hub.suprsend.com";
    
    configuration.sec0  = "YOUR API KEY";
    SuprSend client = new SuprSend(configuration);
    String brandId = "brandId_example"; // unique identifier of the brand you want to get the details for
    try {
      Object result = client
              .brand
              .brandDataGet(brandId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#brandDataGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .brand
              .brandDataGet(brandId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#brandDataGet");
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
| **brandId** | **String**| unique identifier of the brand you want to get the details for | |

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

<a name="createOrUpdate"></a>
# **createOrUpdate**
> Object createOrUpdate(brandId).contentType(contentType).brandCreateOrUpdateRequest(brandCreateOrUpdateRequest).execute();

Create / Update Brands

API to create a new Brand OR update an existing Brand

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SuprSend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://hub.suprsend.com";
    
    configuration.sec0  = "YOUR API KEY";
    SuprSend client = new SuprSend(configuration);
    String brandName = "Awesome Brand"; // Name of the brand. You can add company / organization name here
    String brandId = "brandId_example"; // unique identifier of the brand that you want to create / update
    String logo = "https://ik.imagekit.io/l0quatz6utm/suprsend/staging/media/suprsend-only-logo_c8aa27faef118418e8c5bd7b31a1cafc74e09200.png"; // URL of the brand logo
    String primaryColor = "#ff0000"; // Primary color of the brand - used for designing brand template. If you don't provide any of the colors for the brand, SuprSend will assume you want to use the default values, so color settings will automatically be set to the color settings of default brand.
    String secondaryColor = "#00ff00"; // Secondary color of the brand - not used for designing the default templates. You can however add this property and use it in your templates
    String tertiaryColor = "#0000ff"; // Tertiary color of the brand - not used for designing the default templates. You can however add this property and use it in your templates
    String preferencePageUrl = "preferencePageUrl_example"; // Link of the hosted preference page inside the brand product
    BrandCreateOrUpdateRequestSocialLinks socialLinks = new BrandCreateOrUpdateRequestSocialLinks();
    String properties = "properties_example"; // Custom properties associated with the brand. Example value - `{\\\"k1\\\": \\\"v1\\\", \\\"k2\\\": 1.0}` <br> Update operation on properties works like upsert on 1st-level keys (i.e. if top-level key doesn't already exist, then it will be added, otherwise its value will be replaced by the new value. All other key-value pairs will remain unchanged).
    String contentType = "contentType_example";
    try {
      Object result = client
              .brand
              .createOrUpdate(brandName, brandId)
              .logo(logo)
              .primaryColor(primaryColor)
              .secondaryColor(secondaryColor)
              .tertiaryColor(tertiaryColor)
              .preferencePageUrl(preferencePageUrl)
              .socialLinks(socialLinks)
              .properties(properties)
              .contentType(contentType)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#createOrUpdate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .brand
              .createOrUpdate(brandName, brandId)
              .logo(logo)
              .primaryColor(primaryColor)
              .secondaryColor(secondaryColor)
              .tertiaryColor(tertiaryColor)
              .preferencePageUrl(preferencePageUrl)
              .socialLinks(socialLinks)
              .properties(properties)
              .contentType(contentType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#createOrUpdate");
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
| **brandId** | **String**| unique identifier of the brand that you want to create / update | |
| **contentType** | **String**|  | [optional] |
| **brandCreateOrUpdateRequest** | [**BrandCreateOrUpdateRequest**](BrandCreateOrUpdateRequest.md)|  | [optional] |

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

<a name="getCategories"></a>
# **getCategories**
> Object getCategories(brandId).execute();

Get Brand Default Preference

API to get Brand categories

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SuprSend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://hub.suprsend.com";
    
    configuration.sec0  = "YOUR API KEY";
    SuprSend client = new SuprSend(configuration);
    String brandId = "brandId_example"; // unique identifier of the brand you want to get default preferences for
    try {
      Object result = client
              .brand
              .getCategories(brandId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .brand
              .getCategories(brandId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getCategories");
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
| **brandId** | **String**| unique identifier of the brand you want to get default preferences for | |

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

<a name="listGet"></a>
# **listGet**
> Object listGet().limit(limit).offset(offset).execute();

Get Brand list

API to get the list of brands available in your workspace

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SuprSend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://hub.suprsend.com";
    
    configuration.sec0  = "YOUR API KEY";
    SuprSend client = new SuprSend(configuration);
    String limit = "20"; // number of results to be returned in API response
    String offset = "0"; // starting position of brand list
    try {
      Object result = client
              .brand
              .listGet()
              .limit(limit)
              .offset(offset)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#listGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .brand
              .listGet()
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#listGet");
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
| **limit** | **String**| number of results to be returned in API response | [optional] [default to 20] |
| **offset** | **String**| starting position of brand list | [optional] [default to 0] |

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

<a name="updateDefaultPreference"></a>
# **updateDefaultPreference**
> Object updateDefaultPreference(brandId, categorySlug).brandUpdateDefaultPreferenceRequest(brandUpdateDefaultPreferenceRequest).execute();

Update Brand Default Preference

API to update user default preferences for a brand

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SuprSend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrandApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://hub.suprsend.com";
    
    configuration.sec0  = "YOUR API KEY";
    SuprSend client = new SuprSend(configuration);
    String brandId = "brandId_example"; // unique identifier of the brand you want to update default preferences for
    String categorySlug = "categorySlug_example"; // notification category slug. You can get this from Notification Categories page on SuprSend dashboard -> Settings page
    String preference = "opt_in"; // set `**opt_in**` to send notifications on all channels by default <br>  set `**opt_out**` to not send notifications in this category by default. For instance, **newsletter** <br>  set `**cant_unsubscribe**`if you do not want users to completely opt-out from this category. Notifications will always be sent on mandatory channels in this category.
    Boolean visibleToSubscriber = true; // set it `false` to hide a category from user's preference page
    List<String> mandatoryChannels = Arrays.asList(); // Add mandatory channels that the user can't unsubscribe from if preference is `cant_unsubscribe`. Add channels as `email`, `sms`, `whatsapp`, `androidpush`, `inbox`, `iospush`, `slack`, `webpush`
    try {
      Object result = client
              .brand
              .updateDefaultPreference(brandId, categorySlug)
              .preference(preference)
              .visibleToSubscriber(visibleToSubscriber)
              .mandatoryChannels(mandatoryChannels)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#updateDefaultPreference");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .brand
              .updateDefaultPreference(brandId, categorySlug)
              .preference(preference)
              .visibleToSubscriber(visibleToSubscriber)
              .mandatoryChannels(mandatoryChannels)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#updateDefaultPreference");
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
| **brandId** | **String**| unique identifier of the brand you want to update default preferences for | |
| **categorySlug** | **String**| notification category slug. You can get this from Notification Categories page on SuprSend dashboard -&gt; Settings page | |
| **brandUpdateDefaultPreferenceRequest** | [**BrandUpdateDefaultPreferenceRequest**](BrandUpdateDefaultPreferenceRequest.md)|  | [optional] |

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

