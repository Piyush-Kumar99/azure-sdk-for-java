/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2015_10_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response body for a RegenerateKey API.
 */
public class RegenerateKeyOutputInner {
    /**
     * The new value of either the primary or secondary key.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * Get the new value of either the primary or secondary key.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the new value of either the primary or secondary key.
     *
     * @param key the key value to set
     * @return the RegenerateKeyOutputInner object itself.
     */
    public RegenerateKeyOutputInner withKey(String key) {
        this.key = key;
        return this;
    }

}
