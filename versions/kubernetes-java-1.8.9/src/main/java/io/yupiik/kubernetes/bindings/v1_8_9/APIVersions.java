package io.yupiik.kubernetes.bindings.v1_8_9;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class APIVersions {
    private String apiVersion;
    private String kind;
    private List<JsonValue> serverAddressByClientCIDRs;
    private List<String> versions;

    public APIVersions() {
        // no-op
    }

    public APIVersions(final String apiVersion,
                       final String kind,
                       final List<JsonValue> serverAddressByClientCIDRs,
                       final List<String> versions) {
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

    public List<JsonValue> getServerAddressByClientCIDRs() {
        return serverAddressByClientCIDRs;
    }

    public void setServerAddressByClientCIDRs(final List<JsonValue> serverAddressByClientCIDRs) {
        this.serverAddressByClientCIDRs = serverAddressByClientCIDRs;
    }

    public List<String> getVersions() {
        return versions;
    }

    public void setVersions(final List<String> versions) {
        this.versions = versions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                serverAddressByClientCIDRs,
                versions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof APIVersions)) {
            return false;
        }
        final APIVersions __otherCasted = (APIVersions) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(serverAddressByClientCIDRs, __otherCasted.serverAddressByClientCIDRs) &&
            Objects.equals(versions, __otherCasted.versions);
    }
}
