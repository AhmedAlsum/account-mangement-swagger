
# SettlementAccountAttributeValueChangeEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | The identifier of the notification. |  [optional]
**eventTime** | [**OffsetDateTime**](OffsetDateTime.md) | Time of the event occurrence. |  [optional]
**eventType** | **String** | The type of the notification. |  [optional]
**correlationId** | **String** | The correlation id for this event. |  [optional]
**domain** | **String** | The domain of the event. |  [optional]
**title** | **String** | The title of the event. |  [optional]
**description** | **String** | An explnatory of the event. |  [optional]
**priority** | **String** | A priority. |  [optional]
**timeOcurred** | [**OffsetDateTime**](OffsetDateTime.md) | The time the event occured. |  [optional]
**fieldPath** | **String** | The path identifying the object field concerned by this notification. |  [optional]
**payload** | [**SettlementAccountAttributeValueChangeEventPayload**](SettlementAccountAttributeValueChangeEventPayload.md) | The event payload linked to the involved resource object |  [optional]



