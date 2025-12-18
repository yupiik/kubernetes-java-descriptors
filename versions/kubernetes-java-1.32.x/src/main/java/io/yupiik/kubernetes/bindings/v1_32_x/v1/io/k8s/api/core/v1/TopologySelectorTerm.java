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
package io.yupiik.kubernetes.bindings.v1_32_x.v1;

import io.yupiik.kubernetes.bindings.v1_32_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_x.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.TopologySelectorTerm implements Validable<io.k8s.api.core.v1.TopologySelectorTerm>, Exportable {
    private List<TopologySelectorLabelRequirement> matchLabelExpressions;

    public io.k8s.api.core.v1.TopologySelectorTerm() {
        // no-op
    }

    public io.k8s.api.core.v1.TopologySelectorTerm(final List<TopologySelectorLabelRequirement> matchLabelExpressions) {
        this.matchLabelExpressions = matchLabelExpressions;
    }

    public List<TopologySelectorLabelRequirement> getMatchLabelExpressions() {
        return matchLabelExpressions;
    }

    public void setMatchLabelExpressions(final List<TopologySelectorLabelRequirement> matchLabelExpressions) {
        this.matchLabelExpressions = matchLabelExpressions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                matchLabelExpressions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.TopologySelectorTerm)) {
            return false;
        }
        final io.k8s.api.core.v1.TopologySelectorTerm __otherCasted = (io.k8s.api.core.v1.TopologySelectorTerm) __other;
        return Objects.equals(matchLabelExpressions, __otherCasted.matchLabelExpressions);
    }

    public io.k8s.api.core.v1.TopologySelectorTerm matchLabelExpressions(final List<TopologySelectorLabelRequirement> matchLabelExpressions) {
        this.matchLabelExpressions = matchLabelExpressions;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.TopologySelectorTerm validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (matchLabelExpressions != null ? "\"matchLabelExpressions\":" + matchLabelExpressions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
