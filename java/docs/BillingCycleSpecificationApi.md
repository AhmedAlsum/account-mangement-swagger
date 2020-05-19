# BillingCycleSpecificationApi

All URIs are relative to *https://virtserver.swaggerhub.com/etom7/etom/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBillingCycleSpecification**](BillingCycleSpecificationApi.md#createBillingCycleSpecification) | **POST** /billingCycleSpecification | Creates a BillingCycleSpecification
[**deleteBillingCycleSpecification**](BillingCycleSpecificationApi.md#deleteBillingCycleSpecification) | **DELETE** /billingCycleSpecification/{id} | Deletes a BillingCycleSpecification
[**listBillingCycleSpecification**](BillingCycleSpecificationApi.md#listBillingCycleSpecification) | **GET** /billingCycleSpecification | List or find BillingCycleSpecification objects
[**patchBillingCycleSpecification**](BillingCycleSpecificationApi.md#patchBillingCycleSpecification) | **PATCH** /billingCycleSpecification/{id} | Updates partially a BillingCycleSpecification
[**retrieveBillingCycleSpecification**](BillingCycleSpecificationApi.md#retrieveBillingCycleSpecification) | **GET** /billingCycleSpecification/{id} | Retrieves a BillingCycleSpecification by ID


<a name="createBillingCycleSpecification"></a>
# **createBillingCycleSpecification**
> BillingCycleSpecification createBillingCycleSpecification(billingCycleSpecification)

Creates a BillingCycleSpecification

This operation creates a BillingCycleSpecification entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BillingCycleSpecificationApi;


BillingCycleSpecificationApi apiInstance = new BillingCycleSpecificationApi();
BillingCycleSpecificationCreate billingCycleSpecification = new BillingCycleSpecificationCreate(); // BillingCycleSpecificationCreate | The BillingCycleSpecification to be created
try {
    BillingCycleSpecification result = apiInstance.createBillingCycleSpecification(billingCycleSpecification);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCycleSpecificationApi#createBillingCycleSpecification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingCycleSpecification** | [**BillingCycleSpecificationCreate**](BillingCycleSpecificationCreate.md)| The BillingCycleSpecification to be created |

### Return type

[**BillingCycleSpecification**](BillingCycleSpecification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteBillingCycleSpecification"></a>
# **deleteBillingCycleSpecification**
> deleteBillingCycleSpecification(id)

Deletes a BillingCycleSpecification

This operation deletes a BillingCycleSpecification entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BillingCycleSpecificationApi;


BillingCycleSpecificationApi apiInstance = new BillingCycleSpecificationApi();
String id = "id_example"; // String | Identifier of the BillingCycleSpecification
try {
    apiInstance.deleteBillingCycleSpecification(id);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCycleSpecificationApi#deleteBillingCycleSpecification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the BillingCycleSpecification |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listBillingCycleSpecification"></a>
# **listBillingCycleSpecification**
> List&lt;BillingCycleSpecification&gt; listBillingCycleSpecification(fields, offset, limit)

List or find BillingCycleSpecification objects

This operation list or find BillingCycleSpecification entities

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BillingCycleSpecificationApi;


BillingCycleSpecificationApi apiInstance = new BillingCycleSpecificationApi();
String fields = "fields_example"; // String | Comma-separated properties to be provided in response
Integer offset = 56; // Integer | Requested index for start of resources to be provided in response
Integer limit = 56; // Integer | Requested number of resources to be provided in response
try {
    List<BillingCycleSpecification> result = apiInstance.listBillingCycleSpecification(fields, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCycleSpecificationApi#listBillingCycleSpecification");
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

[**List&lt;BillingCycleSpecification&gt;**](BillingCycleSpecification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="patchBillingCycleSpecification"></a>
# **patchBillingCycleSpecification**
> BillingCycleSpecification patchBillingCycleSpecification(id, billingCycleSpecification)

Updates partially a BillingCycleSpecification

This operation updates partially a BillingCycleSpecification entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BillingCycleSpecificationApi;


BillingCycleSpecificationApi apiInstance = new BillingCycleSpecificationApi();
String id = "id_example"; // String | Identifier of the BillingCycleSpecification
BillingCycleSpecificationUpdate billingCycleSpecification = new BillingCycleSpecificationUpdate(); // BillingCycleSpecificationUpdate | The BillingCycleSpecification to be updated
try {
    BillingCycleSpecification result = apiInstance.patchBillingCycleSpecification(id, billingCycleSpecification);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCycleSpecificationApi#patchBillingCycleSpecification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the BillingCycleSpecification |
 **billingCycleSpecification** | [**BillingCycleSpecificationUpdate**](BillingCycleSpecificationUpdate.md)| The BillingCycleSpecification to be updated |

### Return type

[**BillingCycleSpecification**](BillingCycleSpecification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="retrieveBillingCycleSpecification"></a>
# **retrieveBillingCycleSpecification**
> BillingCycleSpecification retrieveBillingCycleSpecification(id, fields)

Retrieves a BillingCycleSpecification by ID

This operation retrieves a BillingCycleSpecification entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BillingCycleSpecificationApi;


BillingCycleSpecificationApi apiInstance = new BillingCycleSpecificationApi();
String id = "id_example"; // String | Identifier of the BillingCycleSpecification
String fields = "fields_example"; // String | Comma-separated properties to provide in response
try {
    BillingCycleSpecification result = apiInstance.retrieveBillingCycleSpecification(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillingCycleSpecificationApi#retrieveBillingCycleSpecification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the BillingCycleSpecification |
 **fields** | **String**| Comma-separated properties to provide in response | [optional]

### Return type

[**BillingCycleSpecification**](BillingCycleSpecification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

