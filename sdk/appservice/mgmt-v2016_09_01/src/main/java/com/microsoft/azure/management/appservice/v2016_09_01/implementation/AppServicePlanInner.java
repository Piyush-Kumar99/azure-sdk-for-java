/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01.implementation;

import com.microsoft.azure.management.appservice.v2016_09_01.StatusOptions;
import com.microsoft.azure.management.appservice.v2016_09_01.HostingEnvironmentProfile;
import org.joda.time.DateTime;
import com.microsoft.azure.management.appservice.v2016_09_01.ProvisioningState;
import com.microsoft.azure.management.appservice.v2016_09_01.SkuDescription;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * App Service plan.
 */
@JsonFlatten
public class AppServicePlanInner extends Resource {
    /**
     * Name for the App Service plan.
     */
    @JsonProperty(value = "properties.name", required = true)
    private String appServicePlanName;

    /**
     * Target worker tier assigned to the App Service plan.
     */
    @JsonProperty(value = "properties.workerTierName")
    private String workerTierName;

    /**
     * App Service plan status. Possible values include: 'Ready', 'Pending',
     * 'Creating'.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private StatusOptions status;

    /**
     * App Service plan subscription.
     */
    @JsonProperty(value = "properties.subscription", access = JsonProperty.Access.WRITE_ONLY)
    private String subscription;

    /**
     * App Service plan administration site.
     */
    @JsonProperty(value = "properties.adminSiteName")
    private String adminSiteName;

    /**
     * Specification for the App Service Environment to use for the App Service
     * plan.
     */
    @JsonProperty(value = "properties.hostingEnvironmentProfile")
    private HostingEnvironmentProfile hostingEnvironmentProfile;

