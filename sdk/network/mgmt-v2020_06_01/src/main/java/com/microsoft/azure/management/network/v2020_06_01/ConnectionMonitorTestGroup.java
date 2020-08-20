/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the connection monitor test group.
 */
public class ConnectionMonitorTestGroup {
    /**
     * The name of the connection monitor test group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Value indicating whether test group is disabled.
     */
    @JsonProperty(value = "disable")
    private Boolean disable;

    /**
     * List of test configuration names.
     */
    @JsonProperty(value = "testConfigurations", required = true)
    private List<String> testConfigurations;

    /**
     * List of source endpoint names.
     */
    @JsonProperty(value = "sources", required = true)
    private List<String> sources;

    /**
     * List of destination endpoint names.
     */
    @JsonProperty(value = "destinations", required = true)
    private List<String> destinations;

    /**
     * Get the name of the connection monitor test group.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the connection monitor test group.
     *
     * @param name the name value to set
     * @return the ConnectionMonitorTestGroup object itself.
     */
    public ConnectionMonitorTestGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get value indicating whether test group is disabled.
     *
     * @return the disable value
     */
    public Boolean disable() {
        return this.disable;
    }

    /**
     * Set value indicating whether test group is disabled.
     *
     * @param disable the disable value to set
     * @return the ConnectionMonitorTestGroup object itself.
     */
    public ConnectionMonitorTestGroup withDisable(Boolean disable) {
        this.disable = disable;
        return this;
    }

    /**
     * Get list of test configuration names.
     *
     * @return the testConfigurations value
     */
    public List<String> testConfigurations() {
        return this.testConfigurations;
    }

    /**
     * Set list of test configuration names.
     *
     * @param testConfigurations the testConfigurations value to set
     * @return the ConnectionMonitorTestGroup object itself.
     */
    public ConnectionMonitorTestGroup withTestConfigurations(List<String> testConfigurations) {
        this.testConfigurations = testConfigurations;
        return this;
    }

    /**
     * Get list of source endpoint names.
     *
     * @return the sources value
     */
    public List<String> sources() {
        return this.sources;
    }

    /**
     * Set list of source endpoint names.
     *
     * @param sources the sources value to set
     * @return the ConnectionMonitorTestGroup object itself.
     */
    public ConnectionMonitorTestGroup withSources(List<String> sources) {
        this.sources = sources;
        return this;
    }

    /**
     * Get list of destination endpoint names.
     *
     * @return the destinations value
     */
    public List<String> destinations() {
        return this.destinations;
    }

    /**
     * Set list of destination endpoint names.
     *
     * @param destinations the destinations value to set
     * @return the ConnectionMonitorTestGroup object itself.
     */
    public ConnectionMonitorTestGroup withDestinations(List<String> destinations) {
        this.destinations = destinations;
        return this;
    }

}
