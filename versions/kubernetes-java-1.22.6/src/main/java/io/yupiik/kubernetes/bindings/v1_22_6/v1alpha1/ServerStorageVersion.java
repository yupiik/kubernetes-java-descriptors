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
package io.yupiik.kubernetes.bindings.v1_22_6.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_22_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_22_6.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ServerStorageVersion implements Validable<ServerStorageVersion>, Exportable {
    private String apiServerID;
    private List<String> decodableVersions;
    private String encodingVersion;

    public ServerStorageVersion() {
        // no-op
    }

    public ServerStorageVersion(final String apiServerID,
                                final List<String> decodableVersions,
                                final String encodingVersion) {
        this.apiServerID = apiServerID;
        this.decodableVersions = decodableVersions;
        this.encodingVersion = encodingVersion;
    }

    public String getApiServerID() {
        return apiServerID;
    }

    public void setApiServerID(final String apiServerID) {
        this.apiServerID = apiServerID;
    }

    public List<String> getDecodableVersions() {
        return decodableVersions;
    }

    public void setDecodableVersions(final List<String> decodableVersions) {
        this.decodableVersions = decodableVersions;
    }

    public String getEncodingVersion() {
        return encodingVersion;
    }

    public void setEncodingVersion(final String encodingVersion) {
        this.encodingVersion = encodingVersion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiServerID,
                decodableVersions,
                encodingVersion);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServerStorageVersion)) {
            return false;
        }
        final ServerStorageVersion __otherCasted = (ServerStorageVersion) __other;
        return Objects.equals(apiServerID, __otherCasted.apiServerID) &&
            Objects.equals(decodableVersions, __otherCasted.decodableVersions) &&
            Objects.equals(encodingVersion, __otherCasted.encodingVersion);
    }

    public ServerStorageVersion apiServerID(final String apiServerID) {
        this.apiServerID = apiServerID;
        return this;
    }

    public ServerStorageVersion decodableVersions(final List<String> decodableVersions) {
        this.decodableVersions = decodableVersions;
        return this;
    }

    public ServerStorageVersion encodingVersion(final String encodingVersion) {
        this.encodingVersion = encodingVersion;
        return this;
    }

    @Override
    public ServerStorageVersion validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiServerID != null ? "\"apiServerID\":\"" +  JsonStrings.escapeJson(apiServerID) + "\"" : ""),
                    (decodableVersions != null ? "\"decodableVersions\":" + decodableVersions.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (encodingVersion != null ? "\"encodingVersion\":\"" +  JsonStrings.escapeJson(encodingVersion) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
