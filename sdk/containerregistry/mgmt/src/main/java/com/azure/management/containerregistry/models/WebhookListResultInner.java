// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The WebhookListResult model. */
@Fluent
public final class WebhookListResultInner {
    /*
     * The list of webhooks. Since this list may be incomplete, the nextLink
     * field should be used to request the next list of webhooks.
     */
    @JsonProperty(value = "value")
    private List<WebhookInner> value;

    /*
     * The URI that can be used to request the next list of webhooks.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of webhooks. Since this list may be incomplete, the nextLink field should be
     * used to request the next list of webhooks.
     *
     * @return the value value.
     */
    public List<WebhookInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of webhooks. Since this list may be incomplete, the nextLink field should be
     * used to request the next list of webhooks.
     *
     * @param value the value value to set.
     * @return the WebhookListResultInner object itself.
     */
    public WebhookListResultInner withValue(List<WebhookInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI that can be used to request the next list of webhooks.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI that can be used to request the next list of webhooks.
     *
     * @param nextLink the nextLink value to set.
     * @return the WebhookListResultInner object itself.
     */
    public WebhookListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}