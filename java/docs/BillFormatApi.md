# BillFormatApi

All URIs are relative to *https://virtserver.swaggerhub.com/etom7/etom/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBillFormat**](BillFormatApi.md#createBillFormat) | **POST** /billFormat | Creates a BillFormat
[**deleteBillFormat**](BillFormatApi.md#deleteBillFormat) | **DELETE** /billFormat/{id} | Deletes a BillFormat
[**listBillFormat**](BillFormatApi.md#listBillFormat) | **GET** /billFormat | List or find BillFormat objects
[**patchBillFormat**](BillFormatApi.md#patchBillFormat) | **PATCH** /billFormat/{id} | Updates partially a BillFormat
[**retrieveBillFormat**](BillFormatApi.md#retrieveBillFormat) | **GET** /billFormat/{id} | Retrieves a BillFormat by ID


<a name="createBillFormat"></a>
# **createBillFormat**
> BillFormat createBillFormat(billFormat)

Creates a BillFormat

This operation creates a BillFormat entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BillFormatApi;


BillFormatApi apiInstance = new BillFormatApi();
BillFormatCreate billFormat = new BillFormatCreate(); // BillFormatCreate | The BillFormat to be created
try {
    BillFormat result = apiInstance.createBillFormat(billFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillFormatApi#createBillFormat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billFormat** | [**BillFormatCreate**](BillFormatCreate.md)| The BillFormat to be created |

### Return type

[**BillFormat**](BillFormat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteBillFormat"></a>
# **deleteBillFormat**
> deleteBillFormat(id)

Deletes a BillFormat

This operation deletes a BillFormat entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BillFormatApi;


BillFormatApi apiInstance = new BillFormatApi();
String id = "id_example"; // String | Identifier of the BillFormat
try {
    apiInstance.deleteBillFormat(id);
} catch (ApiException e) {
    System.err.println("Exception when calling BillFormatApi#deleteBillFormat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the BillFormat |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listBillFormat"></a>
# **listBillFormat**
> List&lt;BillFormat&gt; listBillFormat(fields, offset, limit)

List or find BillFormat objects

This operation list or find BillFormat entities

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BillFormatApi;


BillFormatApi apiInstance = new BillFormatApi();
String fields = "fields_example"; // String | Comma-separated properties to be provided in response
Integer offset = 56; // Integer | Requested index for start of resources to be provided in response
Integer limit = 56; // Integer | Requested number of resources to be provided in response
try {
    List<BillFormat> result = apiInstance.listBillFormat(fields, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillFormatApi#listBillFormat");
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

[**List&lt;BillFormat&gt;**](BillFormat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="patchBillFormat"></a>
# **patchBillFormat**
> BillFormat patchBillFormat(id, billFormat)

Updates partially a BillFormat

This operation updates partially a BillFormat entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BillFormatApi;


BillFormatApi apiInstance = new BillFormatApi();
String id = "id_example"; // String | Identifier of the BillFormat
BillFormatUpdate billFormat = new BillFormatUpdate(); // BillFormatUpdate | The BillFormat to be updated
try {
    BillFormat result = apiInstance.patchBillFormat(id, billFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillFormatApi#patchBillFormat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the BillFormat |
 **billFormat** | [**BillFormatUpdate**](BillFormatUpdate.md)| The BillFormat to be updated |

### Return type

[**BillFormat**](BillFormat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="retrieveBillFormat"></a>
# **retrieveBillFormat**
> BillFormat retrieveBillFormat(id, fields)

Retrieves a BillFormat by ID

This operation retrieves a BillFormat entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BillFormatApi;


BillFormatApi apiInstance = new BillFormatApi();
String id = "id_example"; // String | Identifier of the BillFormat
String fields = "fields_example"; // String | Comma-separated properties to provide in response
try {
    BillFormat result = apiInstance.retrieveBillFormat(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillFormatApi#retrieveBillFormat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the BillFormat |
 **fields** | **String**| Comma-separated properties to provide in response | [optional]

### Return type

[**BillFormat**](BillFormat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

