// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** The MetricAvailability model. */
@Fluent
public final class MetricAvailability {
    /*
     * the time grain specifies the aggregation interval for the metric.
     * Expressed as a duration 'PT1M', 'P1D', etc.
     */
    @JsonProperty(value = "timeGrain")
    private Duration timeGrain;

    /*
     * the retention period for the metric at the specified timegrain.
     * Expressed as a duration 'PT1M', 'P1D', etc.
     */
    @JsonProperty(value = "retention")
    private Duration retention;

    /**
     * Get the timeGrain property: the time grain specifies the aggregation interval for the metric. Expressed as a
     * duration 'PT1M', 'P1D', etc.
     *
     * @return the timeGrain value.
     */
    public Duration timeGrain() {
        return this.timeGrain;
    }

    /**
     * Set the timeGrain property: the time grain specifies the aggregation interval for the metric. Expressed as a
     * duration 'PT1M', 'P1D', etc.
     *
     * @param timeGrain the timeGrain value to set.
     * @return the MetricAvailability object itself.
     */
    public MetricAvailability withTimeGrain(Duration timeGrain) {
        this.timeGrain = timeGrain;
        return this;
    }

    /**
     * Get the retention property: the retention period for the metric at the specified timegrain. Expressed as a
     * duration 'PT1M', 'P1D', etc.
     *
     * @return the retention value.
     */
    public Duration retention() {
        return this.retention;
    }

    /**
     * Set the retention property: the retention period for the metric at the specified timegrain. Expressed as a
     * duration 'PT1M', 'P1D', etc.
     *
     * @param retention the retention value to set.
     * @return the MetricAvailability object itself.
     */
    public MetricAvailability withRetention(Duration retention) {
        this.retention = retention;
        return this;
    }
}