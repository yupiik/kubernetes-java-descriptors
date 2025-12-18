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
package io.yupiik.kubernetes.bindings.v1_28_x.v1;

import io.yupiik.kubernetes.bindings.v1_28_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_28_x.Validable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.node.v1.Scheduling implements Validable<io.k8s.api.node.v1.Scheduling>, Exportable {
    private Map<String, String> nodeSelector;
    private List<Toleration> tolerations;

    public io.k8s.api.node.v1.Scheduling() {
        // no-op
    }

    public io.k8s.api.node.v1.Scheduling(final Map<String, String> nodeSelector,
                                         final List<Toleration> tolerations) {
        this.nodeSelector = nodeSelector;
        this.tolerations = tolerations;
    }

    public Map<String, String> getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(final Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    public List<Toleration> getTolerations() {
        return tolerations;
    }

    public void setTolerations(final List<Toleration> tolerations) {
        this.tolerations = tolerations;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nodeSelector,
                tolerations);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.node.v1.Scheduling)) {
            return false;
        }
        final io.k8s.api.node.v1.Scheduling __otherCasted = (io.k8s.api.node.v1.Scheduling) __other;
        return Objects.equals(nodeSelector, __otherCasted.nodeSelector) &&
            Objects.equals(tolerations, __otherCasted.tolerations);
    }

    public io.k8s.api.node.v1.Scheduling nodeSelector(final Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }

    public io.k8s.api.node.v1.Scheduling tolerations(final List<Toleration> tolerations) {
        this.tolerations = tolerations;
        return this;
    }

    @Override
    public io.k8s.api.node.v1.Scheduling validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (nodeSelector != null ? "\"nodeSelector\":" + nodeSelector.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""),
                    (tolerations != null ? "\"tolerations\":" + tolerations.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
