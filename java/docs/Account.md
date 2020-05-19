
# Account

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier of the account |  [optional]
**href** | **String** | Unique reference of the account |  [optional]
**accountType** | **String** | A categorization of an account, such as individual, joint, and so forth, whose instances share some of the same characteristics. Note: for flexibility we use a String here but an implementation may use an enumeration with a limited list of valid values. |  [optional]
**description** | **String** | Detailed description of the party account |  [optional]
**lastModified** | [**OffsetDateTime**](OffsetDateTime.md) | Date of last modification of the account |  [optional]
**name** | **String** | Name of the account | 
**state** | **String** | Contains the lifecycle state such as: Active, Closed, Suspended and so on. |  [optional]
**accountBalance** | [**List&lt;AccountBalance&gt;**](AccountBalance.md) |  |  [optional]
**accountRelationship** | [**List&lt;AccountRelationship&gt;**](AccountRelationship.md) |  |  [optional]
**contact** | [**List&lt;Contact&gt;**](Contact.md) |  |  [optional]
**creditLimit** | [**Money**](Money.md) | The maximum amount of money that may be charged on an account |  [optional]
**relatedParty** | [**List&lt;RelatedParty&gt;**](RelatedParty.md) |  |  [optional]
**taxExemption** | [**List&lt;AccountTaxExemption&gt;**](AccountTaxExemption.md) |  |  [optional]
**baseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**schemaLocation** | **String** | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**type** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]



