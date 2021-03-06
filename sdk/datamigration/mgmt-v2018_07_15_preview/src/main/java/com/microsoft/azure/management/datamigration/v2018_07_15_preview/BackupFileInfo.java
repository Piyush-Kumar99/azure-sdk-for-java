/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information of the backup file.
 */
public class BackupFileInfo {
    /**
     * Location of the backup file in shared folder.
     */
    @JsonProperty(value = "fileLocation")
    private String fileLocation;

    /**
     * Sequence number of the backup file in the backup set.
     */
    @JsonProperty(value = "familySequenceNumber")
    private Integer familySequenceNumber;

    /**
     * Status of the backup file during migration. Possible values include:
     * 'Arrived', 'Queued', 'Uploading', 'Uploaded', 'Restoring', 'Restored',
     * 'Cancelled'.
     */
    @JsonProperty(value = "status")
    private BackupFileStatus status;

    /**
     * Get location of the backup file in shared folder.
     *
     * @return the fileLocation value
     */
    public String fileLocation() {
        return this.fileLocation;
    }

    /**
     * Set location of the backup file in shared folder.
     *
     * @param fileLocation the fileLocation value to set
     * @return the BackupFileInfo object itself.
     */
    public BackupFileInfo withFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
        return this;
    }

    /**
     * Get sequence number of the backup file in the backup set.
     *
     * @return the familySequenceNumber value
     */
    public Integer familySequenceNumber() {
        return this.familySequenceNumber;
    }

    /**
     * Set sequence number of the backup file in the backup set.
     *
     * @param familySequenceNumber the familySequenceNumber value to set
     * @return the BackupFileInfo object itself.
     */
    public BackupFileInfo withFamilySequenceNumber(Integer familySequenceNumber) {
        this.familySequenceNumber = familySequenceNumber;
        return this;
    }

    /**
     * Get status of the backup file during migration. Possible values include: 'Arrived', 'Queued', 'Uploading', 'Uploaded', 'Restoring', 'Restored', 'Cancelled'.
     *
     * @return the status value
     */
    public BackupFileStatus status() {
        return this.status;
    }

    /**
     * Set status of the backup file during migration. Possible values include: 'Arrived', 'Queued', 'Uploading', 'Uploaded', 'Restoring', 'Restored', 'Cancelled'.
     *
     * @param status the status value to set
     * @return the BackupFileInfo object itself.
     */
    public BackupFileInfo withStatus(BackupFileStatus status) {
        this.status = status;
        return this;
    }

}
