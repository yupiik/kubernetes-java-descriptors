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
package io.yupiik.kubernetes.bindings.v1_34_x.v1;

import io.yupiik.kubernetes.bindings.v1_34_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_34_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_34_x.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.authorization.v1.LabelSelectorAttributes implements Validable<io.k8s.api.authorization.v1.LabelSelectorAttributes>, Exportable {
    private String rawSelector;
    private List<LabelSelectorRequirement> requirements;

    public io.k8s.api.authorization.v1.LabelSelectorAttributes() {
        // no-op
    }

    public io.k8s.api.authorization.v1.LabelSelectorAttributes(final String rawSelector,
                                                               final List<LabelSelectorRequirement> requirements) {
        this.rawSelector = rawSelector;
        this.requirements = requirements;
    }

    public String getRawSelector() {
        return rawSelector;
    }

    public void setRawSelector(final String rawSelector) {
        this.rawSelector = rawSelector;
    }

    public List<LabelSelectorRequirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(final List<LabelSelectorRequirement> requirements) {
        this.requirements = requirements;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                rawSelector,
                requirements);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.authorization.v1.LabelSelectorAttributes)) {
            return false;
        }
        final io.k8s.api.authorization.v1.LabelSelectorAttributes __otherCasted = (io.k8s.api.authorization.v1.LabelSelectorAttributes) __other;
        return Objects.equals(rawSelector, __otherCasted.rawSelector) &&
            Objects.equals(requirements, __otherCasted.requirements);
    }

    public io.k8s.api.authorization.v1.LabelSelectorAttributes rawSelector(final String rawSelector) {
        this.rawSelector = rawSelector;
        return this;
    }

    public io.k8s.api.authorization.v1.LabelSelectorAttributes requirements(final List<LabelSelectorRequirement> requirements) {
        this.requirements = requirements;
        return this;
    }

    @Override
    public io.k8s.api.authorization.v1.LabelSelectorAttributes validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (rawSelector != null ? "\"rawSelector\":\"" +  JsonStrings.escapeJson(rawSelector) + "\"" : ""),
                    (requirements != null ? "\"requirements\":" + requirements.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
