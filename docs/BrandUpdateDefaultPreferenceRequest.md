

# BrandUpdateDefaultPreferenceRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**preference** | **String** | set &#x60;**opt_in**&#x60; to send notifications on all channels by default &lt;br&gt;  set &#x60;**opt_out**&#x60; to not send notifications in this category by default. For instance, **newsletter** &lt;br&gt;  set &#x60;**cant_unsubscribe**&#x60;if you do not want users to completely opt-out from this category. Notifications will always be sent on mandatory channels in this category. |  [optional] |
|**visibleToSubscriber** | **Boolean** | set it &#x60;false&#x60; to hide a category from user&#39;s preference page |  [optional] |
|**mandatoryChannels** | **List&lt;String&gt;** | Add mandatory channels that the user can&#39;t unsubscribe from if preference is &#x60;cant_unsubscribe&#x60;. Add channels as &#x60;email&#x60;, &#x60;sms&#x60;, &#x60;whatsapp&#x60;, &#x60;androidpush&#x60;, &#x60;inbox&#x60;, &#x60;iospush&#x60;, &#x60;slack&#x60;, &#x60;webpush&#x60; |  [optional] |



