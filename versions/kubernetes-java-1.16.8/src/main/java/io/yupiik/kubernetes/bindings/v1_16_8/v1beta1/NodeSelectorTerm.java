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
package io.yupiik.kubernetes.bindings.v1_16_8.v1beta1;

import io.yupiik.kubernetes.bindings.v1_16_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_16_8.Validable;
import io.yupiik.kubernetes.bindings.v1_16_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NodeSelectorTerm implements Validable<NodeSelectorTerm>, Exportable {
    private List<NodeSelectorRequirement> matchExpressions;
    private List<NodeSelectorRequirement> matchFields;

    public NodeSelectorTerm() {
        // no-op
    }

    public NodeSelectorTerm(final List<NodeSelectorRequirement> matchExpressions,
                            final List<NodeSelectorRequirement> matchFields) {
        // no-op
    }

    public List<NodeSelectorRequirement> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<NodeSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    public List<NodeSelectorRequirement> getMatchFields() {
        return matchFields;
    }

    public void setMatchFields(final List<NodeSelectorRequirement> matchFields) {
        this.matchFields = matchFields;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                matchExpressions,
                matchFields);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeSelectorTerm)) {
            return false;
        }
        final NodeSelectorTerm __otherCasted = (NodeSelectorTerm) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions) &&
            Objects.equals(matchFields, __otherCasted.matchFields);
    }

    public NodeSelectorTerm matchExpressions(final List<NodeSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
        return this;
    }

    public NodeSelectorTerm matchFields(final List<NodeSelectorRequirement> matchFields) {
        this.matchFields = matchFields;
        return this;
    }

    @Override
    public NodeSelectorTerm validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (matchExpressions != null ? "\"matchExpressions\":" + matchExpressions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (matchFields != null ? "\"matchFields\":" + matchFields.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
