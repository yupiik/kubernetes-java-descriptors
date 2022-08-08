package io.yupiik.kubernetes.bindings.v1_14_0;

import java.util.List;
import java.util.Objects;

public class APIGroupListGroups {
    private String apiVersion;
    private String kind;
    private String name;
    private APIGroupListGroupsPreferredVersion preferredVersion;
    private List<APIGroupListGroupsServerAddressByClientCIDRs> serverAddressByClientCIDRs;
    private List<APIGroupListGroupsVersions> versions;

    public APIGroupListGroups() {
        // no-op
    }

    public APIGroupListGroups(final String apiVersion,
                              final String kind,
                              final String name,
                              final APIGroupListGroupsPreferredVersion preferredVersion,
                              final List<APIGroupListGroupsServerAddressByClientCIDRs> serverAddressByClientCIDRs,
                              final List<APIGroupListGroupsVersions> versions) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public APIGroupListGroupsPreferredVersion getPreferredVersion() {
        return preferredVersion;
    }

    public void setPreferredVersion(final APIGroupListGroupsPreferredVersion preferredVersion) {
        this.preferredVersion = preferredVersion;
    }

    public List<APIGroupListGroupsServerAddressByClientCIDRs> getServerAddressByClientCIDRs() {
        return serverAddressByClientCIDRs;
    }

    public void setServerAddressByClientCIDRs(final List<APIGroupListGroupsServerAddressByClientCIDRs> serverAddressByClientCIDRs) {
        this.serverAddressByClientCIDRs = serverAddressByClientCIDRs;
    }

    public List<APIGroupListGroupsVersions> getVersions() {
        return versions;
    }

    public void setVersions(final List<APIGroupListGroupsVersions> versions) {
        this.versions = versions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                name,
                preferredVersion,
                serverAddressByClientCIDRs,
                versions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof APIGroupListGroups)) {
            return false;
        }
        final APIGroupListGroups __otherCasted = (APIGroupListGroups) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(preferredVersion, __otherCasted.preferredVersion) &&
            Objects.equals(serverAddressByClientCIDRs, __otherCasted.serverAddressByClientCIDRs) &&
            Objects.equals(versions, __otherCasted.versions);
    }
}
