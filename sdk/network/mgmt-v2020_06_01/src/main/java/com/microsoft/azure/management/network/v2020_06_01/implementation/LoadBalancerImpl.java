/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_06_01.LoadBalancer;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_06_01.LoadBalancerSku;
import java.util.List;
import com.microsoft.azure.management.network.v2020_06_01.InboundNatPool;
import com.microsoft.azure.management.network.v2020_06_01.ProvisioningState;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2020_06_01.BackendAddressPool;
import com.microsoft.azure.management.network.v2020_06_01.FrontendIPConfiguration;
import com.microsoft.azure.management.network.v2020_06_01.InboundNatRule;
import com.microsoft.azure.management.network.v2020_06_01.LoadBalancingRule;
import com.microsoft.azure.management.network.v2020_06_01.OutboundRule;
import com.microsoft.azure.management.network.v2020_06_01.Probe;

class LoadBalancerImpl extends GroupableResourceCoreImpl<LoadBalancer, LoadBalancerInner, LoadBalancerImpl, NetworkManager> implements LoadBalancer, LoadBalancer.Definition, LoadBalancer.Update {
    LoadBalancerImpl(String name, LoadBalancerInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<LoadBalancer> createResourceAsync() {
        LoadBalancersInner client = this.manager().inner().loadBalancers();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<LoadBalancer> updateResourceAsync() {
        LoadBalancersInner client = this.manager().inner().loadBalancers();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<LoadBalancerInner> getInnerAsync() {
        LoadBalancersInner client = this.manager().inner().loadBalancers();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<BackendAddressPool> backendAddressPools() {
        List<BackendAddressPool> lst = new ArrayList<BackendAddressPool>();
        if (this.inner().backendAddressPools() != null) {
            for (BackendAddressPoolInner inner : this.inner().backendAddressPools()) {
                lst.add( new BackendAddressPoolImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public List<FrontendIPConfiguration> frontendIPConfigurations() {
        List<FrontendIPConfiguration> lst = new ArrayList<FrontendIPConfiguration>();
        if (this.inner().frontendIPConfigurations() != null) {
            for (FrontendIPConfigurationInner inner : this.inner().frontendIPConfigurations()) {
                lst.add( new FrontendIPConfigurationImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public List<InboundNatPool> inboundNatPools() {
        return this.inner().inboundNatPools();
    }

    @Override
    public List<InboundNatRule> inboundNatRules() {
        List<InboundNatRule> lst = new ArrayList<InboundNatRule>();
        if (this.inner().inboundNatRules() != null) {
            for (InboundNatRuleInner inner : this.inner().inboundNatRules()) {
                lst.add( new InboundNatRuleImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public List<LoadBalancingRule> loadBalancingRules() {
        List<LoadBalancingRule> lst = new ArrayList<LoadBalancingRule>();
        if (this.inner().loadBalancingRules() != null) {
            for (LoadBalancingRuleInner inner : this.inner().loadBalancingRules()) {
                lst.add( new LoadBalancingRuleImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public List<OutboundRule> outboundRules() {
        List<OutboundRule> lst = new ArrayList<OutboundRule>();
        if (this.inner().outboundRules() != null) {
            for (OutboundRuleInner inner : this.inner().outboundRules()) {
                lst.add( new OutboundRuleImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public List<Probe> probes() {
        List<Probe> lst = new ArrayList<Probe>();
        if (this.inner().probes() != null) {
            for (ProbeInner inner : this.inner().probes()) {
                lst.add( new ProbeImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String resourceGuid() {
        return this.inner().resourceGuid();
    }

    @Override
    public LoadBalancerSku sku() {
        return this.inner().sku();
    }

    @Override
    public LoadBalancerImpl withBackendAddressPools(List<BackendAddressPoolInner> backendAddressPools) {
        this.inner().withBackendAddressPools(backendAddressPools);
        return this;
    }

    @Override
    public LoadBalancerImpl withFrontendIPConfigurations(List<FrontendIPConfigurationInner> frontendIPConfigurations) {
        this.inner().withFrontendIPConfigurations(frontendIPConfigurations);
        return this;
    }

    @Override
    public LoadBalancerImpl withInboundNatPools(List<InboundNatPool> inboundNatPools) {
        this.inner().withInboundNatPools(inboundNatPools);
        return this;
    }

    @Override
    public LoadBalancerImpl withInboundNatRules(List<InboundNatRuleInner> inboundNatRules) {
        this.inner().withInboundNatRules(inboundNatRules);
        return this;
    }

    @Override
    public LoadBalancerImpl withLoadBalancingRules(List<LoadBalancingRuleInner> loadBalancingRules) {
        this.inner().withLoadBalancingRules(loadBalancingRules);
        return this;
    }

    @Override
    public LoadBalancerImpl withOutboundRules(List<OutboundRuleInner> outboundRules) {
        this.inner().withOutboundRules(outboundRules);
        return this;
    }

    @Override
    public LoadBalancerImpl withProbes(List<ProbeInner> probes) {
        this.inner().withProbes(probes);
        return this;
    }

    @Override
    public LoadBalancerImpl withSku(LoadBalancerSku sku) {
        this.inner().withSku(sku);
        return this;
    }

}
