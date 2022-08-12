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
package io.yupiik.kubernetes.bindings.v1_21_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_21_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_21_3.Validable;
import io.yupiik.kubernetes.bindings.v1_21_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourcePolicyRule implements Validable<ResourcePolicyRule>, Exportable {
    private List<String> apiGroups;
    private Boolean clusterScope;
    private List<String> namespaces;
    private List<String> resources;
    private List<String> verbs;

    public ResourcePolicyRule() {
        // no-op
    }

    public ResourcePolicyRule(final List<String> apiGroups,
                              final Boolean clusterScope,
                              final List<String> namespaces,
                              final List<String> resources,
                              final List<String> verbs) {
        // no-op
    }

    public List<String> getApiGroups() {
        return apiGroups;
    }

    public void setApiGroups(final List<String> apiGroups) {
        this.apiGroups = apiGroups;
    }

    public Boolean getClusterScope() {
        return clusterScope;
    }

    public void setClusterScope(final Boolean clusterScope) {
        this.clusterScope = clusterScope;
    }

    public List<String> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(final List<String> namespaces) {
        this.namespaces = namespaces;
    }

    public List<String> getResources() {
        return resources;
    }

    public void setResources(final List<String> resources) {
        this.resources = resources;
    }

    public List<String> getVerbs() {
        return verbs;
    }

    public void setVerbs(final List<String> verbs) {
        this.verbs = verbs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiGroups,
                clusterScope,
                namespaces,
                resources,
                verbs);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourcePolicyRule)) {
            return false;
        }
        final ResourcePolicyRule __otherCasted = (ResourcePolicyRule) __other;
        return Objects.equals(apiGroups, __otherCasted.apiGroups) &&
            Objects.equals(clusterScope, __otherCasted.clusterScope) &&
            Objects.equals(namespaces, __otherCasted.namespaces) &&
            Objects.equals(resources, __otherCasted.resources) &&
            Objects.equals(verbs, __otherCasted.verbs);
    }

    public ResourcePolicyRule apiGroups(final List<String> apiGroups) {
        this.apiGroups = apiGroups;
        return this;
    }

    public ResourcePolicyRule clusterScope(final Boolean clusterScope) {
        this.clusterScope = clusterScope;
        return this;
    }

    public ResourcePolicyRule namespaces(final List<String> namespaces) {
        this.namespaces = namespaces;
        return this;
    }

    public ResourcePolicyRule resources(final List<String> resources) {
        this.resources = resources;
        return this;
    }

    public ResourcePolicyRule verbs(final List<String> verbs) {
        this.verbs = verbs;
        return this;
    }

    @Override
    public ResourcePolicyRule validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (apiGroups == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "apiGroups", "apiGroups",
                "Missing 'apiGroups' attribute.", true));
        }
        if (resources == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "resources", "resources",
                "Missing 'resources' attribute.", true));
        }
        if (verbs == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "verbs", "verbs",
                "Missing 'verbs' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiGroups != null ? "\"apiGroups\":" + apiGroups.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (clusterScope != null ? "\"clusterScope\":" + clusterScope : ""),
                    (namespaces != null ? "\"namespaces\":" + namespaces.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (resources != null ? "\"resources\":" + resources.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (verbs != null ? "\"verbs\":" + verbs.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
