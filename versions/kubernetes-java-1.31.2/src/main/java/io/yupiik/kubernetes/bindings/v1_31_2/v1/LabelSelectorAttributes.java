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
package io.yupiik.kubernetes.bindings.v1_31_2.v1;

import io.yupiik.kubernetes.bindings.v1_31_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_2.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class LabelSelectorAttributes implements Validable<LabelSelectorAttributes>, Exportable {
    private String rawSelector;
    private List<LabelSelectorRequirement> requirements;

    public LabelSelectorAttributes() {
        // no-op
    }

    public LabelSelectorAttributes(final String rawSelector,
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
        if (!(__other instanceof LabelSelectorAttributes)) {
            return false;
        }
        final LabelSelectorAttributes __otherCasted = (LabelSelectorAttributes) __other;
        return Objects.equals(rawSelector, __otherCasted.rawSelector) &&
            Objects.equals(requirements, __otherCasted.requirements);
    }

    public LabelSelectorAttributes rawSelector(final String rawSelector) {
        this.rawSelector = rawSelector;
        return this;
    }

    public LabelSelectorAttributes requirements(final List<LabelSelectorRequirement> requirements) {
        this.requirements = requirements;
        return this;
    }

    @Override
    public LabelSelectorAttributes validate() {
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
