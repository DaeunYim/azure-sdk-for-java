/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.v2020_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The error details.
 */
public class ServiceErrorDetail {
    /**
     * The error code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * The error message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * The target of the error.
     */
    @JsonProperty(value = "target")
    private String target;

    /**
     * Get the error code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the error message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the target of the error.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target of the error.
     *
     * @param target the target value to set
     * @return the ServiceErrorDetail object itself.
     */
    public ServiceErrorDetail withTarget(String target) {
        this.target = target;
        return this;
    }

}