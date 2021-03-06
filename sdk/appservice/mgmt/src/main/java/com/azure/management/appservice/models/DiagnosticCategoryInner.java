// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.management.appservice.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DiagnosticCategory model. */
@JsonFlatten
@Immutable
public class DiagnosticCategoryInner extends ProxyOnlyResource {
    /*
     * Description of the diagnostic category
     */
    @JsonProperty(value = "properties.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Get the description property: Description of the diagnostic category.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }
}