    /**
     * Maximum number of instances that can be assigned to this App Service
     * plan.
     */
    @JsonProperty(value = "properties.maximumNumberOfWorkers", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maximumNumberOfWorkers;

    /**
     * Geographical location for the App Service plan.
     */
    @JsonProperty(value = "properties.geoRegion", access = JsonProperty.Access.WRITE_ONLY)
    private String geoRegion;

    /**
     * If &lt;code&gt;true&lt;/code&gt;, apps assigned to this App Service plan
     * can be scaled independently.
     * If &lt;code&gt;false&lt;/code&gt;, apps assigned to this App Service
     * plan will scale to all instances of the plan.
     */
    @JsonProperty(value = "properties.perSiteScaling")
    private Boolean perSiteScaling;

    /**
     * Number of apps assigned to this App Service plan.
     */
    @JsonProperty(value = "properties.numberOfSites", access = JsonProperty.Access.WRITE_ONLY)
    private Integer numberOfSites;

    /**
     * If &lt;code&gt;true&lt;/code&gt;, this App Service Plan owns spot
     * instances.
     */
    @JsonProperty(value = "properties.isSpot")
    private Boolean isSpot;

    /**
     * The time when the server farm expires. Valid only if it is a spot server
     * farm.
     */
    @JsonProperty(value = "properties.spotExpirationTime")
    private DateTime spotExpirationTime;

    /**
     * Resource group of the App Service plan.
     */
    @JsonProperty(value = "properties.resourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroup;

    /**
     * If Linux app service plan &lt;code&gt;true&lt;/code&gt;,
     * &lt;code&gt;false&lt;/code&gt; otherwise.
     */
    @JsonProperty(value = "properties.reserved")
    private Boolean reserved;

    /**
     * Scaling worker count.
     */
    @JsonProperty(value = "properties.targetWorkerCount")
    private Integer targetWorkerCount;

    /**
     * Scaling worker size ID.
     */
    @JsonProperty(value = "properties.targetWorkerSizeId")
    private Integer targetWorkerSizeId;

    /**
     * Provisioning state of the App Service Environment. Possible values
     * include: 'Succeeded', 'Failed', 'Canceled', 'InProgress', 'Deleting'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The sku property.
     */
    @JsonProperty(value = "sku")
    private SkuDescription sku;

    /**
     * Kind of resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Get name for the App Service plan.
     *
     * @return the appServicePlanName value
     */
    public String appServicePlanName() {
        return this.appServicePlanName;
    }

    /**
     * Set name for the App Service plan.
     *
     * @param appServicePlanName the appServicePlanName value to set
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withAppServicePlanName(String appServicePlanName) {
        this.appServicePlanName = appServicePlanName;
        return this;
    }

    /**
     * Get target worker tier assigned to the App Service plan.
     *
     * @return the workerTierName value
     */
    public String workerTierName() {
        return this.workerTierName;
    }

    /**
     * Set target worker tier assigned to the App Service plan.
     *
     * @param workerTierName the workerTierName value to set
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withWorkerTierName(String workerTierName) {
        this.workerTierName = workerTierName;
        return this;
    }

    /**
     * Get app Service plan status. Possible values include: 'Ready', 'Pending', 'Creating'.
     *
     * @return the status value
     */
    public StatusOptions status() {
        return this.status;
    }

    /**
     * Get app Service plan subscription.
     *
     * @return the subscription value
     */
    public String subscription() {
        return this.subscription;
    }

    /**
     * Get app Service plan administration site.
     *
     * @return the adminSiteName value
     */
    public String adminSiteName() {
        return this.adminSiteName;
    }

    /**
     * Set app Service plan administration site.
     *
     * @param adminSiteName the adminSiteName value to set
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withAdminSiteName(String adminSiteName) {
        this.adminSiteName = adminSiteName;
        return this;
    }

    /**
     * Get specification for the App Service Environment to use for the App Service plan.
     *
     * @return the hostingEnvironmentProfile value
     */
    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile;
    }

    /**
     * Set specification for the App Service Environment to use for the App Service plan.
     *
     * @param hostingEnvironmentProfile the hostingEnvironmentProfile value to set
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile) {
        this.hostingEnvironmentProfile = hostingEnvironmentProfile;
        return this;
    }

    /**
     * Get maximum number of instances that can be assigned to this App Service plan.
     *
     * @return the maximumNumberOfWorkers value
     */
    public Integer maximumNumberOfWorkers() {
        return this.maximumNumberOfWorkers;
    }

    /**
     * Get geographical location for the App Service plan.
     *
     * @return the geoRegion value
     */
    public String geoRegion() {
        return this.geoRegion;
    }

    /**
     * Get if &lt;code&gt;true&lt;/code&gt;, apps assigned to this App Service plan can be scaled independently.
     If &lt;code&gt;false&lt;/code&gt;, apps assigned to this App Service plan will scale to all instances of the plan.
     *
     * @return the perSiteScaling value
     */
    public Boolean perSiteScaling() {
        return this.perSiteScaling;
    }

    /**
     * Set if &lt;code&gt;true&lt;/code&gt;, apps assigned to this App Service plan can be scaled independently.
     If &lt;code&gt;false&lt;/code&gt;, apps assigned to this App Service plan will scale to all instances of the plan.
     *
     * @param perSiteScaling the perSiteScaling value to set
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withPerSiteScaling(Boolean perSiteScaling) {
        this.perSiteScaling = perSiteScaling;
        return this;
    }

    /**
     * Get number of apps assigned to this App Service plan.
     *
     * @return the numberOfSites value
     */
    public Integer numberOfSites() {
        return this.numberOfSites;
    }

    /**
     * Get if &lt;code&gt;true&lt;/code&gt;, this App Service Plan owns spot instances.
     *
     * @return the isSpot value
     */
    public Boolean isSpot() {
        return this.isSpot;
    }

    /**
     * Set if &lt;code&gt;true&lt;/code&gt;, this App Service Plan owns spot instances.
     *
     * @param isSpot the isSpot value to set
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withIsSpot(Boolean isSpot) {
        this.isSpot = isSpot;
        return this;
    }

    /**
     * Get the time when the server farm expires. Valid only if it is a spot server farm.
     *
     * @return the spotExpirationTime value
     */
    public DateTime spotExpirationTime() {
        return this.spotExpirationTime;
    }

    /**
     * Set the time when the server farm expires. Valid only if it is a spot server farm.
     *
     * @param spotExpirationTime the spotExpirationTime value to set
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withSpotExpirationTime(DateTime spotExpirationTime) {
        this.spotExpirationTime = spotExpirationTime;
        return this;
    }

    /**
     * Get resource group of the App Service plan.
     *
     * @return the resourceGroup value
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Get if Linux app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
     *
     * @return the reserved value
     */
    public Boolean reserved() {
        return this.reserved;
    }

    /**
     * Set if Linux app service plan &lt;code&gt;true&lt;/code&gt;, &lt;code&gt;false&lt;/code&gt; otherwise.
     *
     * @param reserved the reserved value to set
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withReserved(Boolean reserved) {
        this.reserved = reserved;
        return this;
    }

    /**
     * Get scaling worker count.
     *
     * @return the targetWorkerCount value
     */
    public Integer targetWorkerCount() {
        return this.targetWorkerCount;
    }

    /**
     * Set scaling worker count.
     *
     * @param targetWorkerCount the targetWorkerCount value to set
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withTargetWorkerCount(Integer targetWorkerCount) {
        this.targetWorkerCount = targetWorkerCount;
        return this;
    }

    /**
     * Get scaling worker size ID.
     *
     * @return the targetWorkerSizeId value
     */
    public Integer targetWorkerSizeId() {
        return this.targetWorkerSizeId;
    }

    /**
     * Set scaling worker size ID.
     *
     * @param targetWorkerSizeId the targetWorkerSizeId value to set
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withTargetWorkerSizeId(Integer targetWorkerSizeId) {
        this.targetWorkerSizeId = targetWorkerSizeId;
        return this;
    }

    /**
     * Get provisioning state of the App Service Environment. Possible values include: 'Succeeded', 'Failed', 'Canceled', 'InProgress', 'Deleting'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public SkuDescription sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withSku(SkuDescription sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get kind of resource.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set kind of resource.
     *
     * @param kind the kind value to set
     * @return the AppServicePlanInner object itself.
     */
    public AppServicePlanInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

}
