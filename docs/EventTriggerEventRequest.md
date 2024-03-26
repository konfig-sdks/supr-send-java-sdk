

# EventTriggerEventRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**distinctId** | **String** | distinct_id of recipient who should receive the notification |  |
|**$userOperations** | [**List&lt;EventTriggerEventRequestUserOperationsInner&gt;**](EventTriggerEventRequestUserOperationsInner.md) | Creating &amp; updating users on SuprSend is done by sending an &#x60;$user_operations&#x60; event. All changes can be combined in one API call in an easy to replay format |  [optional] |
|**event** | **String** | string identifier for the event like &#x60;product_purchased&#x60; |  |
|**properties** | **String** | a dictionary representing event attributes like &#x60;first_name&#x60;. Event properties can be used to pass template variables in case of event based trigger |  [optional] |
|**brandId** | **String** | string identifier of the brand this event is associated with |  [optional] |
|**$idempotencyKey** | **String** | Idempotency key (valid for 24hours) |  [optional] |



