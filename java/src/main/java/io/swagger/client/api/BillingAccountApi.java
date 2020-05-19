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


import io.swagger.client.model.BillingAccount;
import io.swagger.client.model.BillingAccountCreate;
import io.swagger.client.model.BillingAccountUpdate;
import io.swagger.client.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BillingAccountApi {
    private ApiClient apiClient;

    public BillingAccountApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BillingAccountApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createBillingAccount
     * @param billingAccount The BillingAccount to be created (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createBillingAccountCall(BillingAccountCreate billingAccount, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = billingAccount;

        // create path and map variables
        String localVarPath = "/billingAccount";

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
    private com.squareup.okhttp.Call createBillingAccountValidateBeforeCall(BillingAccountCreate billingAccount, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'billingAccount' is set
        if (billingAccount == null) {
            throw new ApiException("Missing the required parameter 'billingAccount' when calling createBillingAccount(Async)");
        }
        

        com.squareup.okhttp.Call call = createBillingAccountCall(billingAccount, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates a BillingAccount
     * This operation creates a BillingAccount entity.
     * @param billingAccount The BillingAccount to be created (required)
     * @return BillingAccount
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BillingAccount createBillingAccount(BillingAccountCreate billingAccount) throws ApiException {
        ApiResponse<BillingAccount> resp = createBillingAccountWithHttpInfo(billingAccount);
        return resp.getData();
    }

    /**
     * Creates a BillingAccount
     * This operation creates a BillingAccount entity.
     * @param billingAccount The BillingAccount to be created (required)
     * @return ApiResponse&lt;BillingAccount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BillingAccount> createBillingAccountWithHttpInfo(BillingAccountCreate billingAccount) throws ApiException {
        com.squareup.okhttp.Call call = createBillingAccountValidateBeforeCall(billingAccount, null, null);
        Type localVarReturnType = new TypeToken<BillingAccount>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates a BillingAccount (asynchronously)
     * This operation creates a BillingAccount entity.
     * @param billingAccount The BillingAccount to be created (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createBillingAccountAsync(BillingAccountCreate billingAccount, final ApiCallback<BillingAccount> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createBillingAccountValidateBeforeCall(billingAccount, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BillingAccount>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteBillingAccount
     * @param id Identifier of the BillingAccount (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteBillingAccountCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/billingAccount/{id}"
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
    private com.squareup.okhttp.Call deleteBillingAccountValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteBillingAccount(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteBillingAccountCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deletes a BillingAccount
     * This operation deletes a BillingAccount entity.
     * @param id Identifier of the BillingAccount (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteBillingAccount(String id) throws ApiException {
        deleteBillingAccountWithHttpInfo(id);
    }

    /**
     * Deletes a BillingAccount
     * This operation deletes a BillingAccount entity.
     * @param id Identifier of the BillingAccount (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteBillingAccountWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteBillingAccountValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a BillingAccount (asynchronously)
     * This operation deletes a BillingAccount entity.
     * @param id Identifier of the BillingAccount (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteBillingAccountAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteBillingAccountValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for listBillingAccount
     * @param fields Comma-separated properties to be provided in response (optional)
     * @param offset Requested index for start of resources to be provided in response (optional)
     * @param limit Requested number of resources to be provided in response (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listBillingAccountCall(String fields, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/billingAccount";

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
    private com.squareup.okhttp.Call listBillingAccountValidateBeforeCall(String fields, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listBillingAccountCall(fields, offset, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List or find BillingAccount objects
     * This operation list or find BillingAccount entities
     * @param fields Comma-separated properties to be provided in response (optional)
     * @param offset Requested index for start of resources to be provided in response (optional)
     * @param limit Requested number of resources to be provided in response (optional)
     * @return List&lt;BillingAccount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<BillingAccount> listBillingAccount(String fields, Integer offset, Integer limit) throws ApiException {
        ApiResponse<List<BillingAccount>> resp = listBillingAccountWithHttpInfo(fields, offset, limit);
        return resp.getData();
    }

    /**
     * List or find BillingAccount objects
     * This operation list or find BillingAccount entities
     * @param fields Comma-separated properties to be provided in response (optional)
     * @param offset Requested index for start of resources to be provided in response (optional)
     * @param limit Requested number of resources to be provided in response (optional)
     * @return ApiResponse&lt;List&lt;BillingAccount&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<BillingAccount>> listBillingAccountWithHttpInfo(String fields, Integer offset, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = listBillingAccountValidateBeforeCall(fields, offset, limit, null, null);
        Type localVarReturnType = new TypeToken<List<BillingAccount>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List or find BillingAccount objects (asynchronously)
     * This operation list or find BillingAccount entities
     * @param fields Comma-separated properties to be provided in response (optional)
     * @param offset Requested index for start of resources to be provided in response (optional)
     * @param limit Requested number of resources to be provided in response (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listBillingAccountAsync(String fields, Integer offset, Integer limit, final ApiCallback<List<BillingAccount>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listBillingAccountValidateBeforeCall(fields, offset, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<BillingAccount>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for patchBillingAccount
     * @param id Identifier of the BillingAccount (required)
     * @param billingAccount The BillingAccount to be updated (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call patchBillingAccountCall(String id, BillingAccountUpdate billingAccount, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = billingAccount;

        // create path and map variables
        String localVarPath = "/billingAccount/{id}"
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
    private com.squareup.okhttp.Call patchBillingAccountValidateBeforeCall(String id, BillingAccountUpdate billingAccount, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling patchBillingAccount(Async)");
        }
        
        // verify the required parameter 'billingAccount' is set
        if (billingAccount == null) {
            throw new ApiException("Missing the required parameter 'billingAccount' when calling patchBillingAccount(Async)");
        }
        

        com.squareup.okhttp.Call call = patchBillingAccountCall(id, billingAccount, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates partially a BillingAccount
     * This operation updates partially a BillingAccount entity.
     * @param id Identifier of the BillingAccount (required)
     * @param billingAccount The BillingAccount to be updated (required)
     * @return BillingAccount
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BillingAccount patchBillingAccount(String id, BillingAccountUpdate billingAccount) throws ApiException {
        ApiResponse<BillingAccount> resp = patchBillingAccountWithHttpInfo(id, billingAccount);
        return resp.getData();
    }

    /**
     * Updates partially a BillingAccount
     * This operation updates partially a BillingAccount entity.
     * @param id Identifier of the BillingAccount (required)
     * @param billingAccount The BillingAccount to be updated (required)
     * @return ApiResponse&lt;BillingAccount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BillingAccount> patchBillingAccountWithHttpInfo(String id, BillingAccountUpdate billingAccount) throws ApiException {
        com.squareup.okhttp.Call call = patchBillingAccountValidateBeforeCall(id, billingAccount, null, null);
        Type localVarReturnType = new TypeToken<BillingAccount>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates partially a BillingAccount (asynchronously)
     * This operation updates partially a BillingAccount entity.
     * @param id Identifier of the BillingAccount (required)
     * @param billingAccount The BillingAccount to be updated (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call patchBillingAccountAsync(String id, BillingAccountUpdate billingAccount, final ApiCallback<BillingAccount> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = patchBillingAccountValidateBeforeCall(id, billingAccount, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BillingAccount>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for retrieveBillingAccount
     * @param id Identifier of the BillingAccount (required)
     * @param fields Comma-separated properties to provide in response (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retrieveBillingAccountCall(String id, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/billingAccount/{id}"
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
    private com.squareup.okhttp.Call retrieveBillingAccountValidateBeforeCall(String id, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling retrieveBillingAccount(Async)");
        }
        

        com.squareup.okhttp.Call call = retrieveBillingAccountCall(id, fields, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves a BillingAccount by ID
     * This operation retrieves a BillingAccount entity. Attribute selection is enabled for all first level attributes.
     * @param id Identifier of the BillingAccount (required)
     * @param fields Comma-separated properties to provide in response (optional)
     * @return BillingAccount
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BillingAccount retrieveBillingAccount(String id, String fields) throws ApiException {
        ApiResponse<BillingAccount> resp = retrieveBillingAccountWithHttpInfo(id, fields);
        return resp.getData();
    }

    /**
     * Retrieves a BillingAccount by ID
     * This operation retrieves a BillingAccount entity. Attribute selection is enabled for all first level attributes.
     * @param id Identifier of the BillingAccount (required)
     * @param fields Comma-separated properties to provide in response (optional)
     * @return ApiResponse&lt;BillingAccount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BillingAccount> retrieveBillingAccountWithHttpInfo(String id, String fields) throws ApiException {
        com.squareup.okhttp.Call call = retrieveBillingAccountValidateBeforeCall(id, fields, null, null);
        Type localVarReturnType = new TypeToken<BillingAccount>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves a BillingAccount by ID (asynchronously)
     * This operation retrieves a BillingAccount entity. Attribute selection is enabled for all first level attributes.
     * @param id Identifier of the BillingAccount (required)
     * @param fields Comma-separated properties to provide in response (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveBillingAccountAsync(String id, String fields, final ApiCallback<BillingAccount> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = retrieveBillingAccountValidateBeforeCall(id, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BillingAccount>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
