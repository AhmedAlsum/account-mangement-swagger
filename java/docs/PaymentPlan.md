
# PaymentPlan

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**numberOfPayments** | **Integer** | Number of payments used to spread the global payment |  [optional]
**paymentFrequency** | **String** | Frequency of the payments, such as monthly and bimonthly |  [optional]
**planType** | **String** | Type of payment plan |  [optional]
**priority** | **Integer** | Priority of the payment plan |  [optional]
**status** | **String** | Status of the payment plan (effective, ineffective) |  [optional]
**paymentMethod** | [**PaymentMethodRef**](PaymentMethodRef.md) |  |  [optional]
**totalAmount** | [**Money**](Money.md) | Amount paid |  [optional]
**validFor** | [**TimePeriod**](TimePeriod.md) | Validity period of the payment plan |  [optional]
**baseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**schemaLocation** | **String** | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**type** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]



