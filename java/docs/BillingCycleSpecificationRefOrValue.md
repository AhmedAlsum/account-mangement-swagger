
# BillingCycleSpecificationRefOrValue

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier of the billing cycle specification |  [optional]
**href** | **String** | Reference of the billing cycle specification |  [optional]
**billingDateShift** | **Integer** | An offset of a billing/settlement date. The offset is expressed as number of days with regard to the start of the billing/settlement period. |  [optional]
**billingPeriod** | **String** | A billing time period. It can be recurring, for example: week, month, quarter of year, year . |  [optional]
**chargeDateOffset** | **Integer** | An offset of a date through which charges previously received by the billing system will appear on the bill. The offset is expressed as number of days with regard to the start of the BillingPeriod. |  [optional]
**creditDateOffset** | **Integer** | An offset of a date through which credits previously received by the billing system will appear on the bill. The offset is expressed as number of days with regard to the start of the BillingPeriod. |  [optional]
**dateShift** | **Integer** | An offset of a billing/settlement date. The offset is expressed as number of days with regard to the start of the billing/settlement period. |  [optional]
**description** | **String** | An explanation regarding this billing cycle specification |  [optional]
**frequency** | **String** | Frequency of the billing cycle (monthly for instance) |  [optional]
**isRef** | **Boolean** |  | 
**mailingDateOffset** | **Integer** | An offset of a customer bill mailing date. The offset is expressed as number of days with regard to the start of the BillingPeriod. |  [optional]
**name** | **String** | A short descriptive name | 
**paymentDueDateOffset** | **Integer** | An offset of a payment due date. The offset is expressed as number of days with regard to the start of the BillingPeriod. |  [optional]
**validFor** | [**TimePeriod**](TimePeriod.md) | The period for which the billing specification cycle is valid |  [optional]
**baseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**schemaLocation** | **String** | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**type** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]
**referredType** | **String** | The actual type of the target instance when needed for disambiguation. |  [optional]



