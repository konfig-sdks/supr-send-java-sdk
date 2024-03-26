

# WorkflowConfigureTriggerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Unique name of the workflow. The workflow name should be easily identifiable for your reference at a later stage. You can see workflow-related analytics on the workflow page (how many notifications were sent, delivered, clicked or interacted). |  |
|**template** | **String** | Unique slug name of the template created on SuprSend dashboard. You can get this by clicking on the clipboard icon next to the Template name on SuprSend templates page. |  |
|**notificationCategory** | **String** | Category in which your notification belongs. You can understand more about them in the &#39;Notification Category&#39; documentation |  |
|**users** | [**List&lt;WorkflowConfigureTriggerRequestUsersInner&gt;**](WorkflowConfigureTriggerRequestUsersInner.md) | Array object of target users. |  |
|**data** | **String** | Mock data to replace the template variables. |  [optional] |
|**delivery** | [**WorkflowConfigureTriggerRequestDelivery**](WorkflowConfigureTriggerRequestDelivery.md) |  |  [optional] |
|**delay** | **String** | Workflow will be halted for the time mentioned in delay, and become active once the delay period is over. Format - &#x60;XXdXXhXXmXXs&#x60; or if its number (n) then delay is in seconds (n) |  [optional] |
|**triggerAt** | **LocalDate** | Trigger workflow on a specific date-time. Format - date string in ISO 8601 eg. \&quot;2022-08-27T20:14:51.643Z\&quot; |  [optional] |
|**brandId** | **String** | string identifier of the brand this workflow is associated with |  [optional] |
|**$idempotencyKey** | **String** | Idempotency_key (valid for 24hrs) |  [optional] |



