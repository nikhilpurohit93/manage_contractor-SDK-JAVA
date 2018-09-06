# AuthenticationApi

All URIs are relative to *https://mg-eval-test.apigee.net/demo/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthTokenPost**](AuthenticationApi.md#oauthTokenPost) | **POST** /oauth/token | Get Access Token


<a name="oauthTokenPost"></a>
# **oauthTokenPost**
> AccessToken oauthTokenPost(grantType, clientId, clientSecret)

Get Access Token

Verify client credentials and returns a bearer token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
String grantType = "client_credentials"; // String | The grant type for OAuth2.0
String clientId = "clientId_example"; // String | Client ID
String clientSecret = "clientSecret_example"; // String | Client Secret
try {
    AccessToken result = apiInstance.oauthTokenPost(grantType, clientId, clientSecret);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#oauthTokenPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | **String**| The grant type for OAuth2.0 | [optional] [default to client_credentials]
 **clientId** | **String**| Client ID | [optional]
 **clientSecret** | **String**| Client Secret | [optional]

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

