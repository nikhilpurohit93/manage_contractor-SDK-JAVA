/*
 * Manage Contractors APIs
 * This API supports all services required to manage Employees on HR system
 *
 * OpenAPI spec version: 0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.AccessToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthenticationApi {
    private ApiClient apiClient;

    public AuthenticationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthenticationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for oauthTokenPost
     * @param grantType The grant type for OAuth2.0 (optional, default to client_credentials)
     * @param clientId Client ID (optional)
     * @param clientSecret Client Secret (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call oauthTokenPostCall(String grantType, String clientId, String clientSecret, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/oauth/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (grantType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("grant_type", grantType));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (clientId != null)
        localVarFormParams.put("client_id", clientId);
        if (clientSecret != null)
        localVarFormParams.put("client_secret", clientSecret);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call oauthTokenPostValidateBeforeCall(String grantType, String clientId, String clientSecret, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = oauthTokenPostCall(grantType, clientId, clientSecret, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Access Token
     * Verify client credentials and returns a bearer token.
     * @param grantType The grant type for OAuth2.0 (optional, default to client_credentials)
     * @param clientId Client ID (optional)
     * @param clientSecret Client Secret (optional)
     * @return AccessToken
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccessToken oauthTokenPost(String grantType, String clientId, String clientSecret) throws ApiException {
        ApiResponse<AccessToken> resp = oauthTokenPostWithHttpInfo(grantType, clientId, clientSecret);
        return resp.getData();
    }

    /**
     * Get Access Token
     * Verify client credentials and returns a bearer token.
     * @param grantType The grant type for OAuth2.0 (optional, default to client_credentials)
     * @param clientId Client ID (optional)
     * @param clientSecret Client Secret (optional)
     * @return ApiResponse&lt;AccessToken&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccessToken> oauthTokenPostWithHttpInfo(String grantType, String clientId, String clientSecret) throws ApiException {
        com.squareup.okhttp.Call call = oauthTokenPostValidateBeforeCall(grantType, clientId, clientSecret, null, null);
        Type localVarReturnType = new TypeToken<AccessToken>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Access Token (asynchronously)
     * Verify client credentials and returns a bearer token.
     * @param grantType The grant type for OAuth2.0 (optional, default to client_credentials)
     * @param clientId Client ID (optional)
     * @param clientSecret Client Secret (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call oauthTokenPostAsync(String grantType, String clientId, String clientSecret, final ApiCallback<AccessToken> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = oauthTokenPostValidateBeforeCall(grantType, clientId, clientSecret, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccessToken>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
