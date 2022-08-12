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
package io.yupiik.kubernetes.bindings.v1_12_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_12_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_12_3.Validable;
import io.yupiik.kubernetes.bindings.v1_12_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class TopologySelectorTerm implements Validable<TopologySelectorTerm>, Exportable {
    private List<TopologySelectorLabelRequirement> matchLabelExpressions;

    public TopologySelectorTerm() {
        // no-op
    }

    public TopologySelectorTerm(final List<TopologySelectorLabelRequirement> matchLabelExpressions) {
        // no-op
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
        if (!(__other instanceof TopologySelectorTerm)) {
            return false;
        }
        final TopologySelectorTerm __otherCasted = (TopologySelectorTerm) __other;
        return Objects.equals(matchLabelExpressions, __otherCasted.matchLabelExpressions);
    }

    public TopologySelectorTerm matchLabelExpressions(final List<TopologySelectorLabelRequirement> matchLabelExpressions) {
        this.matchLabelExpressions = matchLabelExpressions;
        return this;
    }

    @Override
    public TopologySelectorTerm validate() {
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
