

# EventTriggerEventRequestUserOperationsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**$append** | **Object** | Use this to add communication channels in user profile. Following channel keys: &#x60;$email&#x60;, &#x60;$sms&#x60;, &#x60;$whatsapp&#x60;, &#x60;$androidpush&#x60;, &#x60;$iospush&#x60;, &#x60;$slack&#x60;, &#x60;$webpush&#x60;, &#x60;$ms_teams&#x60;. Add channel as {\&quot;$email\&quot;:\&quot;user@example.com\&quot;} |  [optional] |
|**$remove** | **Object** | Use this to remove communication channels from user profile. Following channel keys: &#x60;$email&#x60;, &#x60;$sms&#x60;, &#x60;$whatsapp&#x60;, &#x60;$androidpush&#x60;, &#x60;$iospush&#x60;, &#x60;$slack&#x60;, &#x60;$webpush&#x60;, &#x60;$ms_teams&#x60;. Define channel as {\&quot;$email\&quot;:\&quot;user@example.com\&quot;} |  [optional] |
|**$set** | **Object** | Use this to set user properties like location, preferred language etc. You can define properties in key-value pair as &#x60;{\&quot;$preferred_language\&quot;:\&quot;hi\&quot;}&#x60; |  [optional] |
|**$unset** | **List&lt;String&gt;** | Use this to remove properties from user profile. Define the property keys to be removed as \&quot;$preferred_language\&quot; |  [optional] |



