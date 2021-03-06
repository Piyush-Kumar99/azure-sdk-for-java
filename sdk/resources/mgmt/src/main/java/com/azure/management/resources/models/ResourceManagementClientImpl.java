// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources.models;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;
import com.azure.management.AzureServiceClient;

/** Initializes a new instance of the ResourceManagementClientImpl type. */
public final class ResourceManagementClientImpl extends AzureServiceClient {
    /** The ID of the target subscription. */
    private String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The ID of the target subscription.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself.
     */
    public ResourceManagementClientImpl setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** server parameter. */
    private String host;

    /**
     * Gets server parameter.
     *
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Sets server parameter.
     *
     * @param host the host value.
     * @return the service client itself.
     */
    public ResourceManagementClientImpl setHost(String host) {
        this.host = host;
        return this;
    }

    /** Api Version. */
    private String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * Sets Api Version.
     *
     * @param apiVersion the apiVersion value.
     * @return the service client itself.
     */
    public ResourceManagementClientImpl setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The OperationsInner object to access its operations. */
    private final OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     *
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /** The DeploymentsInner object to access its operations. */
    private final DeploymentsInner deployments;

    /**
     * Gets the DeploymentsInner object to access its operations.
     *
     * @return the DeploymentsInner object.
     */
    public DeploymentsInner deployments() {
        return this.deployments;
    }

    /** The ProvidersInner object to access its operations. */
    private final ProvidersInner providers;

    /**
     * Gets the ProvidersInner object to access its operations.
     *
     * @return the ProvidersInner object.
     */
    public ProvidersInner providers() {
        return this.providers;
    }

    /** The ResourcesInner object to access its operations. */
    private final ResourcesInner resources;

    /**
     * Gets the ResourcesInner object to access its operations.
     *
     * @return the ResourcesInner object.
     */
    public ResourcesInner resources() {
        return this.resources;
    }

    /** The ResourceGroupsInner object to access its operations. */
    private final ResourceGroupsInner resourceGroups;

    /**
     * Gets the ResourceGroupsInner object to access its operations.
     *
     * @return the ResourceGroupsInner object.
     */
    public ResourceGroupsInner resourceGroups() {
        return this.resourceGroups;
    }

    /** The TagsInner object to access its operations. */
    private final TagsInner tags;

    /**
     * Gets the TagsInner object to access its operations.
     *
     * @return the TagsInner object.
     */
    public TagsInner tags() {
        return this.tags;
    }

    /** The DeploymentOperationsInner object to access its operations. */
    private final DeploymentOperationsInner deploymentOperations;

    /**
     * Gets the DeploymentOperationsInner object to access its operations.
     *
     * @return the DeploymentOperationsInner object.
     */
    public DeploymentOperationsInner deploymentOperations() {
        return this.deploymentOperations;
    }

    /** Initializes an instance of ResourceManagementClient client. */
    public ResourceManagementClientImpl() {
        this(
            new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build(),
            AzureEnvironment.AZURE);
    }

    /**
     * Initializes an instance of ResourceManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public ResourceManagementClientImpl(HttpPipeline httpPipeline) {
        this(httpPipeline, AzureEnvironment.AZURE);
    }

    /**
     * Initializes an instance of ResourceManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param environment The Azure environment.
     */
    public ResourceManagementClientImpl(HttpPipeline httpPipeline, AzureEnvironment environment) {
        super(httpPipeline, environment);
        this.httpPipeline = httpPipeline;
        this.operations = new OperationsInner(this);
        this.deployments = new DeploymentsInner(this);
        this.providers = new ProvidersInner(this);
        this.resources = new ResourcesInner(this);
        this.resourceGroups = new ResourceGroupsInner(this);
        this.tags = new TagsInner(this);
        this.deploymentOperations = new DeploymentOperationsInner(this);
    }
}
