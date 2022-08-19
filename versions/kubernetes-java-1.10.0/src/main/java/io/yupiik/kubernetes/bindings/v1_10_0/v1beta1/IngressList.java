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
package io.yupiik.kubernetes.bindings.v1_10_0.v1beta1;

import io.yupiik.kubernetes.bindings.v1_10_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_10_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_10_0.Validable;
import io.yupiik.kubernetes.bindings.v1_10_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class IngressList implements Validable<IngressList>, Exportable {
    private String apiVersion;
    private List<Ingress> items;
    private String kind;
    private ListMeta metadata;

    public IngressList() {
        // no-op
    }

    public IngressList(final String apiVersion,
                       final List<Ingress> items,
                       final String kind,
                       final ListMeta metadata) {
        this.apiVersion = apiVersion;
        this.items = items;
        this.kind = kind;
        this.metadata = metadata;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<Ingress> getItems() {
        return items;
    }

    public void setItems(final List<Ingress> items) {
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
        if (!(__other instanceof IngressList)) {
            return false;
        }
        final IngressList __otherCasted = (IngressList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }

    public IngressList apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public IngressList items(final List<Ingress> items) {
        this.items = items;
        return this;
    }

    public IngressList kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public IngressList metadata(final ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public IngressList validate() {
        if (kind == null) {
            kind = "IngressList";
        }
        if (apiVersion == null) {
            apiVersion = "extensions/v1beta1";
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
