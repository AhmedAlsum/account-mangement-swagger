/*
 * Account Management
 * This is Swagger UI environment generated for the TMF Account Management specification
 *
 * OpenAPI spec version: 1.0.0
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


import io.swagger.client.model.Error;
import io.swagger.client.model.SettlementAccount;
import io.swagger.client.model.SettlementAccountCreate;
import io.swagger.client.model.SettlementAccountUpdate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SettlementAccountApi {
    private ApiClient apiClient;

    public SettlementAccountApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SettlementAccountApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createSettlementAccount
     * @param settlementAccount The SettlementAccount to be created (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createSettlementAccountCall(SettlementAccountCreate settlementAccount, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = settlementAccount;

        // create path and map variables
        String localVarPath = "/settlementAccount";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
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
    private com.squareup.okhttp.Call createSettlementAccountValidateBeforeCall(SettlementAccountCreate settlementAccount, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'settlementAccount' is set
        if (settlementAccount == null) {
            throw new ApiException("Missing the required parameter 'settlementAccount' when calling createSettlementAccount(Async)");
        }
        

        com.squareup.okhttp.Call call = createSettlementAccountCall(settlementAccount, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates a SettlementAccount
     * This operation creates a SettlementAccount entity.
     * @param settlementAccount The SettlementAccount to be created (required)
     * @return SettlementAccount
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SettlementAccount createSettlementAccount(SettlementAccountCreate settlementAccount) throws ApiException {
        ApiResponse<SettlementAccount> resp = createSettlementAccountWithHttpInfo(settlementAccount);
        return resp.getData();
    }

    /**
     * Creates a SettlementAccount
     * This operation creates a SettlementAccount entity.
     * @param settlementAccount The SettlementAccount to be created (required)
     * @return ApiResponse&lt;SettlementAccount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SettlementAccount> createSettlementAccountWithHttpInfo(SettlementAccountCreate settlementAccount) throws ApiException {
        com.squareup.okhttp.Call call = createSettlementAccountValidateBeforeCall(settlementAccount, null, null);
        Type localVarReturnType = new TypeToken<SettlementAccount>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates a SettlementAccount (asynchronously)
     * This operation creates a SettlementAccount entity.
     * @param settlementAccount The SettlementAccount to be created (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createSettlementAccountAsync(SettlementAccountCreate settlementAccount, final ApiCallback<SettlementAccount> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createSettlementAccountValidateBeforeCall(settlementAccount, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SettlementAccount>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteSettlementAccount
     * @param id Identifier of the SettlementAccount (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSettlementAccountCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/settlementAccount/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteSettlementAccountValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteSettlementAccount(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteSettlementAccountCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deletes a SettlementAccount
     * This operation deletes a SettlementAccount entity.
     * @param id Identifier of the SettlementAccount (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteSettlementAccount(String id) throws ApiException {
        deleteSettlementAccountWithHttpInfo(id);
    }

    /**
     * Deletes a SettlementAccount
     * This operation deletes a SettlementAccount entity.
     * @param id Identifier of the SettlementAccount (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteSettlementAccountWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteSettlementAccountValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a SettlementAccount (asynchronously)
     * This operation deletes a SettlementAccount entity.
     * @param id Identifier of the SettlementAccount (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSettlementAccountAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteSettlementAccountValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for listSettlementAccount
     * @param fields Comma-separated properties to be provided in response (optional)
     * @param offset Requested index for start of resources to be provided in response (optional)
     * @param limit Requested number of resources to be provided in response (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listSettlementAccountCall(String fields, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/settlementAccount";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listSettlementAccountValidateBeforeCall(String fields, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listSettlementAccountCall(fields, offset, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List or find SettlementAccount objects
     * This operation list or find SettlementAccount entities
     * @param fields Comma-separated properties to be provided in response (optional)
     * @param offset Requested index for start of resources to be provided in response (optional)
     * @param limit Requested number of resources to be provided in response (optional)
     * @return List&lt;SettlementAccount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<SettlementAccount> listSettlementAccount(String fields, Integer offset, Integer limit) throws ApiException {
        ApiResponse<List<SettlementAccount>> resp = listSettlementAccountWithHttpInfo(fields, offset, limit);
        return resp.getData();
    }

    /**
     * List or find SettlementAccount objects
     * This operation list or find SettlementAccount entities
     * @param fields Comma-separated properties to be provided in response (optional)
     * @param offset Requested index for start of resources to be provided in response (optional)
     * @param limit Requested number of resources to be provided in response (optional)
     * @return ApiResponse&lt;List&lt;SettlementAccount&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<SettlementAccount>> listSettlementAccountWithHttpInfo(String fields, Integer offset, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = listSettlementAccountValidateBeforeCall(fields, offset, limit, null, null);
        Type localVarReturnType = new TypeToken<List<SettlementAccount>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List or find SettlementAccount objects (asynchronously)
     * This operation list or find SettlementAccount entities
     * @param fields Comma-separated properties to be provided in response (optional)
     * @param offset Requested index for start of resources to be provided in response (optional)
     * @param limit Requested number of resources to be provided in response (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listSettlementAccountAsync(String fields, Integer offset, Integer limit, final ApiCallback<List<SettlementAccount>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listSettlementAccountValidateBeforeCall(fields, offset, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<SettlementAccount>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for patchSettlementAccount
     * @param id Identifier of the SettlementAccount (required)
     * @param settlementAccount The SettlementAccount to be updated (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call patchSettlementAccountCall(String id, SettlementAccountUpdate settlementAccount, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = settlementAccount;

        // create path and map variables
        String localVarPath = "/settlementAccount/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call patchSettlementAccountValidateBeforeCall(String id, SettlementAccountUpdate settlementAccount, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling patchSettlementAccount(Async)");
        }
        
        // verify the required parameter 'settlementAccount' is set
        if (settlementAccount == null) {
            throw new ApiException("Missing the required parameter 'settlementAccount' when calling patchSettlementAccount(Async)");
        }
        

        com.squareup.okhttp.Call call = patchSettlementAccountCall(id, settlementAccount, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates partially a SettlementAccount
     * This operation updates partially a SettlementAccount entity.
     * @param id Identifier of the SettlementAccount (required)
     * @param settlementAccount The SettlementAccount to be updated (required)
     * @return SettlementAccount
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SettlementAccount patchSettlementAccount(String id, SettlementAccountUpdate settlementAccount) throws ApiException {
        ApiResponse<SettlementAccount> resp = patchSettlementAccountWithHttpInfo(id, settlementAccount);
        return resp.getData();
    }

    /**
     * Updates partially a SettlementAccount
     * This operation updates partially a SettlementAccount entity.
     * @param id Identifier of the SettlementAccount (required)
     * @param settlementAccount The SettlementAccount to be updated (required)
     * @return ApiResponse&lt;SettlementAccount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SettlementAccount> patchSettlementAccountWithHttpInfo(String id, SettlementAccountUpdate settlementAccount) throws ApiException {
        com.squareup.okhttp.Call call = patchSettlementAccountValidateBeforeCall(id, settlementAccount, null, null);
        Type localVarReturnType = new TypeToken<SettlementAccount>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates partially a SettlementAccount (asynchronously)
     * This operation updates partially a SettlementAccount entity.
     * @param id Identifier of the SettlementAccount (required)
     * @param settlementAccount The SettlementAccount to be updated (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call patchSettlementAccountAsync(String id, SettlementAccountUpdate settlementAccount, final ApiCallback<SettlementAccount> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = patchSettlementAccountValidateBeforeCall(id, settlementAccount, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SettlementAccount>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for retrieveSettlementAccount
     * @param id Identifier of the SettlementAccount (required)
     * @param fields Comma-separated properties to provide in response (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retrieveSettlementAccountCall(String id, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/settlementAccount/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call retrieveSettlementAccountValidateBeforeCall(String id, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling retrieveSettlementAccount(Async)");
        }
        

        com.squareup.okhttp.Call call = retrieveSettlementAccountCall(id, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves a SettlementAccount by ID
     * This operation retrieves a SettlementAccount entity. Attribute selection is enabled for all first level attributes.
     * @param id Identifier of the SettlementAccount (required)
     * @param fields Comma-separated properties to provide in response (optional)
     * @return SettlementAccount
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SettlementAccount retrieveSettlementAccount(String id, String fields) throws ApiException {
        ApiResponse<SettlementAccount> resp = retrieveSettlementAccountWithHttpInfo(id, fields);
        return resp.getData();
    }

    /**
     * Retrieves a SettlementAccount by ID
     * This operation retrieves a SettlementAccount entity. Attribute selection is enabled for all first level attributes.
     * @param id Identifier of the SettlementAccount (required)
     * @param fields Comma-separated properties to provide in response (optional)
     * @return ApiResponse&lt;SettlementAccount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SettlementAccount> retrieveSettlementAccountWithHttpInfo(String id, String fields) throws ApiException {
        com.squareup.okhttp.Call call = retrieveSettlementAccountValidateBeforeCall(id, fields, null, null);
        Type localVarReturnType = new TypeToken<SettlementAccount>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves a SettlementAccount by ID (asynchronously)
     * This operation retrieves a SettlementAccount entity. Attribute selection is enabled for all first level attributes.
     * @param id Identifier of the SettlementAccount (required)
     * @param fields Comma-separated properties to provide in response (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveSettlementAccountAsync(String id, String fields, final ApiCallback<SettlementAccount> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = retrieveSettlementAccountValidateBeforeCall(id, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SettlementAccount>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
