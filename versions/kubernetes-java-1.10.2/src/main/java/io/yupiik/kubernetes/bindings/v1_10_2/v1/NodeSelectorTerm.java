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
package io.yupiik.kubernetes.bindings.v1_10_2.v1;

import io.yupiik.kubernetes.bindings.v1_10_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_10_2.Validable;
import io.yupiik.kubernetes.bindings.v1_10_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NodeSelectorTerm implements Validable<NodeSelectorTerm>, Exportable {
    private List<NodeSelectorRequirement> matchExpressions;

    public NodeSelectorTerm() {
        // no-op
    }

    public NodeSelectorTerm(final List<NodeSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    public List<NodeSelectorRequirement> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<NodeSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                matchExpressions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeSelectorTerm)) {
            return false;
        }
        final NodeSelectorTerm __otherCasted = (NodeSelectorTerm) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions);
    }

    public NodeSelectorTerm matchExpressions(final List<NodeSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
        return this;
    }

    @Override
    public NodeSelectorTerm validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (matchExpressions == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "matchExpressions", "matchExpressions",
                "Missing 'matchExpressions' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (matchExpressions != null ? "\"matchExpressions\":" + matchExpressions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
