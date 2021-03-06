/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.implementation.ProtectionPolicyInner;

/**
 * Mab container-specific backup policy.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "backupManagementType")
@JsonTypeName("MAB")
public class MabProtectionPolicy extends ProtectionPolicyInner {
    /**
     * Backup schedule of backup policy.
     */
    @JsonProperty(value = "schedulePolicy")
    private SchedulePolicy schedulePolicy;

    /**
     * Retention policy details.
     */
    @JsonProperty(value = "retentionPolicy")
    private RetentionPolicy retentionPolicy;

    /**
     * Get backup schedule of backup policy.
     *
     * @return the schedulePolicy value
     */
    public SchedulePolicy schedulePolicy() {
        return this.schedulePolicy;
    }

    /**
     * Set backup schedule of backup policy.
     *
     * @param schedulePolicy the schedulePolicy value to set
     * @return the MabProtectionPolicy object itself.
     */
    public MabProtectionPolicy withSchedulePolicy(SchedulePolicy schedulePolicy) {
        this.schedulePolicy = schedulePolicy;
        return this;
    }

    /**
     * Get retention policy details.
     *
     * @return the retentionPolicy value
     */
    public RetentionPolicy retentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set retention policy details.
     *
     * @param retentionPolicy the retentionPolicy value to set
     * @return the MabProtectionPolicy object itself.
     */
    public MabProtectionPolicy withRetentionPolicy(RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

}
