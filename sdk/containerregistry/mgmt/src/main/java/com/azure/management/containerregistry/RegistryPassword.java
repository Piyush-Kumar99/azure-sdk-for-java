// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RegistryPassword model. */
@Fluent
public final class RegistryPassword {
    /*
     * The password name.
     */
    @JsonProperty(value = "name")
    private PasswordName name;

    /*
     * The password value.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the name property: The password name.
     *
     * @return the name value.
     */
    public PasswordName name() {
        return this.name;
    }

    /**
     * Set the name property: The password name.
     *
     * @param name the name value to set.
     * @return the RegistryPassword object itself.
     */
    public RegistryPassword withName(PasswordName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The password value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The password value.
     *
     * @param value the value value to set.
     * @return the RegistryPassword object itself.
     */
    public RegistryPassword withValue(String value) {
        this.value = value;
        return this;
    }
}
