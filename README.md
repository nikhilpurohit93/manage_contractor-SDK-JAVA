# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AuthenticationApi;

import java.io.File;
import java.util.*;

public class AuthenticationApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://mg-eval-test.apigee.net/demo/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | [**oauthTokenPost**](docs/AuthenticationApi.md#oauthTokenPost) | **POST** /oauth/token | Get Access Token
*ContractorsApi* | [**contractorsEmployeeIDDelete**](docs/ContractorsApi.md#contractorsEmployeeIDDelete) | **DELETE** /contractors/{employeeID} | Deletes an Employee record
*ContractorsApi* | [**contractorsEmployeeIDGet**](docs/ContractorsApi.md#contractorsEmployeeIDGet) | **GET** /contractors/{employeeID} | Retrieves an Employee record
*ContractorsApi* | [**contractorsGet**](docs/ContractorsApi.md#contractorsGet) | **GET** /contractors | Retrieves all Employee records
*ContractorsApi* | [**contractorsPost**](docs/ContractorsApi.md#contractorsPost) | **POST** /contractors | Creates an Employees


## Documentation for Models

 - [AccessToken](docs/AccessToken.md)
 - [Employee](docs/Employee.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



