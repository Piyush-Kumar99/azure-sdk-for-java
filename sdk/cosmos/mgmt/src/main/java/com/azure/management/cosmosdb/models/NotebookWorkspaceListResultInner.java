// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The NotebookWorkspaceListResult model. */
@Fluent
public final class NotebookWorkspaceListResultInner {
    /*
     * Array of notebook workspace resources
     */
    @JsonProperty(value = "value")
    private List<NotebookWorkspaceInner> value;

    /**
     * Get the value property: Array of notebook workspace resources.
     *
     * @return the value value.
     */
    public List<NotebookWorkspaceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of notebook workspace resources.
     *
     * @param value the value value to set.
     * @return the NotebookWorkspaceListResultInner object itself.
     */
    public NotebookWorkspaceListResultInner withValue(List<NotebookWorkspaceInner> value) {
        this.value = value;
        return this;
    }
}
