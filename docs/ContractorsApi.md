# ContractorsApi

All URIs are relative to *https://mg-eval-test.apigee.net/demo/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contractorsEmployeeIDDelete**](ContractorsApi.md#contractorsEmployeeIDDelete) | **DELETE** /contractors/{employeeID} | Deletes an Employee record
[**contractorsEmployeeIDGet**](ContractorsApi.md#contractorsEmployeeIDGet) | **GET** /contractors/{employeeID} | Retrieves an Employee record
[**contractorsGet**](ContractorsApi.md#contractorsGet) | **GET** /contractors | Retrieves all Employee records
[**contractorsPost**](ContractorsApi.md#contractorsPost) | **POST** /contractors | Creates an Employees


<a name="contractorsEmployeeIDDelete"></a>
# **contractorsEmployeeIDDelete**
> contractorsEmployeeIDDelete(employeeID)

Deletes an Employee record

Deletes the profile of an employee.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContractorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

ContractorsApi apiInstance = new ContractorsApi();
Integer employeeID = 56; // Integer | The unique ID of employee.
try {
    apiInstance.contractorsEmployeeIDDelete(employeeID);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractorsApi#contractorsEmployeeIDDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employeeID** | **Integer**| The unique ID of employee. |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contractorsEmployeeIDGet"></a>
# **contractorsEmployeeIDGet**
> Employee contractorsEmployeeIDGet(employeeID)

Retrieves an Employee record

Retrieves the profile of an employee.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContractorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

ContractorsApi apiInstance = new ContractorsApi();
Integer employeeID = 56; // Integer | The unique ID of employee.
try {
    Employee result = apiInstance.contractorsEmployeeIDGet(employeeID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractorsApi#contractorsEmployeeIDGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employeeID** | **Integer**| The unique ID of employee. |

### Return type

[**Employee**](Employee.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contractorsGet"></a>
# **contractorsGet**
> ERRORUNKNOWN contractorsGet()

Retrieves all Employee records

Retrieves the profile of all employees.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContractorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

ContractorsApi apiInstance = new ContractorsApi();
try {
    ERRORUNKNOWN result = apiInstance.contractorsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractorsApi#contractorsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ERRORUNKNOWN**](ERRORUNKNOWN.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="contractorsPost"></a>
# **contractorsPost**
> contractorsPost(employee)

Creates an Employees

Registers a new employee for the client.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContractorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

ContractorsApi apiInstance = new ContractorsApi();
Employee employee = new Employee(); // Employee | The Employee
try {
    apiInstance.contractorsPost(employee);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractorsApi#contractorsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employee** | [**Employee**](Employee.md)| The Employee | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

