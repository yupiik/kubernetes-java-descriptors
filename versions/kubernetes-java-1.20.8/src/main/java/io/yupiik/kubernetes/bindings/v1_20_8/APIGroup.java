package io.yupiik.kubernetes.bindings.v1_20_8;

import java.util.List;
import java.util.Objects;

public class APIGroup {
    private String apiVersion;
    private String kind;
    private String name;
    private APIGroupPreferredVersion preferredVersion;
    private List<APIGroupServerAddressByClientCIDRs> serverAddressByClientCIDRs;
    private List<APIGroupVersions> versions;

    public APIGroup() {
        // no-op
    }

    public APIGroup(final String apiVersion,
                    final String kind,
                    final String name,
                    final APIGroupPreferredVersion preferredVersion,
                    final List<APIGroupServerAddressByClientCIDRs> serverAddressByClientCIDRs,
                    final List<APIGroupVersions> versions) {
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

    public APIGroupPreferredVersion getPreferredVersion() {
        return preferredVersion;
    }

    public void setPreferredVersion(final APIGroupPreferredVersion preferredVersion) {
        this.preferredVersion = preferredVersion;
    }

    public List<APIGroupServerAddressByClientCIDRs> getServerAddressByClientCIDRs() {
        return serverAddressByClientCIDRs;
    }

    public void setServerAddressByClientCIDRs(final List<APIGroupServerAddressByClientCIDRs> serverAddressByClientCIDRs) {
        this.serverAddressByClientCIDRs = serverAddressByClientCIDRs;
    }

    public List<APIGroupVersions> getVersions() {
        return versions;
    }

    public void setVersions(final List<APIGroupVersions> versions) {
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
        if (!(__other instanceof APIGroup)) {
            return false;
        }
        final APIGroup __otherCasted = (APIGroup) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(preferredVersion, __otherCasted.preferredVersion) &&
            Objects.equals(serverAddressByClientCIDRs, __otherCasted.serverAddressByClientCIDRs) &&
            Objects.equals(versions, __otherCasted.versions);
    }
}
