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
package io.yupiik.kubernetes.bindings.v1_17_17.v1;

import io.yupiik.kubernetes.bindings.v1_17_17.Exportable;
import io.yupiik.kubernetes.bindings.v1_17_17.Validable;
import io.yupiik.kubernetes.bindings.v1_17_17.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class AggregationRule implements Validable<AggregationRule>, Exportable {
    private List<LabelSelector> clusterRoleSelectors;

    public AggregationRule() {
        // no-op
    }

    public AggregationRule(final List<LabelSelector> clusterRoleSelectors) {
        // no-op
    }

    public List<LabelSelector> getClusterRoleSelectors() {
        return clusterRoleSelectors;
    }

    public void setClusterRoleSelectors(final List<LabelSelector> clusterRoleSelectors) {
        this.clusterRoleSelectors = clusterRoleSelectors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                clusterRoleSelectors);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AggregationRule)) {
            return false;
        }
        final AggregationRule __otherCasted = (AggregationRule) __other;
        return Objects.equals(clusterRoleSelectors, __otherCasted.clusterRoleSelectors);
    }

    public AggregationRule clusterRoleSelectors(final List<LabelSelector> clusterRoleSelectors) {
        this.clusterRoleSelectors = clusterRoleSelectors;
        return this;
    }

    @Override
    public AggregationRule validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (clusterRoleSelectors != null ? "\"clusterRoleSelectors\":" + clusterRoleSelectors.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
