# SettlementAccountApi

All URIs are relative to *https://virtserver.swaggerhub.com/etom7/etom/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSettlementAccount**](SettlementAccountApi.md#createSettlementAccount) | **POST** /settlementAccount | Creates a SettlementAccount
[**deleteSettlementAccount**](SettlementAccountApi.md#deleteSettlementAccount) | **DELETE** /settlementAccount/{id} | Deletes a SettlementAccount
[**listSettlementAccount**](SettlementAccountApi.md#listSettlementAccount) | **GET** /settlementAccount | List or find SettlementAccount objects
[**patchSettlementAccount**](SettlementAccountApi.md#patchSettlementAccount) | **PATCH** /settlementAccount/{id} | Updates partially a SettlementAccount
[**retrieveSettlementAccount**](SettlementAccountApi.md#retrieveSettlementAccount) | **GET** /settlementAccount/{id} | Retrieves a SettlementAccount by ID


<a name="createSettlementAccount"></a>
# **createSettlementAccount**
> SettlementAccount createSettlementAccount(settlementAccount)

Creates a SettlementAccount

This operation creates a SettlementAccount entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SettlementAccountApi;


SettlementAccountApi apiInstance = new SettlementAccountApi();
SettlementAccountCreate settlementAccount = new SettlementAccountCreate(); // SettlementAccountCreate | The SettlementAccount to be created
try {
    SettlementAccount result = apiInstance.createSettlementAccount(settlementAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettlementAccountApi#createSettlementAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settlementAccount** | [**SettlementAccountCreate**](SettlementAccountCreate.md)| The SettlementAccount to be created |

### Return type

[**SettlementAccount**](SettlementAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteSettlementAccount"></a>
# **deleteSettlementAccount**
> deleteSettlementAccount(id)

Deletes a SettlementAccount

This operation deletes a SettlementAccount entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SettlementAccountApi;


SettlementAccountApi apiInstance = new SettlementAccountApi();
String id = "id_example"; // String | Identifier of the SettlementAccount
try {
    apiInstance.deleteSettlementAccount(id);
} catch (ApiException e) {
    System.err.println("Exception when calling SettlementAccountApi#deleteSettlementAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the SettlementAccount |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listSettlementAccount"></a>
# **listSettlementAccount**
> List&lt;SettlementAccount&gt; listSettlementAccount(fields, offset, limit)

List or find SettlementAccount objects

This operation list or find SettlementAccount entities

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SettlementAccountApi;


SettlementAccountApi apiInstance = new SettlementAccountApi();
String fields = "fields_example"; // String | Comma-separated properties to be provided in response
Integer offset = 56; // Integer | Requested index for start of resources to be provided in response
Integer limit = 56; // Integer | Requested number of resources to be provided in response
try {
    List<SettlementAccount> result = apiInstance.listSettlementAccount(fields, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettlementAccountApi#listSettlementAccount");
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

[**List&lt;SettlementAccount&gt;**](SettlementAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="patchSettlementAccount"></a>
# **patchSettlementAccount**
> SettlementAccount patchSettlementAccount(id, settlementAccount)

Updates partially a SettlementAccount

This operation updates partially a SettlementAccount entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SettlementAccountApi;


SettlementAccountApi apiInstance = new SettlementAccountApi();
String id = "id_example"; // String | Identifier of the SettlementAccount
SettlementAccountUpdate settlementAccount = new SettlementAccountUpdate(); // SettlementAccountUpdate | The SettlementAccount to be updated
try {
    SettlementAccount result = apiInstance.patchSettlementAccount(id, settlementAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettlementAccountApi#patchSettlementAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the SettlementAccount |
 **settlementAccount** | [**SettlementAccountUpdate**](SettlementAccountUpdate.md)| The SettlementAccount to be updated |

### Return type

[**SettlementAccount**](SettlementAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="retrieveSettlementAccount"></a>
# **retrieveSettlementAccount**
> SettlementAccount retrieveSettlementAccount(id, fields)

Retrieves a SettlementAccount by ID

This operation retrieves a SettlementAccount entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SettlementAccountApi;


SettlementAccountApi apiInstance = new SettlementAccountApi();
String id = "id_example"; // String | Identifier of the SettlementAccount
String fields = "fields_example"; // String | Comma-separated properties to provide in response
try {
    SettlementAccount result = apiInstance.retrieveSettlementAccount(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettlementAccountApi#retrieveSettlementAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the SettlementAccount |
 **fields** | **String**| Comma-separated properties to provide in response | [optional]

### Return type

[**SettlementAccount**](SettlementAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

