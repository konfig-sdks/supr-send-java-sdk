

# BroadcastTriggerMessageListRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**listId** | **String** | unique identifier to user list that you want to send broadcast messages to. |  |
|**template** | **String** | Unique slug name of the template created on SuprSend dashboard. You can get this by clicking on the clipboard icon next to the Template name on SuprSend templates page. |  |
|**notificationCategory** | **String** | Category in which your notification belongs. You can understand more about them in the [Notification Category](https://docs.suprsend.com/docs/notification-category) documentation |  |
|**channels** | **List&lt;String&gt;** | If set, broadcast will be sent only on the channels defined here irrespective of communication channels present in user profile. |  [optional] |
|**data** | **String** | Mock data to replace the template variables. |  [optional] |
|**delay** | **String** | Broadcast will be halted for the time mentioned in delay, and become active once the delay period is over. Format - &#x60;XXdXXhXXmXXs&#x60; or if its number (n) then delay is in seconds (n) |  [optional] |
|**triggerAt** | **LocalDate** | Trigger broadcast on a specific date-time. Format - date string in ISO 8601 eg. \&quot;2022-08-27T20:14:51.643Z\&quot; |  [optional] |
|**brandId** | **String** | string identifier of the brand this broadcast is associated with |  [optional] |



