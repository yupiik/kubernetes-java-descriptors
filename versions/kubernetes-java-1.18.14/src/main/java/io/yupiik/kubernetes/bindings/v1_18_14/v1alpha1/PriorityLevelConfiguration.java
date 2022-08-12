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
package io.yupiik.kubernetes.bindings.v1_18_14.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_18_14.Exportable;
import io.yupiik.kubernetes.bindings.v1_18_14.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_18_14.Validable;
import io.yupiik.kubernetes.bindings.v1_18_14.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PriorityLevelConfiguration implements Validable<PriorityLevelConfiguration>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private PriorityLevelConfigurationSpec spec;
    private PriorityLevelConfigurationStatus status;

    public PriorityLevelConfiguration() {
        // no-op
    }

    public PriorityLevelConfiguration(final String apiVersion,
                                      final String kind,
                                      final ObjectMeta metadata,
                                      final PriorityLevelConfigurationSpec spec,
                                      final PriorityLevelConfigurationStatus status) {
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public PriorityLevelConfigurationSpec getSpec() {
        return spec;
    }

    public void setSpec(final PriorityLevelConfigurationSpec spec) {
        this.spec = spec;
    }

    public PriorityLevelConfigurationStatus getStatus() {
        return status;
    }

    public void setStatus(final PriorityLevelConfigurationStatus status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec,
                status);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PriorityLevelConfiguration)) {
            return false;
        }
        final PriorityLevelConfiguration __otherCasted = (PriorityLevelConfiguration) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public PriorityLevelConfiguration apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public PriorityLevelConfiguration kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public PriorityLevelConfiguration metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public PriorityLevelConfiguration spec(final PriorityLevelConfigurationSpec spec) {
        this.spec = spec;
        return this;
    }

    public PriorityLevelConfiguration status(final PriorityLevelConfigurationStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public PriorityLevelConfiguration validate() {
        if (kind == null) {
            kind = "PriorityLevelConfiguration";
        }
        if (apiVersion == null) {
            apiVersion = "flowcontrol.apiserver.k8s.io/v1alpha1";
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (spec != null ? "\"spec\":" + spec.asJson() : ""),
                    (status != null ? "\"status\":" + status.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
