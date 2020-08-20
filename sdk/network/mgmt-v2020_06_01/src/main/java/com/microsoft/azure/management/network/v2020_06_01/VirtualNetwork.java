/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_06_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_06_01.implementation.SubnetInner;
import com.microsoft.azure.management.network.v2020_06_01.implementation.VirtualNetworkPeeringInner;
import com.microsoft.azure.management.network.v2020_06_01.implementation.VirtualNetworkInner;

/**
 * Type representing VirtualNetwork.
 */
public interface VirtualNetwork extends HasInner<VirtualNetworkInner>, Resource, GroupableResourceCore<NetworkManager, VirtualNetworkInner>, HasResourceGroup, Refreshable<VirtualNetwork>, Updatable<VirtualNetwork.Update>, HasManager<NetworkManager> {
    /**
     * @return the addressSpace value.
     */
    AddressSpace addressSpace();

    /**
     * @return the bgpCommunities value.
     */
    VirtualNetworkBgpCommunities bgpCommunities();

    /**
     * @return the ddosProtectionPlan value.
     */
    SubResource ddosProtectionPlan();

    /**
     * @return the dhcpOptions value.
     */
    DhcpOptions dhcpOptions();

    /**
     * @return the enableDdosProtection value.
     */
    Boolean enableDdosProtection();

    /**
     * @return the enableVmProtection value.
     */
    Boolean enableVmProtection();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the ipAllocations value.
     */
    List<SubResource> ipAllocations();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * @return the subnets value.
     */
    List<Subnet> subnets();

    /**
     * @return the virtualNetworkPeerings value.
     */
    List<VirtualNetworkPeering> virtualNetworkPeerings();

    /**
     * The entirety of the VirtualNetwork definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualNetwork definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualNetwork definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the VirtualNetwork definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the virtualnetwork definition allowing to specify AddressSpace.
         */
        interface WithAddressSpace {
            /**
             * Specifies addressSpace.
             * @param addressSpace The AddressSpace that contains an array of IP address ranges that can be used by subnets
             * @return the next definition stage
             */
            WithCreate withAddressSpace(AddressSpace addressSpace);
        }

        /**
         * The stage of the virtualnetwork definition allowing to specify BgpCommunities.
         */
        interface WithBgpCommunities {
            /**
             * Specifies bgpCommunities.
             * @param bgpCommunities Bgp Communities sent over ExpressRoute with each route corresponding to a prefix in this VNET
             * @return the next definition stage
             */
            WithCreate withBgpCommunities(VirtualNetworkBgpCommunities bgpCommunities);
        }

        /**
         * The stage of the virtualnetwork definition allowing to specify DdosProtectionPlan.
         */
        interface WithDdosProtectionPlan {
            /**
             * Specifies ddosProtectionPlan.
             * @param ddosProtectionPlan The DDoS protection plan associated with the virtual network
             * @return the next definition stage
             */
            WithCreate withDdosProtectionPlan(SubResource ddosProtectionPlan);
        }

        /**
         * The stage of the virtualnetwork definition allowing to specify DhcpOptions.
         */
        interface WithDhcpOptions {
            /**
             * Specifies dhcpOptions.
             * @param dhcpOptions The dhcpOptions that contains an array of DNS servers available to VMs deployed in the virtual network
             * @return the next definition stage
             */
            WithCreate withDhcpOptions(DhcpOptions dhcpOptions);
        }

        /**
         * The stage of the virtualnetwork definition allowing to specify EnableDdosProtection.
         */
        interface WithEnableDdosProtection {
            /**
             * Specifies enableDdosProtection.
             * @param enableDdosProtection Indicates if DDoS protection is enabled for all the protected resources in the virtual network. It requires a DDoS protection plan associated with the resource
             * @return the next definition stage
             */
            WithCreate withEnableDdosProtection(Boolean enableDdosProtection);
        }

        /**
         * The stage of the virtualnetwork definition allowing to specify EnableVmProtection.
         */
        interface WithEnableVmProtection {
            /**
             * Specifies enableVmProtection.
             * @param enableVmProtection Indicates if VM protection is enabled for all the subnets in the virtual network
             * @return the next definition stage
             */
            WithCreate withEnableVmProtection(Boolean enableVmProtection);
        }

        /**
         * The stage of the virtualnetwork definition allowing to specify IpAllocations.
         */
        interface WithIpAllocations {
            /**
             * Specifies ipAllocations.
             * @param ipAllocations Array of IpAllocation which reference this VNET
             * @return the next definition stage
             */
            WithCreate withIpAllocations(List<SubResource> ipAllocations);
        }

        /**
         * The stage of the virtualnetwork definition allowing to specify Subnets.
         */
        interface WithSubnets {
            /**
             * Specifies subnets.
             * @param subnets A list of subnets in a Virtual Network
             * @return the next definition stage
             */
            WithCreate withSubnets(List<SubnetInner> subnets);
        }

