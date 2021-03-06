/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A reference to an Azure resource.
 */
public class ResourceReference {
    /**
     * The fully qualified Azure resource id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the fully qualified Azure resource id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the fully qualified Azure resource id.
     *
     * @param id the id value to set
     * @return the ResourceReference object itself.
     */
    public ResourceReference withId(String id) {
        this.id = id;
        return this;
    }

}
