# FinancialAccountApi

All URIs are relative to *https://virtserver.swaggerhub.com/etom7/etom/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFinancialAccount**](FinancialAccountApi.md#createFinancialAccount) | **POST** /financialAccount | Creates a FinancialAccount
[**deleteFinancialAccount**](FinancialAccountApi.md#deleteFinancialAccount) | **DELETE** /financialAccount/{id} | Deletes a FinancialAccount
[**listFinancialAccount**](FinancialAccountApi.md#listFinancialAccount) | **GET** /financialAccount | List or find FinancialAccount objects
[**patchFinancialAccount**](FinancialAccountApi.md#patchFinancialAccount) | **PATCH** /financialAccount/{id} | Updates partially a FinancialAccount
[**retrieveFinancialAccount**](FinancialAccountApi.md#retrieveFinancialAccount) | **GET** /financialAccount/{id} | Retrieves a FinancialAccount by ID


<a name="createFinancialAccount"></a>
# **createFinancialAccount**
> FinancialAccount createFinancialAccount(financialAccount)

Creates a FinancialAccount

This operation creates a FinancialAccount entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FinancialAccountApi;


FinancialAccountApi apiInstance = new FinancialAccountApi();
FinancialAccountCreate financialAccount = new FinancialAccountCreate(); // FinancialAccountCreate | The FinancialAccount to be created
try {
    FinancialAccount result = apiInstance.createFinancialAccount(financialAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialAccountApi#createFinancialAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialAccount** | [**FinancialAccountCreate**](FinancialAccountCreate.md)| The FinancialAccount to be created |

### Return type

[**FinancialAccount**](FinancialAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteFinancialAccount"></a>
# **deleteFinancialAccount**
> deleteFinancialAccount(id)

Deletes a FinancialAccount

This operation deletes a FinancialAccount entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FinancialAccountApi;


FinancialAccountApi apiInstance = new FinancialAccountApi();
String id = "id_example"; // String | Identifier of the FinancialAccount
try {
    apiInstance.deleteFinancialAccount(id);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialAccountApi#deleteFinancialAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the FinancialAccount |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listFinancialAccount"></a>
# **listFinancialAccount**
> List&lt;FinancialAccount&gt; listFinancialAccount(fields, offset, limit)

List or find FinancialAccount objects

This operation list or find FinancialAccount entities

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FinancialAccountApi;


FinancialAccountApi apiInstance = new FinancialAccountApi();
String fields = "fields_example"; // String | Comma-separated properties to be provided in response
Integer offset = 56; // Integer | Requested index for start of resources to be provided in response
Integer limit = 56; // Integer | Requested number of resources to be provided in response
try {
    List<FinancialAccount> result = apiInstance.listFinancialAccount(fields, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialAccountApi#listFinancialAccount");
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

[**List&lt;FinancialAccount&gt;**](FinancialAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="patchFinancialAccount"></a>
# **patchFinancialAccount**
> FinancialAccount patchFinancialAccount(id, financialAccount)

Updates partially a FinancialAccount

This operation updates partially a FinancialAccount entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FinancialAccountApi;


FinancialAccountApi apiInstance = new FinancialAccountApi();
String id = "id_example"; // String | Identifier of the FinancialAccount
FinancialAccountUpdate financialAccount = new FinancialAccountUpdate(); // FinancialAccountUpdate | The FinancialAccount to be updated
try {
    FinancialAccount result = apiInstance.patchFinancialAccount(id, financialAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialAccountApi#patchFinancialAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the FinancialAccount |
 **financialAccount** | [**FinancialAccountUpdate**](FinancialAccountUpdate.md)| The FinancialAccount to be updated |

### Return type

[**FinancialAccount**](FinancialAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="retrieveFinancialAccount"></a>
# **retrieveFinancialAccount**
> FinancialAccount retrieveFinancialAccount(id, fields)

Retrieves a FinancialAccount by ID

This operation retrieves a FinancialAccount entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FinancialAccountApi;


FinancialAccountApi apiInstance = new FinancialAccountApi();
String id = "id_example"; // String | Identifier of the FinancialAccount
String fields = "fields_example"; // String | Comma-separated properties to provide in response
try {
    FinancialAccount result = apiInstance.retrieveFinancialAccount(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialAccountApi#retrieveFinancialAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the FinancialAccount |
 **fields** | **String**| Comma-separated properties to provide in response | [optional]

### Return type

[**FinancialAccount**](FinancialAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

