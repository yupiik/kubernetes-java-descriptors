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
package io.yupiik.kubernetes.bindings.v1_18_20.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_18_20.Exportable;
import io.yupiik.kubernetes.bindings.v1_18_20.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_18_20.Validable;
import io.yupiik.kubernetes.bindings.v1_18_20.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodPresetList implements Validable<PodPresetList>, Exportable {
    private String apiVersion;
    private List<PodPreset> items;
    private String kind;
    private ListMeta metadata;

    public PodPresetList() {
        // no-op
    }

    public PodPresetList(final String apiVersion,
                         final List<PodPreset> items,
                         final String kind,
                         final ListMeta metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<PodPreset> getItems() {
        return items;
    }

    public void setItems(final List<PodPreset> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ListMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ListMeta metadata) {
        this.metadata = metadata;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                items,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodPresetList)) {
            return false;
        }
        final PodPresetList __otherCasted = (PodPresetList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }

    public PodPresetList apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public PodPresetList items(final List<PodPreset> items) {
        this.items = items;
        return this;
    }

    public PodPresetList kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public PodPresetList metadata(final ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public PodPresetList validate() {
        if (kind == null) {
            kind = "PodPresetList";
        }
        if (apiVersion == null) {
            apiVersion = "settings.k8s.io/v1alpha1";
        }
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (items == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "items", "items",
                "Missing 'items' attribute.", true));
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
                    (items != null ? "\"items\":" + items.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
