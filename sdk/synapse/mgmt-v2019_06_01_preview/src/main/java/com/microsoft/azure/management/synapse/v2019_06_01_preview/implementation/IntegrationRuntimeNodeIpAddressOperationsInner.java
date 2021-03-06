/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in IntegrationRuntimeNodeIpAddressOperations.
 */
public class IntegrationRuntimeNodeIpAddressOperationsInner {
    /** The Retrofit service to perform REST calls. */
    private IntegrationRuntimeNodeIpAddressOperationsService service;
    /** The service client containing this operation class. */
    private SynapseManagementClientImpl client;

    /**
     * Initializes an instance of IntegrationRuntimeNodeIpAddressOperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public IntegrationRuntimeNodeIpAddressOperationsInner(Retrofit retrofit, SynapseManagementClientImpl client) {
        this.service = retrofit.create(IntegrationRuntimeNodeIpAddressOperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for IntegrationRuntimeNodeIpAddressOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface IntegrationRuntimeNodeIpAddressOperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.IntegrationRuntimeNodeIpAddressOperations get" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/integrationRuntimes/{integrationRuntimeName}/nodes/{nodeName}/ipAddress")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("integrationRuntimeName") String integrationRuntimeName, @Path("nodeName") String nodeName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get integration runtime node IP address.
     * Get the IP address of an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @param nodeName Integration runtime node name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the IntegrationRuntimeNodeIpAddressInner object if successful.
     */
    public IntegrationRuntimeNodeIpAddressInner get(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName, nodeName).toBlocking().single().body();
    }

    /**
     * Get integration runtime node IP address.
     * Get the IP address of an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @param nodeName Integration runtime node name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<IntegrationRuntimeNodeIpAddressInner> getAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName, final ServiceCallback<IntegrationRuntimeNodeIpAddressInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName, nodeName), serviceCallback);
    }

    /**
     * Get integration runtime node IP address.
     * Get the IP address of an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @param nodeName Integration runtime node name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IntegrationRuntimeNodeIpAddressInner object
     */
    public Observable<IntegrationRuntimeNodeIpAddressInner> getAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName, nodeName).map(new Func1<ServiceResponse<IntegrationRuntimeNodeIpAddressInner>, IntegrationRuntimeNodeIpAddressInner>() {
            @Override
            public IntegrationRuntimeNodeIpAddressInner call(ServiceResponse<IntegrationRuntimeNodeIpAddressInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get integration runtime node IP address.
     * Get the IP address of an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @param nodeName Integration runtime node name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the IntegrationRuntimeNodeIpAddressInner object
     */
    public Observable<ServiceResponse<IntegrationRuntimeNodeIpAddressInner>> getWithServiceResponseAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (integrationRuntimeName == null) {
            throw new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null.");
        }
        if (nodeName == null) {
            throw new IllegalArgumentException("Parameter nodeName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, workspaceName, integrationRuntimeName, nodeName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<IntegrationRuntimeNodeIpAddressInner>>>() {
                @Override
                public Observable<ServiceResponse<IntegrationRuntimeNodeIpAddressInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<IntegrationRuntimeNodeIpAddressInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<IntegrationRuntimeNodeIpAddressInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<IntegrationRuntimeNodeIpAddressInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<IntegrationRuntimeNodeIpAddressInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
