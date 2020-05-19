# PartyAccountApi

All URIs are relative to *https://virtserver.swaggerhub.com/etom7/etom/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPartyAccount**](PartyAccountApi.md#createPartyAccount) | **POST** /partyAccount | Creates a PartyAccount
[**deletePartyAccount**](PartyAccountApi.md#deletePartyAccount) | **DELETE** /partyAccount/{id} | Deletes a PartyAccount
[**listPartyAccount**](PartyAccountApi.md#listPartyAccount) | **GET** /partyAccount | List or find PartyAccount objects
[**patchPartyAccount**](PartyAccountApi.md#patchPartyAccount) | **PATCH** /partyAccount/{id} | Updates partially a PartyAccount
[**retrievePartyAccount**](PartyAccountApi.md#retrievePartyAccount) | **GET** /partyAccount/{id} | Retrieves a PartyAccount by ID


<a name="createPartyAccount"></a>
# **createPartyAccount**
> PartyAccount createPartyAccount(partyAccount)

Creates a PartyAccount

This operation creates a PartyAccount entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PartyAccountApi;


PartyAccountApi apiInstance = new PartyAccountApi();
PartyAccountCreate partyAccount = new PartyAccountCreate(); // PartyAccountCreate | The PartyAccount to be created
try {
    PartyAccount result = apiInstance.createPartyAccount(partyAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartyAccountApi#createPartyAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partyAccount** | [**PartyAccountCreate**](PartyAccountCreate.md)| The PartyAccount to be created |

### Return type

[**PartyAccount**](PartyAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deletePartyAccount"></a>
# **deletePartyAccount**
> deletePartyAccount(id)

Deletes a PartyAccount

This operation deletes a PartyAccount entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PartyAccountApi;


PartyAccountApi apiInstance = new PartyAccountApi();
String id = "id_example"; // String | Identifier of the PartyAccount
try {
    apiInstance.deletePartyAccount(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PartyAccountApi#deletePartyAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the PartyAccount |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listPartyAccount"></a>
# **listPartyAccount**
> List&lt;PartyAccount&gt; listPartyAccount(fields, offset, limit)

List or find PartyAccount objects

This operation list or find PartyAccount entities

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PartyAccountApi;


PartyAccountApi apiInstance = new PartyAccountApi();
String fields = "fields_example"; // String | Comma-separated properties to be provided in response
Integer offset = 56; // Integer | Requested index for start of resources to be provided in response
Integer limit = 56; // Integer | Requested number of resources to be provided in response
try {
    List<PartyAccount> result = apiInstance.listPartyAccount(fields, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartyAccountApi#listPartyAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Comma-separated properties to be provided in response | [optional]
 **offset** | **Integer**| Requested index for start of resources to be provided in response | [optional]
 **limit** | **Integer**| Requested number of resources to be provided in response | [optional]

### Return type

[**List&lt;PartyAccount&gt;**](PartyAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="patchPartyAccount"></a>
# **patchPartyAccount**
> PartyAccount patchPartyAccount(id, partyAccount)

Updates partially a PartyAccount

This operation updates partially a PartyAccount entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PartyAccountApi;


PartyAccountApi apiInstance = new PartyAccountApi();
String id = "id_example"; // String | Identifier of the PartyAccount
PartyAccountUpdate partyAccount = new PartyAccountUpdate(); // PartyAccountUpdate | The PartyAccount to be updated
try {
    PartyAccount result = apiInstance.patchPartyAccount(id, partyAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartyAccountApi#patchPartyAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the PartyAccount |
 **partyAccount** | [**PartyAccountUpdate**](PartyAccountUpdate.md)| The PartyAccount to be updated |

### Return type

[**PartyAccount**](PartyAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="retrievePartyAccount"></a>
# **retrievePartyAccount**
> PartyAccount retrievePartyAccount(id, fields)

Retrieves a PartyAccount by ID

This operation retrieves a PartyAccount entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PartyAccountApi;


PartyAccountApi apiInstance = new PartyAccountApi();
String id = "id_example"; // String | Identifier of the PartyAccount
String fields = "fields_example"; // String | Comma-separated properties to provide in response
try {
    PartyAccount result = apiInstance.retrievePartyAccount(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartyAccountApi#retrievePartyAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the PartyAccount |
 **fields** | **String**| Comma-separated properties to provide in response | [optional]

### Return type

[**PartyAccount**](PartyAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

