# NotificationListenersClientSideApi

All URIs are relative to *https://virtserver.swaggerhub.com/etom7/etom/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listenToBillingAccountAttributeValueChangeEvent**](NotificationListenersClientSideApi.md#listenToBillingAccountAttributeValueChangeEvent) | **POST** /listener/billingAccountAttributeValueChangeEvent | Client listener for entity BillingAccountAttributeValueChangeEvent
[**listenToBillingAccountStateChangeEvent**](NotificationListenersClientSideApi.md#listenToBillingAccountStateChangeEvent) | **POST** /listener/billingAccountStateChangeEvent | Client listener for entity BillingAccountStateChangeEvent
[**listenToFinancialAccountAttributeValueChangeEvent**](NotificationListenersClientSideApi.md#listenToFinancialAccountAttributeValueChangeEvent) | **POST** /listener/financialAccountAttributeValueChangeEvent | Client listener for entity FinancialAccountAttributeValueChangeEvent
[**listenToFinancialAccountCreateEvent**](NotificationListenersClientSideApi.md#listenToFinancialAccountCreateEvent) | **POST** /listener/financialAccountCreateEvent | Client listener for entity FinancialAccountCreateEvent
[**listenToFinancialAccountDeleteEvent**](NotificationListenersClientSideApi.md#listenToFinancialAccountDeleteEvent) | **POST** /listener/financialAccountDeleteEvent | Client listener for entity FinancialAccountDeleteEvent
[**listenToFinancialAccountStateChangeEvent**](NotificationListenersClientSideApi.md#listenToFinancialAccountStateChangeEvent) | **POST** /listener/financialAccountStateChangeEvent | Client listener for entity FinancialAccountStateChangeEvent
[**listenToPartyAccountAttributeValueChangeEvent**](NotificationListenersClientSideApi.md#listenToPartyAccountAttributeValueChangeEvent) | **POST** /listener/partyAccountAttributeValueChangeEvent | Client listener for entity PartyAccountAttributeValueChangeEvent
[**listenToPartyAccountStateChangeEvent**](NotificationListenersClientSideApi.md#listenToPartyAccountStateChangeEvent) | **POST** /listener/partyAccountStateChangeEvent | Client listener for entity PartyAccountStateChangeEvent
[**listenToSettlementAccountAttributeValueChangeEvent**](NotificationListenersClientSideApi.md#listenToSettlementAccountAttributeValueChangeEvent) | **POST** /listener/settlementAccountAttributeValueChangeEvent | Client listener for entity SettlementAccountAttributeValueChangeEvent
[**listenToSettlementAccountStateChangeEvent**](NotificationListenersClientSideApi.md#listenToSettlementAccountStateChangeEvent) | **POST** /listener/settlementAccountStateChangeEvent | Client listener for entity SettlementAccountStateChangeEvent


<a name="listenToBillingAccountAttributeValueChangeEvent"></a>
# **listenToBillingAccountAttributeValueChangeEvent**
> EventSubscription listenToBillingAccountAttributeValueChangeEvent(data)

Client listener for entity BillingAccountAttributeValueChangeEvent

Example of a client listener for receiving the notification BillingAccountAttributeValueChangeEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
BillingAccountAttributeValueChangeEvent data = new BillingAccountAttributeValueChangeEvent(); // BillingAccountAttributeValueChangeEvent | The event data
try {
    EventSubscription result = apiInstance.listenToBillingAccountAttributeValueChangeEvent(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToBillingAccountAttributeValueChangeEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**BillingAccountAttributeValueChangeEvent**](BillingAccountAttributeValueChangeEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToBillingAccountStateChangeEvent"></a>
# **listenToBillingAccountStateChangeEvent**
> EventSubscription listenToBillingAccountStateChangeEvent(data)

Client listener for entity BillingAccountStateChangeEvent

Example of a client listener for receiving the notification BillingAccountStateChangeEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
BillingAccountStateChangeEvent data = new BillingAccountStateChangeEvent(); // BillingAccountStateChangeEvent | The event data
try {
    EventSubscription result = apiInstance.listenToBillingAccountStateChangeEvent(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToBillingAccountStateChangeEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**BillingAccountStateChangeEvent**](BillingAccountStateChangeEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToFinancialAccountAttributeValueChangeEvent"></a>
# **listenToFinancialAccountAttributeValueChangeEvent**
> EventSubscription listenToFinancialAccountAttributeValueChangeEvent(data)

Client listener for entity FinancialAccountAttributeValueChangeEvent

Example of a client listener for receiving the notification FinancialAccountAttributeValueChangeEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
FinancialAccountAttributeValueChangeEvent data = new FinancialAccountAttributeValueChangeEvent(); // FinancialAccountAttributeValueChangeEvent | The event data
try {
    EventSubscription result = apiInstance.listenToFinancialAccountAttributeValueChangeEvent(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToFinancialAccountAttributeValueChangeEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**FinancialAccountAttributeValueChangeEvent**](FinancialAccountAttributeValueChangeEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToFinancialAccountCreateEvent"></a>
# **listenToFinancialAccountCreateEvent**
> EventSubscription listenToFinancialAccountCreateEvent(data)

Client listener for entity FinancialAccountCreateEvent

Example of a client listener for receiving the notification FinancialAccountCreateEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
FinancialAccountCreateEvent data = new FinancialAccountCreateEvent(); // FinancialAccountCreateEvent | The event data
try {
    EventSubscription result = apiInstance.listenToFinancialAccountCreateEvent(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToFinancialAccountCreateEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**FinancialAccountCreateEvent**](FinancialAccountCreateEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToFinancialAccountDeleteEvent"></a>
# **listenToFinancialAccountDeleteEvent**
> EventSubscription listenToFinancialAccountDeleteEvent(data)

Client listener for entity FinancialAccountDeleteEvent

Example of a client listener for receiving the notification FinancialAccountDeleteEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
FinancialAccountDeleteEvent data = new FinancialAccountDeleteEvent(); // FinancialAccountDeleteEvent | The event data
try {
    EventSubscription result = apiInstance.listenToFinancialAccountDeleteEvent(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToFinancialAccountDeleteEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**FinancialAccountDeleteEvent**](FinancialAccountDeleteEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToFinancialAccountStateChangeEvent"></a>
# **listenToFinancialAccountStateChangeEvent**
> EventSubscription listenToFinancialAccountStateChangeEvent(data)

Client listener for entity FinancialAccountStateChangeEvent

Example of a client listener for receiving the notification FinancialAccountStateChangeEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
FinancialAccountStateChangeEvent data = new FinancialAccountStateChangeEvent(); // FinancialAccountStateChangeEvent | The event data
try {
    EventSubscription result = apiInstance.listenToFinancialAccountStateChangeEvent(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToFinancialAccountStateChangeEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**FinancialAccountStateChangeEvent**](FinancialAccountStateChangeEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToPartyAccountAttributeValueChangeEvent"></a>
# **listenToPartyAccountAttributeValueChangeEvent**
> EventSubscription listenToPartyAccountAttributeValueChangeEvent(data)

Client listener for entity PartyAccountAttributeValueChangeEvent

Example of a client listener for receiving the notification PartyAccountAttributeValueChangeEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
PartyAccountAttributeValueChangeEvent data = new PartyAccountAttributeValueChangeEvent(); // PartyAccountAttributeValueChangeEvent | The event data
try {
    EventSubscription result = apiInstance.listenToPartyAccountAttributeValueChangeEvent(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToPartyAccountAttributeValueChangeEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**PartyAccountAttributeValueChangeEvent**](PartyAccountAttributeValueChangeEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToPartyAccountStateChangeEvent"></a>
# **listenToPartyAccountStateChangeEvent**
> EventSubscription listenToPartyAccountStateChangeEvent(data)

Client listener for entity PartyAccountStateChangeEvent

Example of a client listener for receiving the notification PartyAccountStateChangeEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
PartyAccountStateChangeEvent data = new PartyAccountStateChangeEvent(); // PartyAccountStateChangeEvent | The event data
try {
    EventSubscription result = apiInstance.listenToPartyAccountStateChangeEvent(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToPartyAccountStateChangeEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**PartyAccountStateChangeEvent**](PartyAccountStateChangeEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToSettlementAccountAttributeValueChangeEvent"></a>
# **listenToSettlementAccountAttributeValueChangeEvent**
> EventSubscription listenToSettlementAccountAttributeValueChangeEvent(data)

Client listener for entity SettlementAccountAttributeValueChangeEvent

Example of a client listener for receiving the notification SettlementAccountAttributeValueChangeEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
SettlementAccountAttributeValueChangeEvent data = new SettlementAccountAttributeValueChangeEvent(); // SettlementAccountAttributeValueChangeEvent | The event data
try {
    EventSubscription result = apiInstance.listenToSettlementAccountAttributeValueChangeEvent(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToSettlementAccountAttributeValueChangeEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**SettlementAccountAttributeValueChangeEvent**](SettlementAccountAttributeValueChangeEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listenToSettlementAccountStateChangeEvent"></a>
# **listenToSettlementAccountStateChangeEvent**
> EventSubscription listenToSettlementAccountStateChangeEvent(data)

Client listener for entity SettlementAccountStateChangeEvent

Example of a client listener for receiving the notification SettlementAccountStateChangeEvent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationListenersClientSideApi;


NotificationListenersClientSideApi apiInstance = new NotificationListenersClientSideApi();
SettlementAccountStateChangeEvent data = new SettlementAccountStateChangeEvent(); // SettlementAccountStateChangeEvent | The event data
try {
    EventSubscription result = apiInstance.listenToSettlementAccountStateChangeEvent(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationListenersClientSideApi#listenToSettlementAccountStateChangeEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**SettlementAccountStateChangeEvent**](SettlementAccountStateChangeEvent.md)| The event data |

### Return type

[**EventSubscription**](EventSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

