package io.yupiik.kubernetes.bindings.v1_18_17.v1;

import io.yupiik.kubernetes.bindings.v1_18_17.Exportable;
import io.yupiik.kubernetes.bindings.v1_18_17.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_18_17.Validable;
import io.yupiik.kubernetes.bindings.v1_18_17.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class APIVersions implements Validable<APIVersions>, Exportable {
    private String apiVersion;
    private String kind;
    private List<ServerAddressByClientCIDR> serverAddressByClientCIDRs;
    private List<String> versions;

    public APIVersions() {
        // no-op
    }

    public APIVersions(final String apiVersion,
                       final String kind,
                       final List<ServerAddressByClientCIDR> serverAddressByClientCIDRs,
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

    public List<ServerAddressByClientCIDR> getServerAddressByClientCIDRs() {
        return serverAddressByClientCIDRs;
    }

    public void setServerAddressByClientCIDRs(final List<ServerAddressByClientCIDR> serverAddressByClientCIDRs) {
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

    public APIVersions apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public APIVersions kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public APIVersions serverAddressByClientCIDRs(final List<ServerAddressByClientCIDR> serverAddressByClientCIDRs) {
        this.serverAddressByClientCIDRs = serverAddressByClientCIDRs;
        return this;
    }

    public APIVersions versions(final List<String> versions) {
        this.versions = versions;
        return this;
    }

    @Override
    public APIVersions validate() {
        if (kind == null) {
            kind = "APIVersions";
        }
        if (apiVersion == null) {
            apiVersion = "v1";
        }
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (serverAddressByClientCIDRs == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "serverAddressByClientCIDRs", "serverAddressByClientCIDRs",
                "Missing 'serverAddressByClientCIDRs' attribute.", true));
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

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (serverAddressByClientCIDRs != null ? "\"serverAddressByClientCIDRs\":" + serverAddressByClientCIDRs.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (versions != null ? "\"versions\":" + versions.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
