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
package io.yupiik.kubernetes.bindings.v1_16_2.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_16_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_16_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_16_2.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Role implements Validable<Role>, Exportable {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private List<PolicyRule> rules;

    public Role() {
        // no-op
    }

    public Role(final String apiVersion,
                final String kind,
                final ObjectMeta metadata,
                final List<PolicyRule> rules) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.rules = rules;
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

    public List<PolicyRule> getRules() {
        return rules;
    }

    public void setRules(final List<PolicyRule> rules) {
        this.rules = rules;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                rules);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Role)) {
            return false;
        }
        final Role __otherCasted = (Role) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(rules, __otherCasted.rules);
    }

    public Role apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Role kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public Role metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Role rules(final List<PolicyRule> rules) {
        this.rules = rules;
        return this;
    }

    @Override
    public Role validate() {
        if (kind == null) {
            kind = "Role";
        }
        if (apiVersion == null) {
            apiVersion = "rbac.authorization.k8s.io/v1alpha1";
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (rules != null ? "\"rules\":" + rules.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
