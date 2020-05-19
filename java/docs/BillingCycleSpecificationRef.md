
# BillingCycleSpecificationRef

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier of the billing cycle specification | 
**href** | **String** | Reference of the billing cycle specification |  [optional]
**dateShift** | **Integer** | An offset of a billing/settlement date. The offset is expressed as number of days with regard to the start of the billing/settlement period. |  [optional]
**frequency** | **String** | Frequency of the billing cycle (monthly for instance) |  [optional]
**name** | **String** | A short descriptive name |  [optional]
**baseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**schemaLocation** | **String** | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**type** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]
**referredType** | **String** | The actual type of the target instance when needed for disambiguation. |  [optional]



