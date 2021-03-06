// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ManagedClusterAgentPoolProfile model. */
@Fluent
public final class ManagedClusterAgentPoolProfile extends ManagedClusterAgentPoolProfileProperties {
    /*
     * Unique name of the agent pool profile in the context of the subscription
     * and resource group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the name property: Unique name of the agent pool profile in the context of the subscription and resource
     * group.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Unique name of the agent pool profile in the context of the subscription and resource
     * group.
     *
     * @param name the name value to set.
     * @return the ManagedClusterAgentPoolProfile object itself.
     */
    public ManagedClusterAgentPoolProfile withName(String name) {
        this.name = name;
        return this;
    }
}
