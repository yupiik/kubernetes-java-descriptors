/*
 * Copyright (c) 2022 - Yupiik SAS - https://www.yupiik.com
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
package io.yupiik.kubernetes.bindings.v1_7_15.v1beta1;

import io.yupiik.kubernetes.bindings.v1_7_15.Exportable;
import io.yupiik.kubernetes.bindings.v1_7_15.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_7_15.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ThirdPartyResource implements Validable<ThirdPartyResource>, Exportable {
    private String apiVersion;
    private String description;
    private String kind;
    private ObjectMeta metadata;
    private List<APIVersion> versions;

    public ThirdPartyResource() {
        // no-op
    }

    public ThirdPartyResource(final String apiVersion,
                              final String description,
                              final String kind,
                              final ObjectMeta metadata,
                              final List<APIVersion> versions) {
        this.apiVersion = apiVersion;
        this.description = description;
        this.kind = kind;
        this.metadata = metadata;
        this.versions = versions;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public List<APIVersion> getVersions() {
        return versions;
    }

    public void setVersions(final List<APIVersion> versions) {
        this.versions = versions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                description,
                kind,
                metadata,
                versions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ThirdPartyResource)) {
            return false;
        }
        final ThirdPartyResource __otherCasted = (ThirdPartyResource) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(description, __otherCasted.description) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(versions, __otherCasted.versions);
    }

    public ThirdPartyResource apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ThirdPartyResource description(final String description) {
        this.description = description;
        return this;
    }

    public ThirdPartyResource kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ThirdPartyResource metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ThirdPartyResource versions(final List<APIVersion> versions) {
        this.versions = versions;
        return this;
    }

    @Override
    public ThirdPartyResource validate() {
        if (kind == null) {
            kind = "ThirdPartyResource";
        }
        if (apiVersion == null) {
            apiVersion = "extensions/v1beta1";
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (description != null ? "\"description\":\"" +  JsonStrings.escapeJson(description) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (versions != null ? "\"versions\":" + versions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
