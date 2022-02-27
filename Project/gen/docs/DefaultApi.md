# DefaultApi

All URIs are relative to *https://Project*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCustomer**](DefaultApi.md#deleteCustomer) | **GET** /deleteCustomer/{id} | GET deleteCustomer/{id}
[**findPaginated**](DefaultApi.md#findPaginated) | **GET** /page/{pageNo} | GET page/{pageNo}
[**getCustomers**](DefaultApi.md#getCustomers) | **GET** /getCustomer/{identityNumber} | GET getCustomer/{identityNumber}
[**saveCustomer**](DefaultApi.md#saveCustomer) | **POST** /saveCustomer | POST saveCustomer
[**showFormForUpdate**](DefaultApi.md#showFormForUpdate) | **GET** /showFormForUpdate/{id} | GET showFormForUpdate/{id}
[**showNewCustomerForm**](DefaultApi.md#showNewCustomerForm) | **GET** /showNewCustomerForm | GET showNewCustomerForm
[**showQueryForm**](DefaultApi.md#showQueryForm) | **GET** /showQueryForm | GET showQueryForm
[**viewHomePage**](DefaultApi.md#viewHomePage) | **GET** / | GET 


<a name="deleteCustomer"></a>
# **deleteCustomer**
> deleteCustomer(id)

GET deleteCustomer/{id}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://Project");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    BigDecimal id = new BigDecimal(78); // BigDecimal | 
    try {
      apiInstance.deleteCustomer(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteCustomer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **BigDecimal**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="findPaginated"></a>
# **findPaginated**
> findPaginated(pageNo, sortField, sortDir)

GET page/{pageNo}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://Project");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    BigDecimal pageNo = new BigDecimal(78); // BigDecimal | 
    String sortField = "sortField_example"; // String | 
    String sortDir = "sortDir_example"; // String | 
    try {
      apiInstance.findPaginated(pageNo, sortField, sortDir);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#findPaginated");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNo** | **BigDecimal**|  |
 **sortField** | **String**|  |
 **sortDir** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getCustomers"></a>
# **getCustomers**
> getCustomers(identityNumber)

GET getCustomer/{identityNumber}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://Project");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String identityNumber = "identityNumber_example"; // String | 
    try {
      apiInstance.getCustomers(identityNumber);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getCustomers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identityNumber** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="saveCustomer"></a>
# **saveCustomer**
> saveCustomer()

POST saveCustomer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://Project");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      apiInstance.saveCustomer();
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#saveCustomer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="showFormForUpdate"></a>
# **showFormForUpdate**
> showFormForUpdate(id)

GET showFormForUpdate/{id}

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://Project");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    BigDecimal id = new BigDecimal(78); // BigDecimal | 
    try {
      apiInstance.showFormForUpdate(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#showFormForUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **BigDecimal**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="showNewCustomerForm"></a>
# **showNewCustomerForm**
> showNewCustomerForm()

GET showNewCustomerForm

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://Project");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      apiInstance.showNewCustomerForm();
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#showNewCustomerForm");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="showQueryForm"></a>
# **showQueryForm**
> showQueryForm()

GET showQueryForm

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://Project");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      apiInstance.showQueryForm();
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#showQueryForm");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="viewHomePage"></a>
# **viewHomePage**
> viewHomePage()

GET 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://Project");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      apiInstance.viewHomePage();
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#viewHomePage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

