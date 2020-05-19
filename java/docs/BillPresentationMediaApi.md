# BillPresentationMediaApi

All URIs are relative to *https://virtserver.swaggerhub.com/etom7/etom/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBillPresentationMedia**](BillPresentationMediaApi.md#createBillPresentationMedia) | **POST** /billPresentationMedia | Creates a BillPresentationMedia
[**deleteBillPresentationMedia**](BillPresentationMediaApi.md#deleteBillPresentationMedia) | **DELETE** /billPresentationMedia/{id} | Deletes a BillPresentationMedia
[**listBillPresentationMedia**](BillPresentationMediaApi.md#listBillPresentationMedia) | **GET** /billPresentationMedia | List or find BillPresentationMedia objects
[**patchBillPresentationMedia**](BillPresentationMediaApi.md#patchBillPresentationMedia) | **PATCH** /billPresentationMedia/{id} | Updates partially a BillPresentationMedia
[**retrieveBillPresentationMedia**](BillPresentationMediaApi.md#retrieveBillPresentationMedia) | **GET** /billPresentationMedia/{id} | Retrieves a BillPresentationMedia by ID


<a name="createBillPresentationMedia"></a>
# **createBillPresentationMedia**
> BillPresentationMedia createBillPresentationMedia(billPresentationMedia)

Creates a BillPresentationMedia

This operation creates a BillPresentationMedia entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BillPresentationMediaApi;


BillPresentationMediaApi apiInstance = new BillPresentationMediaApi();
BillPresentationMediaCreate billPresentationMedia = new BillPresentationMediaCreate(); // BillPresentationMediaCreate | The BillPresentationMedia to be created
try {
    BillPresentationMedia result = apiInstance.createBillPresentationMedia(billPresentationMedia);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillPresentationMediaApi#createBillPresentationMedia");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billPresentationMedia** | [**BillPresentationMediaCreate**](BillPresentationMediaCreate.md)| The BillPresentationMedia to be created |

### Return type

[**BillPresentationMedia**](BillPresentationMedia.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteBillPresentationMedia"></a>
# **deleteBillPresentationMedia**
> deleteBillPresentationMedia(id)

Deletes a BillPresentationMedia

This operation deletes a BillPresentationMedia entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BillPresentationMediaApi;


BillPresentationMediaApi apiInstance = new BillPresentationMediaApi();
String id = "id_example"; // String | Identifier of the BillPresentationMedia
try {
    apiInstance.deleteBillPresentationMedia(id);
} catch (ApiException e) {
    System.err.println("Exception when calling BillPresentationMediaApi#deleteBillPresentationMedia");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the BillPresentationMedia |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listBillPresentationMedia"></a>
# **listBillPresentationMedia**
> List&lt;BillPresentationMedia&gt; listBillPresentationMedia(fields, offset, limit)

List or find BillPresentationMedia objects

This operation list or find BillPresentationMedia entities

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BillPresentationMediaApi;


BillPresentationMediaApi apiInstance = new BillPresentationMediaApi();
String fields = "fields_example"; // String | Comma-separated properties to be provided in response
Integer offset = 56; // Integer | Requested index for start of resources to be provided in response
Integer limit = 56; // Integer | Requested number of resources to be provided in response
try {
    List<BillPresentationMedia> result = apiInstance.listBillPresentationMedia(fields, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillPresentationMediaApi#listBillPresentationMedia");
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

[**List&lt;BillPresentationMedia&gt;**](BillPresentationMedia.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="patchBillPresentationMedia"></a>
# **patchBillPresentationMedia**
> BillPresentationMedia patchBillPresentationMedia(id, billPresentationMedia)

Updates partially a BillPresentationMedia

This operation updates partially a BillPresentationMedia entity.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BillPresentationMediaApi;


BillPresentationMediaApi apiInstance = new BillPresentationMediaApi();
String id = "id_example"; // String | Identifier of the BillPresentationMedia
BillPresentationMediaUpdate billPresentationMedia = new BillPresentationMediaUpdate(); // BillPresentationMediaUpdate | The BillPresentationMedia to be updated
try {
    BillPresentationMedia result = apiInstance.patchBillPresentationMedia(id, billPresentationMedia);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillPresentationMediaApi#patchBillPresentationMedia");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the BillPresentationMedia |
 **billPresentationMedia** | [**BillPresentationMediaUpdate**](BillPresentationMediaUpdate.md)| The BillPresentationMedia to be updated |

### Return type

[**BillPresentationMedia**](BillPresentationMedia.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="retrieveBillPresentationMedia"></a>
# **retrieveBillPresentationMedia**
> BillPresentationMedia retrieveBillPresentationMedia(id, fields)

Retrieves a BillPresentationMedia by ID

This operation retrieves a BillPresentationMedia entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BillPresentationMediaApi;


BillPresentationMediaApi apiInstance = new BillPresentationMediaApi();
String id = "id_example"; // String | Identifier of the BillPresentationMedia
String fields = "fields_example"; // String | Comma-separated properties to provide in response
try {
    BillPresentationMedia result = apiInstance.retrieveBillPresentationMedia(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BillPresentationMediaApi#retrieveBillPresentationMedia");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the BillPresentationMedia |
 **fields** | **String**| Comma-separated properties to provide in response | [optional]

### Return type

[**BillPresentationMedia**](BillPresentationMedia.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

