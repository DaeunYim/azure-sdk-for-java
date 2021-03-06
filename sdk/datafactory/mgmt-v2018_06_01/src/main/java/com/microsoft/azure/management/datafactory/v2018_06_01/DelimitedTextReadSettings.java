/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Delimited text read settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = DelimitedTextReadSettings.class)
@JsonTypeName("DelimitedTextReadSettings")
public class DelimitedTextReadSettings extends FormatReadSettings {
    /**
     * Indicates the number of non-empty rows to skip when reading data from
     * input files. Type: integer (or Expression with resultType integer).
     */
    @JsonProperty(value = "skipLineCount")
    private Object skipLineCount;

    /**
     * Compression settings.
     */
    @JsonProperty(value = "compressionProperties")
    private CompressionReadSettings compressionProperties;

    /**
     * Get indicates the number of non-empty rows to skip when reading data from input files. Type: integer (or Expression with resultType integer).
     *
     * @return the skipLineCount value
     */
    public Object skipLineCount() {
        return this.skipLineCount;
    }

    /**
     * Set indicates the number of non-empty rows to skip when reading data from input files. Type: integer (or Expression with resultType integer).
     *
     * @param skipLineCount the skipLineCount value to set
     * @return the DelimitedTextReadSettings object itself.
     */
    public DelimitedTextReadSettings withSkipLineCount(Object skipLineCount) {
        this.skipLineCount = skipLineCount;
        return this;
    }

    /**
     * Get compression settings.
     *
     * @return the compressionProperties value
     */
    public CompressionReadSettings compressionProperties() {
        return this.compressionProperties;
    }

    /**
     * Set compression settings.
     *
     * @param compressionProperties the compressionProperties value to set
     * @return the DelimitedTextReadSettings object itself.
     */
    public DelimitedTextReadSettings withCompressionProperties(CompressionReadSettings compressionProperties) {
        this.compressionProperties = compressionProperties;
        return this;
    }

}
