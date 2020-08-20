/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01.implementation;

import com.microsoft.azure.management.network.v2020_06_01.RouteFilterRule;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_06_01.Access;
import java.util.List;
import com.microsoft.azure.management.network.v2020_06_01.ProvisioningState;

class RouteFilterRuleImpl extends CreatableUpdatableImpl<RouteFilterRule, RouteFilterRuleInner, RouteFilterRuleImpl> implements RouteFilterRule, RouteFilterRule.Definition, RouteFilterRule.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String routeFilterName;
    private String ruleName;

    RouteFilterRuleImpl(String name, NetworkManager manager) {
        super(name, new RouteFilterRuleInner());
        this.manager = manager;
        // Set resource name
        this.ruleName = name;
        //
    }

    RouteFilterRuleImpl(RouteFilterRuleInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.ruleName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.routeFilterName = IdParsingUtils.getValueFromIdByName(inner.id(), "routeFilters");
        this.ruleName = IdParsingUtils.getValueFromIdByName(inner.id(), "routeFilterRules");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<RouteFilterRule> createResourceAsync() {
        RouteFilterRulesInner client = this.manager().inner().routeFilterRules();
        return client.createOrUpdateAsync(this.resourceGroupName, this.routeFilterName, this.ruleName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<RouteFilterRule> updateResourceAsync() {
        RouteFilterRulesInner client = this.manager().inner().routeFilterRules();
        return client.createOrUpdateAsync(this.resourceGroupName, this.routeFilterName, this.ruleName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<RouteFilterRuleInner> getInnerAsync() {
        RouteFilterRulesInner client = this.manager().inner().routeFilterRules();
        return client.getAsync(this.resourceGroupName, this.routeFilterName, this.ruleName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public Access access() {
        return this.inner().access();
    }

    @Override
    public List<String> communities() {
        return this.inner().communities();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String routeFilterRuleType() {
        return this.inner().routeFilterRuleType();
    }

    @Override
    public RouteFilterRuleImpl withExistingRouteFilter(String resourceGroupName, String routeFilterName) {
        this.resourceGroupName = resourceGroupName;
        this.routeFilterName = routeFilterName;
        return this;
    }

    @Override
    public RouteFilterRuleImpl withAccess(Access access) {
        this.inner().withAccess(access);
        return this;
    }

    @Override
    public RouteFilterRuleImpl withCommunities(List<String> communities) {
        this.inner().withCommunities(communities);
        return this;
    }

    @Override
    public RouteFilterRuleImpl withRouteFilterRuleType(String routeFilterRuleType) {
        this.inner().withRouteFilterRuleType(routeFilterRuleType);
        return this;
    }

    @Override
    public RouteFilterRuleImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public RouteFilterRuleImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public RouteFilterRuleImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

}
