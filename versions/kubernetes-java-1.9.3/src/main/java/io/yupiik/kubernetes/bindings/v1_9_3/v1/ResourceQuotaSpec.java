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
package io.yupiik.kubernetes.bindings.v1_9_3.v1;

import io.yupiik.kubernetes.bindings.v1_9_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_9_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_9_3.Validable;
import jakarta.json.JsonObject;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceQuotaSpec implements Validable<ResourceQuotaSpec>, Exportable {
    private JsonObject hard;
    private List<String> scopes;

    public ResourceQuotaSpec() {
        // no-op
    }

    public ResourceQuotaSpec(final JsonObject hard,
                             final List<String> scopes) {
        this.hard = hard;
        this.scopes = scopes;
    }

    public JsonObject getHard() {
        return hard;
    }

    public void setHard(final JsonObject hard) {
        this.hard = hard;
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
                scopes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceQuotaSpec)) {
            return false;
        }
        final ResourceQuotaSpec __otherCasted = (ResourceQuotaSpec) __other;
        return Objects.equals(hard, __otherCasted.hard) &&
            Objects.equals(scopes, __otherCasted.scopes);
    }

    public ResourceQuotaSpec hard(final JsonObject hard) {
        this.hard = hard;
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
                    (scopes != null ? "\"scopes\":" + scopes.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
