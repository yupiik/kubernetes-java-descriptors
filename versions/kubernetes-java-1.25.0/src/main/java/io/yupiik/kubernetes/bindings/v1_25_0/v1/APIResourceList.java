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
package io.yupiik.kubernetes.bindings.v1_25_0.v1;

import io.yupiik.kubernetes.bindings.v1_25_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_25_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_25_0.Validable;
import io.yupiik.kubernetes.bindings.v1_25_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class APIResourceList implements Validable<APIResourceList>, Exportable {
    private String apiVersion;
    private String groupVersion;
    private String kind;
    private List<APIResource> resources;

    public APIResourceList() {
        // no-op
    }

    public APIResourceList(final String apiVersion,
                           final String groupVersion,
                           final String kind,
                           final List<APIResource> resources) {
        this.apiVersion = apiVersion;
        this.groupVersion = groupVersion;
        this.kind = kind;
        this.resources = resources;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getGroupVersion() {
        return groupVersion;
    }

    public void setGroupVersion(final String groupVersion) {
        this.groupVersion = groupVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public List<APIResource> getResources() {
        return resources;
    }

    public void setResources(final List<APIResource> resources) {
        this.resources = resources;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                groupVersion,
                kind,
                resources);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof APIResourceList)) {
            return false;
        }
        final APIResourceList __otherCasted = (APIResourceList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(groupVersion, __otherCasted.groupVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(resources, __otherCasted.resources);
    }

    public APIResourceList apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public APIResourceList groupVersion(final String groupVersion) {
        this.groupVersion = groupVersion;
        return this;
    }

    public APIResourceList kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public APIResourceList resources(final List<APIResource> resources) {
        this.resources = resources;
        return this;
    }

    @Override
    public APIResourceList validate() {
        if (kind == null) {
            kind = "APIResourceList";
        }
        if (apiVersion == null) {
            apiVersion = "v1";
        }
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (groupVersion == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "groupVersion", "groupVersion",
                "Missing 'groupVersion' attribute.", true));
        }
        if (resources == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "resources", "resources",
                "Missing 'resources' attribute.", true));
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
                    (groupVersion != null ? "\"groupVersion\":\"" +  JsonStrings.escapeJson(groupVersion) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (resources != null ? "\"resources\":" + resources.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
