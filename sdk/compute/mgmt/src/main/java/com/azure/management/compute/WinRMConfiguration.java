// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The WinRMConfiguration model.
 */
@Fluent
public final class WinRMConfiguration {
    /*
     * The list of Windows Remote Management listeners
     */
    @JsonProperty(value = "listeners")
    private List<WinRMListener> listeners;

    /**
     * Get the listeners property: The list of Windows Remote Management
     * listeners.
     * 
     * @return the listeners value.
     */
    public List<WinRMListener> listeners() {
        return this.listeners;
    }

    /**
     * Set the listeners property: The list of Windows Remote Management
     * listeners.
     * 
     * @param listeners the listeners value to set.
     * @return the WinRMConfiguration object itself.
     */
    public WinRMConfiguration withListeners(List<WinRMListener> listeners) {
        this.listeners = listeners;
        return this;
    }
}
