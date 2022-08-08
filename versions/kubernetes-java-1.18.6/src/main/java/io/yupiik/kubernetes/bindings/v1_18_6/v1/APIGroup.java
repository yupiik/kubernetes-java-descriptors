package io.yupiik.kubernetes.bindings.v1_18_6.v1;

import io.yupiik.kubernetes.bindings.v1_18_6.Validable;
import io.yupiik.kubernetes.bindings.v1_18_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class APIGroup implements Validable<APIGroup> {
    private String apiVersion;
    private String kind;
    private String name;
    private GroupVersionForDiscovery preferredVersion;
    private List<ServerAddressByClientCIDR> serverAddressByClientCIDRs;
    private List<GroupVersionForDiscovery> versions;

    public APIGroup() {
        // no-op
    }

    public APIGroup(final String apiVersion,
                    final String kind,
                    final String name,
                    final GroupVersionForDiscovery preferredVersion,
                    final List<ServerAddressByClientCIDR> serverAddressByClientCIDRs,
                    final List<GroupVersionForDiscovery> versions) {
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

    public GroupVersionForDiscovery getPreferredVersion() {
        return preferredVersion;
    }

    public void setPreferredVersion(final GroupVersionForDiscovery preferredVersion) {
        this.preferredVersion = preferredVersion;
    }

    public List<ServerAddressByClientCIDR> getServerAddressByClientCIDRs() {
        return serverAddressByClientCIDRs;
    }

    public void setServerAddressByClientCIDRs(final List<ServerAddressByClientCIDR> serverAddressByClientCIDRs) {
        this.serverAddressByClientCIDRs = serverAddressByClientCIDRs;
    }

    public List<GroupVersionForDiscovery> getVersions() {
        return versions;
    }

    public void setVersions(final List<GroupVersionForDiscovery> versions) {
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

    public APIGroup apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public APIGroup kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public APIGroup name(final String name) {
        this.name = name;
        return this;
    }

    public APIGroup preferredVersion(final GroupVersionForDiscovery preferredVersion) {
        this.preferredVersion = preferredVersion;
        return this;
    }

    public APIGroup serverAddressByClientCIDRs(final List<ServerAddressByClientCIDR> serverAddressByClientCIDRs) {
        this.serverAddressByClientCIDRs = serverAddressByClientCIDRs;
        return this;
    }

    public APIGroup versions(final List<GroupVersionForDiscovery> versions) {
        this.versions = versions;
        return this;
    }

    @Override
    public APIGroup validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (versions == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "versions", "versions",
                "Missing 'versions' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
