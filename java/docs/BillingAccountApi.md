# BillingAccountApi

All URIs are relative to *https://virtserver.swaggerhub.com/etom7/etom/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBillingAccount**](BillingAccountApi.md#createBillingAccount) | **POST** /billingAccount | Creates a BillingAccount
[**deleteBillingAccount**](BillingAccountApi.md#deleteBillingAccount) | **DELETE** /billingAccount/{id} | Deletes a BillingAccount
[**listBillingAccount**](BillingAccountApi.md#listBillingAccount) | **GET** /billingAccount | List or find BillingAccount objects
[**patchBillingAccount**](BillingAccountApi.md#patchBillingAccount) | **PATCH** /billingAccount/{id} | Updates partially a BillingAccount
[**retrieveBillingAccount**](BillingAccountApi.md#retrieveBillingAccount) | **GET** /billingAccount/{id} | Retrieves a BillingAccount by ID


<a name="createBillingAccount"></a>
# **createBillingAccount**
> BillingAccount createBillingAccount(billingAccount)

Creates a BillingAccount

This operation creates a BillingAccount entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BillingAccountApi;


BillingAccountApi apiInstance = new BillingAccountApi();
BillingAccountCreate billingAccount = new BillingAccountCreate(); // BillingAccountCreate | The BillingAccount to be created
try {
    BillingAccount result = apiInstance.createBillingAccount(billingAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingAccountApi#createBillingAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingAccount** | [**BillingAccountCreate**](BillingAccountCreate.md)| The BillingAccount to be created |

### Return type

[**BillingAccount**](BillingAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteBillingAccount"></a>
# **deleteBillingAccount**
> deleteBillingAccount(id)

Deletes a BillingAccount

This operation deletes a BillingAccount entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BillingAccountApi;


BillingAccountApi apiInstance = new BillingAccountApi();
String id = "id_example"; // String | Identifier of the BillingAccount
try {
    apiInstance.deleteBillingAccount(id);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingAccountApi#deleteBillingAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the BillingAccount |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listBillingAccount"></a>
# **listBillingAccount**
> List&lt;BillingAccount&gt; listBillingAccount(fields, offset, limit)

List or find BillingAccount objects

This operation list or find BillingAccount entities

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BillingAccountApi;


BillingAccountApi apiInstance = new BillingAccountApi();
String fields = "fields_example"; // String | Comma-separated properties to be provided in response
Integer offset = 56; // Integer | Requested index for start of resources to be provided in response
Integer limit = 56; // Integer | Requested number of resources to be provided in response
try {
    List<BillingAccount> result = apiInstance.listBillingAccount(fields, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingAccountApi#listBillingAccount");
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

[**List&lt;BillingAccount&gt;**](BillingAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="patchBillingAccount"></a>
# **patchBillingAccount**
> BillingAccount patchBillingAccount(id, billingAccount)

Updates partially a BillingAccount

This operation updates partially a BillingAccount entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BillingAccountApi;


BillingAccountApi apiInstance = new BillingAccountApi();
String id = "id_example"; // String | Identifier of the BillingAccount
BillingAccountUpdate billingAccount = new BillingAccountUpdate(); // BillingAccountUpdate | The BillingAccount to be updated
try {
    BillingAccount result = apiInstance.patchBillingAccount(id, billingAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingAccountApi#patchBillingAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the BillingAccount |
 **billingAccount** | [**BillingAccountUpdate**](BillingAccountUpdate.md)| The BillingAccount to be updated |

### Return type

[**BillingAccount**](BillingAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="retrieveBillingAccount"></a>
# **retrieveBillingAccount**
> BillingAccount retrieveBillingAccount(id, fields)

Retrieves a BillingAccount by ID

This operation retrieves a BillingAccount entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BillingAccountApi;


BillingAccountApi apiInstance = new BillingAccountApi();
String id = "id_example"; // String | Identifier of the BillingAccount
String fields = "fields_example"; // String | Comma-separated properties to provide in response
try {
    BillingAccount result = apiInstance.retrieveBillingAccount(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingAccountApi#retrieveBillingAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the BillingAccount |
 **fields** | **String**| Comma-separated properties to provide in response | [optional]

### Return type

[**BillingAccount**](BillingAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

