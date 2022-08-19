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
package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import io.yupiik.kubernetes.bindings.v1_23_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_23_5.Validable;
import io.yupiik.kubernetes.bindings.v1_23_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class RoleBinding implements Validable<RoleBinding>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private RoleRef roleRef;
    private List<Subject> subjects;

    public RoleBinding() {
        // no-op
    }

    public RoleBinding(final String apiVersion,
                       final String kind,
                       final ObjectMeta metadata,
                       final RoleRef roleRef,
                       final List<Subject> subjects) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.roleRef = roleRef;
        this.subjects = subjects;
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

    public RoleRef getRoleRef() {
        return roleRef;
    }

    public void setRoleRef(final RoleRef roleRef) {
        this.roleRef = roleRef;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                roleRef,
                subjects);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RoleBinding)) {
            return false;
        }
        final RoleBinding __otherCasted = (RoleBinding) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(roleRef, __otherCasted.roleRef) &&
            Objects.equals(subjects, __otherCasted.subjects);
    }

    public RoleBinding apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public RoleBinding kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public RoleBinding metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public RoleBinding roleRef(final RoleRef roleRef) {
        this.roleRef = roleRef;
        return this;
    }

    public RoleBinding subjects(final List<Subject> subjects) {
        this.subjects = subjects;
        return this;
    }

    @Override
    public RoleBinding validate() {
        if (kind == null) {
            kind = "RoleBinding";
        }
        if (apiVersion == null) {
            apiVersion = "rbac.authorization.k8s.io/v1";
        }
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (roleRef == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "roleRef", "roleRef",
                "Missing 'roleRef' attribute.", true));
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
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (roleRef != null ? "\"roleRef\":" + roleRef.asJson() : ""),
                    (subjects != null ? "\"subjects\":" + subjects.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
