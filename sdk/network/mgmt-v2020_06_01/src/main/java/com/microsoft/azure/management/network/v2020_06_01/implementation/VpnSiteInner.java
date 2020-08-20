/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01.implementation;

import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_06_01.DeviceProperties;
import com.microsoft.azure.management.network.v2020_06_01.AddressSpace;
import com.microsoft.azure.management.network.v2020_06_01.BgpSettings;
import com.microsoft.azure.management.network.v2020_06_01.ProvisioningState;
import java.util.List;
import com.microsoft.azure.management.network.v2020_06_01.O365PolicyProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * VpnSite Resource.
 */
@JsonFlatten
@SkipParentValidation
public class VpnSiteInner extends Resource {
    /**
     * The VirtualWAN to which the vpnSite belongs.
     */
    @JsonProperty(value = "properties.virtualWan")
    private SubResource virtualWan;

    /**
     * The device properties.
     */
    @JsonProperty(value = "properties.deviceProperties")
    private DeviceProperties deviceProperties;

    /**
     * The ip-address for the vpn-site.
     */
    @JsonProperty(value = "properties.ipAddress")
    private String ipAddress;

    /**
     * The key for vpn-site that can be used for connections.
     */
    @JsonProperty(value = "properties.siteKey")
    private String siteKey;

    /**
     * The AddressSpace that contains an array of IP address ranges.
     */
    @JsonProperty(value = "properties.addressSpace")
    private AddressSpace addressSpace;

    /**
     * The set of bgp properties.
     */
    @JsonProperty(value = "properties.bgpProperties")
    private BgpSettings bgpProperties;

    /**
     * The provisioning state of the VPN site resource. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * IsSecuritySite flag.
     */
    @JsonProperty(value = "properties.isSecuritySite")
    private Boolean isSecuritySite;

    /**
     * List of all vpn site links.
     */
    @JsonProperty(value = "properties.vpnSiteLinks")
    private List<VpnSiteLinkInner> vpnSiteLinks;

    /**
     * Office365 Policy.
     */
    @JsonProperty(value = "properties.o365Policy")
    private O365PolicyProperties o365Policy;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the VirtualWAN to which the vpnSite belongs.
     *
     * @return the virtualWan value
     */
    public SubResource virtualWan() {
        return this.virtualWan;
    }

    /**
     * Set the VirtualWAN to which the vpnSite belongs.
     *
     * @param virtualWan the virtualWan value to set
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withVirtualWan(SubResource virtualWan) {
        this.virtualWan = virtualWan;
        return this;
    }

    /**
     * Get the device properties.
     *
     * @return the deviceProperties value
     */
    public DeviceProperties deviceProperties() {
        return this.deviceProperties;
    }

    /**
     * Set the device properties.
     *
     * @param deviceProperties the deviceProperties value to set
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withDeviceProperties(DeviceProperties deviceProperties) {
        this.deviceProperties = deviceProperties;
        return this;
    }

    /**
     * Get the ip-address for the vpn-site.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ip-address for the vpn-site.
     *
     * @param ipAddress the ipAddress value to set
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the key for vpn-site that can be used for connections.
     *
     * @return the siteKey value
     */
    public String siteKey() {
        return this.siteKey;
    }

    /**
     * Set the key for vpn-site that can be used for connections.
     *
     * @param siteKey the siteKey value to set
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withSiteKey(String siteKey) {
        this.siteKey = siteKey;
        return this;
    }

    /**
     * Get the AddressSpace that contains an array of IP address ranges.
     *
     * @return the addressSpace value
     */
    public AddressSpace addressSpace() {
        return this.addressSpace;
    }

    /**
     * Set the AddressSpace that contains an array of IP address ranges.
     *
     * @param addressSpace the addressSpace value to set
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withAddressSpace(AddressSpace addressSpace) {
        this.addressSpace = addressSpace;
        return this;
    }

    /**
     * Get the set of bgp properties.
     *
     * @return the bgpProperties value
     */
    public BgpSettings bgpProperties() {
        return this.bgpProperties;
    }

    /**
     * Set the set of bgp properties.
     *
     * @param bgpProperties the bgpProperties value to set
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withBgpProperties(BgpSettings bgpProperties) {
        this.bgpProperties = bgpProperties;
        return this;
    }

    /**
     * Get the provisioning state of the VPN site resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get isSecuritySite flag.
     *
     * @return the isSecuritySite value
     */
    public Boolean isSecuritySite() {
        return this.isSecuritySite;
    }

    /**
     * Set isSecuritySite flag.
     *
     * @param isSecuritySite the isSecuritySite value to set
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withIsSecuritySite(Boolean isSecuritySite) {
        this.isSecuritySite = isSecuritySite;
        return this;
    }

    /**
     * Get list of all vpn site links.
     *
     * @return the vpnSiteLinks value
     */
    public List<VpnSiteLinkInner> vpnSiteLinks() {
        return this.vpnSiteLinks;
    }

    /**
     * Set list of all vpn site links.
     *
     * @param vpnSiteLinks the vpnSiteLinks value to set
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withVpnSiteLinks(List<VpnSiteLinkInner> vpnSiteLinks) {
        this.vpnSiteLinks = vpnSiteLinks;
        return this;
    }

    /**
     * Get office365 Policy.
     *
     * @return the o365Policy value
     */
    public O365PolicyProperties o365Policy() {
        return this.o365Policy;
    }

    /**
     * Set office365 Policy.
     *
     * @param o365Policy the o365Policy value to set
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withO365Policy(O365PolicyProperties o365Policy) {
        this.o365Policy = o365Policy;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withId(String id) {
        this.id = id;
        return this;
    }

}
