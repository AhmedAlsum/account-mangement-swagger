
# SettlementAccountCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountType** | **String** | A categorization of an account, such as individual, joint, and so forth, whose instances share some of the same characteristics. Note: for flexibility we use a String here but an implementation may use an enumeration with a limited list of valid values. |  [optional]
**description** | **String** | Detailed description of the party account |  [optional]
**lastModified** | [**OffsetDateTime**](OffsetDateTime.md) | Date of last modification of the account |  [optional]
**name** | **String** | Name of the account | 
**paymentStatus** | **String** | The condition of the account, such as due, paid, in arrears. |  [optional]
**state** | **String** | Contains the lifecycle state such as: Active, Closed, Suspended and so on. |  [optional]
**accountBalance** | [**List&lt;AccountBalance&gt;**](AccountBalance.md) |  |  [optional]
**accountRelationship** | [**List&lt;AccountRelationship&gt;**](AccountRelationship.md) |  |  [optional]
**billStructure** | [**BillStructure**](BillStructure.md) |  |  [optional]
**contact** | [**List&lt;Contact&gt;**](Contact.md) |  |  [optional]
**creditLimit** | [**Money**](Money.md) | The maximum amount of money that may be charged on an account |  [optional]
**defaultPaymentMethod** | [**PaymentMethodRef**](PaymentMethodRef.md) |  |  [optional]
**financialAccount** | [**FinancialAccountRef**](FinancialAccountRef.md) |  |  [optional]
**paymentPlan** | [**List&lt;PaymentPlan&gt;**](PaymentPlan.md) |  |  [optional]
**relatedParty** | [**List&lt;RelatedParty&gt;**](RelatedParty.md) |  | 
**taxExemption** | [**List&lt;AccountTaxExemption&gt;**](AccountTaxExemption.md) |  |  [optional]
**baseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**schemaLocation** | **String** | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**type** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]



