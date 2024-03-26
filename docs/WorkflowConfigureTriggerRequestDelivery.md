

# WorkflowConfigureTriggerRequestDelivery

delivery instructions for the workflow. You can set [Smart Delivery](https://docs.suprsend.com/docs/smart-delivery) preference by setting \"smart\":true

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**smart** | **Boolean** | You can enable smart delivery by setting \&quot;smart\&quot;:True |  [optional] |
|**success** | **String** | Measure that defines the success of this notification. You can set notification status like delivery, interaction or custom success event |  [optional] |
|**timeToLive** | **String** | Time window for triggering notifications in case of smart delivery. notification on each channel will be sent with time-interval of [time_to_live / (number_of_channels - 1)] apart. Format - XXdXXhXXmXXs or if its number (n) then delay is in seconds (n) |  [optional] |
|**mandatoryChannels** | **List&lt;String&gt;** | Channels on which notification has to be sent immediately in case of smart delivery. Following channel keys can be used: email, sms, whatsapp, androidpush, iospush, slack, webpush |  [optional] |



