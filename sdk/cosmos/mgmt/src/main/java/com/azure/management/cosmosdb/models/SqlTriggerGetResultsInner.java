// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.management.cosmosdb.ARMResourceProperties;
import com.azure.management.cosmosdb.SqlTriggerGetPropertiesResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SqlTriggerGetResults model. */
@JsonFlatten
@Fluent
public class SqlTriggerGetResultsInner extends ARMResourceProperties {
    /*
     * The resource property.
     */
    @JsonProperty(value = "properties.resource")
    private SqlTriggerGetPropertiesResource resource;

    /**
     * Get the resource property: The resource property.
     *
     * @return the resource value.
     */
    public SqlTriggerGetPropertiesResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The resource property.
     *
     * @param resource the resource value to set.
     * @return the SqlTriggerGetResultsInner object itself.
     */
    public SqlTriggerGetResultsInner withResource(SqlTriggerGetPropertiesResource resource) {
        this.resource = resource;
        return this;
    }
}
