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
package io.yupiik.kubernetes.bindings.v1_18_4.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_18_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_18_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_18_4.Validable;
import io.yupiik.kubernetes.bindings.v1_18_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Subject implements Validable<Subject>, Exportable {
    private String apiVersion;
    private String kind;
    private String name;
    private String namespace;

    public Subject() {
        // no-op
    }

    public Subject(final String apiVersion,
                   final String kind,
                   final String name,
                   final String namespace) {
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

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(final String namespace) {
        this.namespace = namespace;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                name,
                namespace);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Subject)) {
            return false;
        }
        final Subject __otherCasted = (Subject) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace);
    }

    public Subject apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Subject kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public Subject name(final String name) {
        this.name = name;
        return this;
    }

    public Subject namespace(final String namespace) {
        this.namespace = namespace;
        return this;
    }

    @Override
    public Subject validate() {
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
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (namespace != null ? "\"namespace\":\"" +  JsonStrings.escapeJson(namespace) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
