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
package io.yupiik.kubernetes.bindings.v1_34_x.v1;

import io.yupiik.kubernetes.bindings.v1_34_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_34_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_34_x.Validable;
import io.yupiik.kubernetes.bindings.v1_34_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.storage.v1.CSIStorageCapacity implements Validable<io.k8s.api.storage.v1.CSIStorageCapacity>, Exportable {
    private String apiVersion;
    private String capacity;
    private String kind;
    private String maximumVolumeSize;
    private ObjectMeta metadata;
    private LabelSelector nodeTopology;
    private String storageClassName;

    public io.k8s.api.storage.v1.CSIStorageCapacity() {
        // no-op
    }

    public io.k8s.api.storage.v1.CSIStorageCapacity(final String apiVersion,
                                                    final String capacity,
                                                    final String kind,
                                                    final String maximumVolumeSize,
                                                    final ObjectMeta metadata,
                                                    final LabelSelector nodeTopology,
                                                    final String storageClassName) {
        this.apiVersion = apiVersion;
        this.capacity = capacity;
        this.kind = kind;
        this.maximumVolumeSize = maximumVolumeSize;
        this.metadata = metadata;
        this.nodeTopology = nodeTopology;
        this.storageClassName = storageClassName;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(final String capacity) {
        this.capacity = capacity;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public String getMaximumVolumeSize() {
        return maximumVolumeSize;
    }

    public void setMaximumVolumeSize(final String maximumVolumeSize) {
        this.maximumVolumeSize = maximumVolumeSize;
    }

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public LabelSelector getNodeTopology() {
        return nodeTopology;
    }

    public void setNodeTopology(final LabelSelector nodeTopology) {
        this.nodeTopology = nodeTopology;
    }

    public String getStorageClassName() {
        return storageClassName;
    }

    public void setStorageClassName(final String storageClassName) {
        this.storageClassName = storageClassName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                capacity,
                kind,
                maximumVolumeSize,
                metadata,
                nodeTopology,
                storageClassName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.storage.v1.CSIStorageCapacity)) {
            return false;
        }
        final io.k8s.api.storage.v1.CSIStorageCapacity __otherCasted = (io.k8s.api.storage.v1.CSIStorageCapacity) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(capacity, __otherCasted.capacity) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(maximumVolumeSize, __otherCasted.maximumVolumeSize) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(nodeTopology, __otherCasted.nodeTopology) &&
            Objects.equals(storageClassName, __otherCasted.storageClassName);
    }

    public io.k8s.api.storage.v1.CSIStorageCapacity apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public io.k8s.api.storage.v1.CSIStorageCapacity capacity(final String capacity) {
        this.capacity = capacity;
        return this;
    }

    public io.k8s.api.storage.v1.CSIStorageCapacity kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public io.k8s.api.storage.v1.CSIStorageCapacity maximumVolumeSize(final String maximumVolumeSize) {
        this.maximumVolumeSize = maximumVolumeSize;
        return this;
    }

    public io.k8s.api.storage.v1.CSIStorageCapacity metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public io.k8s.api.storage.v1.CSIStorageCapacity nodeTopology(final LabelSelector nodeTopology) {
        this.nodeTopology = nodeTopology;
        return this;
    }

    public io.k8s.api.storage.v1.CSIStorageCapacity storageClassName(final String storageClassName) {
        this.storageClassName = storageClassName;
        return this;
    }

    @Override
    public io.k8s.api.storage.v1.CSIStorageCapacity validate() {
        if (kind == null) {
            kind = "CSIStorageCapacity";
        }
        if (apiVersion == null) {
            apiVersion = "storage.k8s.io/v1";
        }
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (storageClassName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "storageClassName", "storageClassName",
                "Missing 'storageClassName' attribute.", true));
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
                    (capacity != null ? "\"capacity\":\"" +  JsonStrings.escapeJson(capacity) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (maximumVolumeSize != null ? "\"maximumVolumeSize\":\"" +  JsonStrings.escapeJson(maximumVolumeSize) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (nodeTopology != null ? "\"nodeTopology\":" + nodeTopology.asJson() : ""),
                    (storageClassName != null ? "\"storageClassName\":\"" +  JsonStrings.escapeJson(storageClassName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
