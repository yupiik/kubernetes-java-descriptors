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
package io.yupiik.kubernetes.bindings.v1_12_4.v2beta1;

import io.yupiik.kubernetes.bindings.v1_12_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_12_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_12_4.Validable;
import io.yupiik.kubernetes.bindings.v1_12_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CrossVersionObjectReference implements Validable<CrossVersionObjectReference>, Exportable {
    private String apiVersion;
    private String kind;
    private String name;

    public CrossVersionObjectReference() {
        // no-op
    }

    public CrossVersionObjectReference(final String apiVersion,
                                       final String kind,
                                       final String name) {
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

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CrossVersionObjectReference)) {
            return false;
        }
        final CrossVersionObjectReference __otherCasted = (CrossVersionObjectReference) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name);
    }

    public CrossVersionObjectReference apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public CrossVersionObjectReference kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public CrossVersionObjectReference name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public CrossVersionObjectReference validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (kind == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "kind", "kind",
                "Missing 'kind' attribute.", true));
        }
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
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
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
