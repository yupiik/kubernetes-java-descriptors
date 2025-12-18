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
package io.yupiik.kubernetes.bindings.v1_31_x.v1;

import io.yupiik.kubernetes.bindings.v1_31_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_x.Validable;
import jakarta.json.JsonObject;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.ResourceQuotaSpec implements Validable<io.k8s.api.core.v1.ResourceQuotaSpec>, Exportable {
    private JsonObject hard;
    private ScopeSelector scopeSelector;
    private List<String> scopes;

    public io.k8s.api.core.v1.ResourceQuotaSpec() {
        // no-op
    }

    public io.k8s.api.core.v1.ResourceQuotaSpec(final JsonObject hard,
                                                final ScopeSelector scopeSelector,
                                                final List<String> scopes) {
        this.hard = hard;
        this.scopeSelector = scopeSelector;
        this.scopes = scopes;
    }

    public JsonObject getHard() {
        return hard;
    }

    public void setHard(final JsonObject hard) {
        this.hard = hard;
    }

    public ScopeSelector getScopeSelector() {
        return scopeSelector;
    }

    public void setScopeSelector(final ScopeSelector scopeSelector) {
        this.scopeSelector = scopeSelector;
    }

    public List<String> getScopes() {
        return scopes;
    }

    public void setScopes(final List<String> scopes) {
        this.scopes = scopes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hard,
                scopeSelector,
                scopes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.ResourceQuotaSpec)) {
            return false;
        }
        final io.k8s.api.core.v1.ResourceQuotaSpec __otherCasted = (io.k8s.api.core.v1.ResourceQuotaSpec) __other;
        return Objects.equals(hard, __otherCasted.hard) &&
            Objects.equals(scopeSelector, __otherCasted.scopeSelector) &&
            Objects.equals(scopes, __otherCasted.scopes);
    }

    public io.k8s.api.core.v1.ResourceQuotaSpec hard(final JsonObject hard) {
        this.hard = hard;
        return this;
    }

    public io.k8s.api.core.v1.ResourceQuotaSpec scopeSelector(final ScopeSelector scopeSelector) {
        this.scopeSelector = scopeSelector;
        return this;
    }

    public io.k8s.api.core.v1.ResourceQuotaSpec scopes(final List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.ResourceQuotaSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (hard != null ? "\"hard\":" + hard : ""),
                    (scopeSelector != null ? "\"scopeSelector\":" + scopeSelector.asJson() : ""),
                    (scopes != null ? "\"scopes\":" + scopes.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
