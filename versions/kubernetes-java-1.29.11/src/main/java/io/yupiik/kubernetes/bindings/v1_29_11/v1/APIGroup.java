/*
 * Copyright (c) 2022 - present - Yupiik SAS - https://www.yupiik.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.yupiik.kubernetes.bindings.v1_29_11.v1;

import io.yupiik.kubernetes.bindings.v1_29_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_11.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_29_11.Validable;
import io.yupiik.kubernetes.bindings.v1_29_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class APIGroup implements Validable<APIGroup>, Exportable {
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
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.name = name;
        this.preferredVersion = preferredVersion;
        this.serverAddressByClientCIDRs = serverAddressByClientCIDRs;
        this.versions = versions;
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
        if (kind == null) {
            kind = "APIGroup";
        }
        if (apiVersion == null) {
            apiVersion = "v1";
        }
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

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (preferredVersion != null ? "\"preferredVersion\":" + preferredVersion.asJson() : ""),
                    (serverAddressByClientCIDRs != null ? "\"serverAddressByClientCIDRs\":" + serverAddressByClientCIDRs.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (versions != null ? "\"versions\":" + versions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
