/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Properties for the task that uploads an OCI driver.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType", defaultImpl = UploadOCIDriverTaskProperties.class)
@JsonTypeName("Service.Upload.OCI")
public class UploadOCIDriverTaskProperties extends ProjectTaskProperties {
    /**
     * The input property.
     */
    @JsonProperty(value = "input")
    private UploadOCIDriverTaskInput input;

    /**
     * Task output. This is ignored if submitted.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private List<UploadOCIDriverTaskOutput> output;

    /**
     * Get the input value.
     *
     * @return the input value
     */
    public UploadOCIDriverTaskInput input() {
        return this.input;
    }

    /**
     * Set the input value.
     *
     * @param input the input value to set
     * @return the UploadOCIDriverTaskProperties object itself.
     */
    public UploadOCIDriverTaskProperties withInput(UploadOCIDriverTaskInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get task output. This is ignored if submitted.
     *
     * @return the output value
     */
    public List<UploadOCIDriverTaskOutput> output() {
        return this.output;
    }

}