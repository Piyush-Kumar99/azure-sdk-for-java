// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The Domain model. */
@Fluent
public final class DomainInner {
    /*
     * the type of the authentication into the domain.
     */
    @JsonProperty(value = "authenticationType", access = JsonProperty.Access.WRITE_ONLY)
    private String authenticationType;

    /*
     * if this is the default domain in the tenant.
     */
    @JsonProperty(value = "isDefault", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDefault;

    /*
     * if this domain's ownership is verified.
     */
    @JsonProperty(value = "isVerified", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isVerified;

    /*
     * the domain name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Active Directory Domain information.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Get the authenticationType property: the type of the authentication into the domain.
     *
     * @return the authenticationType value.
     */
    public String authenticationType() {
        return this.authenticationType;
    }

    /**
     * Get the isDefault property: if this is the default domain in the tenant.
     *
     * @return the isDefault value.
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Get the isVerified property: if this domain's ownership is verified.
     *
     * @return the isVerified value.
     */
    public Boolean isVerified() {
        return this.isVerified;
    }

    /**
     * Get the name property: the domain name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: the domain name.
     *
     * @param name the name value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the additionalProperties property: Active Directory Domain information.
     *
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Active Directory Domain information.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }
}
