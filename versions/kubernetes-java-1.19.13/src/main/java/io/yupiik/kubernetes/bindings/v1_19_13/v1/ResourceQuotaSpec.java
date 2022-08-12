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
package io.yupiik.kubernetes.bindings.v1_19_13.v1;

import io.yupiik.kubernetes.bindings.v1_19_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_19_13.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_19_13.Validable;
import io.yupiik.kubernetes.bindings.v1_19_13.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceQuotaSpec implements Validable<ResourceQuotaSpec>, Exportable {
    private JsonObject hard;
    private ScopeSelector scopeSelector;
    private List<String> scopes;

    public ResourceQuotaSpec() {
        // no-op
    }

    public ResourceQuotaSpec(final JsonObject hard,
                             final ScopeSelector scopeSelector,
                             final List<String> scopes) {
        // no-op
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
        if (!(__other instanceof ResourceQuotaSpec)) {
            return false;
        }
        final ResourceQuotaSpec __otherCasted = (ResourceQuotaSpec) __other;
        return Objects.equals(hard, __otherCasted.hard) &&
            Objects.equals(scopeSelector, __otherCasted.scopeSelector) &&
            Objects.equals(scopes, __otherCasted.scopes);
    }

    public ResourceQuotaSpec hard(final JsonObject hard) {
        this.hard = hard;
        return this;
    }

    public ResourceQuotaSpec scopeSelector(final ScopeSelector scopeSelector) {
        this.scopeSelector = scopeSelector;
        return this;
    }

    public ResourceQuotaSpec scopes(final List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    @Override
    public ResourceQuotaSpec validate() {
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
