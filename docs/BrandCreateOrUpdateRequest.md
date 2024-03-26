

# BrandCreateOrUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**brandName** | **String** | Name of the brand. You can add company / organization name here |  |
|**logo** | **String** | URL of the brand logo |  [optional] |
|**primaryColor** | **String** | Primary color of the brand - used for designing brand template. If you don&#39;t provide any of the colors for the brand, SuprSend will assume you want to use the default values, so color settings will automatically be set to the color settings of default brand. |  [optional] |
|**secondaryColor** | **String** | Secondary color of the brand - not used for designing the default templates. You can however add this property and use it in your templates |  [optional] |
|**tertiaryColor** | **String** | Tertiary color of the brand - not used for designing the default templates. You can however add this property and use it in your templates |  [optional] |
|**preferencePageUrl** | **String** | Link of the hosted preference page inside the brand product |  [optional] |
|**socialLinks** | [**BrandCreateOrUpdateRequestSocialLinks**](BrandCreateOrUpdateRequestSocialLinks.md) |  |  [optional] |
|**properties** | **String** | Custom properties associated with the brand. Example value - &#x60;{\&quot;k1\&quot;: \&quot;v1\&quot;, \&quot;k2\&quot;: 1.0}&#x60; &lt;br&gt; Update operation on properties works like upsert on 1st-level keys (i.e. if top-level key doesn&#39;t already exist, then it will be added, otherwise its value will be replaced by the new value. All other key-value pairs will remain unchanged). |  [optional] |



