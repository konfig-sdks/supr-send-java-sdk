

# WorkflowConfigureTriggerRequestUsersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**distinctId** | **String** | unique identifier of the user |  |
|**$channels** | **List&lt;String&gt;** | send notification on selected channels in user profile. Following channel keys can be used: email, sms, whatsapp, androidpush, iospush, slack, webpush |  [optional] |
|**$email** | **List&lt;String&gt;** | To trigger notification on a particular email |  [optional] |
|**$sms** | **List&lt;String&gt;** | Send SMS on a particular number. |  [optional] |
|**$whatsapp** | **List&lt;String&gt;** | Send Whatsapp on a particular number. |  [optional] |
|**$androidpush** | [**List&lt;WorkflowConfigureTriggerRequestUsersInnerAndroidpushInner&gt;**](WorkflowConfigureTriggerRequestUsersInnerAndroidpushInner.md) | Send androidpush on the given push token |  [optional] |
|**$iospush** | [**List&lt;WorkflowConfigureTriggerRequestUsersInnerIospushInner&gt;**](WorkflowConfigureTriggerRequestUsersInnerIospushInner.md) | Send iOSpush on the given push token |  [optional] |
|**$slack** | **String** | Send Slack on a particular channel in user&#39;s profile. Use one of the methods to add slack token - 1. slack using email: {\&quot;email\&quot;: \&quot;user@example.com\&quot;, \&quot;access_token\&quot;: \&quot;xoxb-XXXXXXXX\&quot;} ------ 2. slack using member_id: {\&quot;user_id\&quot;: \&quot;U/WXXXXXXXX\&quot;, \&quot;access_token\&quot;: \&quot;xoxb-XXXXXXXX\&quot;} ------- 3. slack channel: {\&quot;channel\&quot;: \&quot;CXXXXXXXX\&quot;, \&quot;access_token\&quot;: \&quot;xoxb-XXXXXXXX\&quot;} -------- 4. slack incoming webhook: {\&quot;incoming_webhook\&quot;: { \&quot;url\&quot;: \&quot;https://hooks.slack.com/services/TXXXXXXXXX/BXXXXXXXX/XXXXXXXXXXXXXXXXXXX\&quot;}} |  [optional] |



