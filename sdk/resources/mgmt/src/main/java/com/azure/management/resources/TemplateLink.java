// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TemplateLink model. */
@Fluent
public final class TemplateLink {
    /*
     * The URI of the template to deploy.
     */
    @JsonProperty(value = "uri", required = true)
    private String uri;

    /*
     * If included, must match the ContentVersion in the template.
     */
    @JsonProperty(value = "contentVersion")
    private String contentVersion;

    /**
     * Get the uri property: The URI of the template to deploy.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: The URI of the template to deploy.
     *
     * @param uri the uri value to set.
     * @return the TemplateLink object itself.
     */
    public TemplateLink withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the contentVersion property: If included, must match the ContentVersion in the template.
     *
     * @return the contentVersion value.
     */
    public String contentVersion() {
        return this.contentVersion;
    }

    /**
     * Set the contentVersion property: If included, must match the ContentVersion in the template.
     *
     * @param contentVersion the contentVersion value to set.
     * @return the TemplateLink object itself.
     */
    public TemplateLink withContentVersion(String contentVersion) {
        this.contentVersion = contentVersion;
        return this;
    }
}
