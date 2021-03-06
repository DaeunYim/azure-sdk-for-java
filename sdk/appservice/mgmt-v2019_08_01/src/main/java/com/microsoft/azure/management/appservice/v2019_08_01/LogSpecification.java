/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Log Definition of a single resource metric.
 */
public class LogSpecification {
    /**
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The displayName property.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The blobDuration property.
     */
    @JsonProperty(value = "blobDuration")
    private String blobDuration;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the LogSpecification object itself.
     */
    public LogSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the LogSpecification object itself.
     */
    public LogSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the blobDuration value.
     *
     * @return the blobDuration value
     */
    public String blobDuration() {
        return this.blobDuration;
    }

    /**
     * Set the blobDuration value.
     *
     * @param blobDuration the blobDuration value to set
     * @return the LogSpecification object itself.
     */
    public LogSpecification withBlobDuration(String blobDuration) {
        this.blobDuration = blobDuration;
        return this;
    }

}
