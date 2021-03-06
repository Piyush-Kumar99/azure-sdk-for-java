// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The OAuth2Permission model. */
@Fluent
public final class OAuth2Permission {
    /*
     * Permission help text that appears in the admin consent and app
     * assignment experiences.
     */
    @JsonProperty(value = "adminConsentDescription")
    private String adminConsentDescription;

    /*
     * Display name for the permission that appears in the admin consent and
     * app assignment experiences.
     */
    @JsonProperty(value = "adminConsentDisplayName")
    private String adminConsentDisplayName;

    /*
     * Unique scope permission identifier inside the oauth2Permissions
     * collection.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * When creating or updating a permission, this property must be set to
     * true (which is the default). To delete a permission, this property must
     * first be set to false. At that point, in a subsequent call, the
     * permission may be removed.
     */
    @JsonProperty(value = "isEnabled")
    private Boolean isEnabled;

    /*
     * Specifies whether this scope permission can be consented to by an end
     * user, or whether it is a tenant-wide permission that must be consented
     * to by a Company Administrator. Possible values are "User" or "Admin".
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Permission help text that appears in the end user consent experience.
     */
    @JsonProperty(value = "userConsentDescription")
    private String userConsentDescription;

    /*
     * Display name for the permission that appears in the end user consent
     * experience.
     */
    @JsonProperty(value = "userConsentDisplayName")
    private String userConsentDisplayName;

    /*
     * The value of the scope claim that the resource application should expect
     * in the OAuth 2.0 access token.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the adminConsentDescription property: Permission help text that appears in the admin consent and app
     * assignment experiences.
     *
     * @return the adminConsentDescription value.
     */
    public String adminConsentDescription() {
        return this.adminConsentDescription;
    }

    /**
     * Set the adminConsentDescription property: Permission help text that appears in the admin consent and app
     * assignment experiences.
     *
     * @param adminConsentDescription the adminConsentDescription value to set.
     * @return the OAuth2Permission object itself.
     */
    public OAuth2Permission withAdminConsentDescription(String adminConsentDescription) {
        this.adminConsentDescription = adminConsentDescription;
        return this;
    }

    /**
     * Get the adminConsentDisplayName property: Display name for the permission that appears in the admin consent and
     * app assignment experiences.
     *
     * @return the adminConsentDisplayName value.
     */
    public String adminConsentDisplayName() {
        return this.adminConsentDisplayName;
    }

    /**
     * Set the adminConsentDisplayName property: Display name for the permission that appears in the admin consent and
     * app assignment experiences.
     *
     * @param adminConsentDisplayName the adminConsentDisplayName value to set.
     * @return the OAuth2Permission object itself.
     */
    public OAuth2Permission withAdminConsentDisplayName(String adminConsentDisplayName) {
        this.adminConsentDisplayName = adminConsentDisplayName;
        return this;
    }

    /**
     * Get the id property: Unique scope permission identifier inside the oauth2Permissions collection.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Unique scope permission identifier inside the oauth2Permissions collection.
     *
     * @param id the id value to set.
     * @return the OAuth2Permission object itself.
     */
    public OAuth2Permission withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the isEnabled property: When creating or updating a permission, this property must be set to true (which is
     * the default). To delete a permission, this property must first be set to false. At that point, in a subsequent
     * call, the permission may be removed.
     *
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: When creating or updating a permission, this property must be set to true (which is
     * the default). To delete a permission, this property must first be set to false. At that point, in a subsequent
     * call, the permission may be removed.
     *
     * @param isEnabled the isEnabled value to set.
     * @return the OAuth2Permission object itself.
     */
    public OAuth2Permission withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get the type property: Specifies whether this scope permission can be consented to by an end user, or whether it
     * is a tenant-wide permission that must be consented to by a Company Administrator. Possible values are "User" or
     * "Admin".
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Specifies whether this scope permission can be consented to by an end user, or whether it
     * is a tenant-wide permission that must be consented to by a Company Administrator. Possible values are "User" or
     * "Admin".
     *
     * @param type the type value to set.
     * @return the OAuth2Permission object itself.
     */
    public OAuth2Permission withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userConsentDescription property: Permission help text that appears in the end user consent experience.
     *
     * @return the userConsentDescription value.
     */
    public String userConsentDescription() {
        return this.userConsentDescription;
    }

    /**
     * Set the userConsentDescription property: Permission help text that appears in the end user consent experience.
     *
     * @param userConsentDescription the userConsentDescription value to set.
     * @return the OAuth2Permission object itself.
     */
    public OAuth2Permission withUserConsentDescription(String userConsentDescription) {
        this.userConsentDescription = userConsentDescription;
        return this;
    }

    /**
     * Get the userConsentDisplayName property: Display name for the permission that appears in the end user consent
     * experience.
     *
     * @return the userConsentDisplayName value.
     */
    public String userConsentDisplayName() {
        return this.userConsentDisplayName;
    }

    /**
     * Set the userConsentDisplayName property: Display name for the permission that appears in the end user consent
     * experience.
     *
     * @param userConsentDisplayName the userConsentDisplayName value to set.
     * @return the OAuth2Permission object itself.
     */
    public OAuth2Permission withUserConsentDisplayName(String userConsentDisplayName) {
        this.userConsentDisplayName = userConsentDisplayName;
        return this;
    }

    /**
     * Get the value property: The value of the scope claim that the resource application should expect in the OAuth 2.0
     * access token.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value of the scope claim that the resource application should expect in the OAuth 2.0
     * access token.
     *
     * @param value the value value to set.
     * @return the OAuth2Permission object itself.
     */
    public OAuth2Permission withValue(String value) {
        this.value = value;
        return this;
    }
}
