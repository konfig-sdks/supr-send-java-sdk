

# SubscriberUpdateUserPreferencesCategoryRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**preference** | **String** | choose one of the options: &#x60;opt_in&#x60; if the user has allowed notification in this category and &#x60;opt_out&#x60; if user wants to discontinue notification in this category |  [optional] |
|**optOutChannels** | **List&lt;String&gt;** | Add array of channels if user wants to unsubscribe from particular channels in this category. Add channels as &#x60;email&#x60;, &#x60;sms&#x60;, whatsapp&#x60;, &#x60;androidpush&#x60;, &#x60;inbox&#x60;, &#x60;iospush&#x60;, &#x60;slack&#x60;, &#x60;webpush&#x60; |  [optional] |



