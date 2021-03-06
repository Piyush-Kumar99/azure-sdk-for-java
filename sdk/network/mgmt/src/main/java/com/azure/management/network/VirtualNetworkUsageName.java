// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VirtualNetworkUsageName model. */
@Immutable
public final class VirtualNetworkUsageName {
    /*
     * Localized subnet size and usage string.
     */
    @JsonProperty(value = "localizedValue", access = JsonProperty.Access.WRITE_ONLY)
    private String localizedValue;

    /*
     * Subnet size and usage string.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /**
     * Get the localizedValue property: Localized subnet size and usage string.
     *
     * @return the localizedValue value.
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Get the value property: Subnet size and usage string.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }
}