        /**
         * The stage of the virtualnetwork definition allowing to specify VirtualNetworkPeerings.
         */
        interface WithVirtualNetworkPeerings {
            /**
             * Specifies virtualNetworkPeerings.
             * @param virtualNetworkPeerings A list of peerings in a Virtual Network
             * @return the next definition stage
             */
            WithCreate withVirtualNetworkPeerings(List<VirtualNetworkPeeringInner> virtualNetworkPeerings);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualNetwork>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAddressSpace, DefinitionStages.WithBgpCommunities, DefinitionStages.WithDdosProtectionPlan, DefinitionStages.WithDhcpOptions, DefinitionStages.WithEnableDdosProtection, DefinitionStages.WithEnableVmProtection, DefinitionStages.WithIpAllocations, DefinitionStages.WithSubnets, DefinitionStages.WithVirtualNetworkPeerings {
        }
    }
    /**
     * The template for a VirtualNetwork update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualNetwork>, Resource.UpdateWithTags<Update>, UpdateStages.WithAddressSpace, UpdateStages.WithBgpCommunities, UpdateStages.WithDdosProtectionPlan, UpdateStages.WithDhcpOptions, UpdateStages.WithEnableDdosProtection, UpdateStages.WithEnableVmProtection, UpdateStages.WithIpAllocations, UpdateStages.WithSubnets, UpdateStages.WithVirtualNetworkPeerings {
    }

    /**
     * Grouping of VirtualNetwork update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualnetwork update allowing to specify AddressSpace.
         */
        interface WithAddressSpace {
            /**
             * Specifies addressSpace.
             * @param addressSpace The AddressSpace that contains an array of IP address ranges that can be used by subnets
             * @return the next update stage
             */
            Update withAddressSpace(AddressSpace addressSpace);
        }

        /**
         * The stage of the virtualnetwork update allowing to specify BgpCommunities.
         */
        interface WithBgpCommunities {
            /**
             * Specifies bgpCommunities.
             * @param bgpCommunities Bgp Communities sent over ExpressRoute with each route corresponding to a prefix in this VNET
             * @return the next update stage
             */
            Update withBgpCommunities(VirtualNetworkBgpCommunities bgpCommunities);
        }

        /**
         * The stage of the virtualnetwork update allowing to specify DdosProtectionPlan.
         */
        interface WithDdosProtectionPlan {
            /**
             * Specifies ddosProtectionPlan.
             * @param ddosProtectionPlan The DDoS protection plan associated with the virtual network
             * @return the next update stage
             */
            Update withDdosProtectionPlan(SubResource ddosProtectionPlan);
        }

        /**
         * The stage of the virtualnetwork update allowing to specify DhcpOptions.
         */
        interface WithDhcpOptions {
            /**
             * Specifies dhcpOptions.
             * @param dhcpOptions The dhcpOptions that contains an array of DNS servers available to VMs deployed in the virtual network
             * @return the next update stage
             */
            Update withDhcpOptions(DhcpOptions dhcpOptions);
        }

        /**
         * The stage of the virtualnetwork update allowing to specify EnableDdosProtection.
         */
        interface WithEnableDdosProtection {
            /**
             * Specifies enableDdosProtection.
             * @param enableDdosProtection Indicates if DDoS protection is enabled for all the protected resources in the virtual network. It requires a DDoS protection plan associated with the resource
             * @return the next update stage
             */
            Update withEnableDdosProtection(Boolean enableDdosProtection);
        }

        /**
         * The stage of the virtualnetwork update allowing to specify EnableVmProtection.
         */
        interface WithEnableVmProtection {
            /**
             * Specifies enableVmProtection.
             * @param enableVmProtection Indicates if VM protection is enabled for all the subnets in the virtual network
             * @return the next update stage
             */
            Update withEnableVmProtection(Boolean enableVmProtection);
        }

        /**
         * The stage of the virtualnetwork update allowing to specify IpAllocations.
         */
        interface WithIpAllocations {
            /**
             * Specifies ipAllocations.
             * @param ipAllocations Array of IpAllocation which reference this VNET
             * @return the next update stage
             */
            Update withIpAllocations(List<SubResource> ipAllocations);
        }

        /**
         * The stage of the virtualnetwork update allowing to specify Subnets.
         */
        interface WithSubnets {
            /**
             * Specifies subnets.
             * @param subnets A list of subnets in a Virtual Network
             * @return the next update stage
             */
            Update withSubnets(List<SubnetInner> subnets);
        }

        /**
         * The stage of the virtualnetwork update allowing to specify VirtualNetworkPeerings.
         */
        interface WithVirtualNetworkPeerings {
            /**
             * Specifies virtualNetworkPeerings.
             * @param virtualNetworkPeerings A list of peerings in a Virtual Network
             * @return the next update stage
             */
            Update withVirtualNetworkPeerings(List<VirtualNetworkPeeringInner> virtualNetworkPeerings);
        }

    }
}
