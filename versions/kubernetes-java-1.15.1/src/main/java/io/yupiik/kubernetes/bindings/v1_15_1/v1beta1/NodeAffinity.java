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
package io.yupiik.kubernetes.bindings.v1_15_1.v1beta1;

import io.yupiik.kubernetes.bindings.v1_15_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_15_1.Validable;
import io.yupiik.kubernetes.bindings.v1_15_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NodeAffinity implements Validable<NodeAffinity>, Exportable {
    private List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution;
    private NodeSelector requiredDuringSchedulingIgnoredDuringExecution;

    public NodeAffinity() {
        // no-op
    }

    public NodeAffinity(final List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution,
                        final NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
        // no-op
    }

    public List<PreferredSchedulingTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    public void setPreferredDuringSchedulingIgnoredDuringExecution(final List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }

    public NodeSelector getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    public void setRequiredDuringSchedulingIgnoredDuringExecution(final NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                preferredDuringSchedulingIgnoredDuringExecution,
                requiredDuringSchedulingIgnoredDuringExecution);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeAffinity)) {
            return false;
        }
        final NodeAffinity __otherCasted = (NodeAffinity) __other;
        return Objects.equals(preferredDuringSchedulingIgnoredDuringExecution, __otherCasted.preferredDuringSchedulingIgnoredDuringExecution) &&
            Objects.equals(requiredDuringSchedulingIgnoredDuringExecution, __otherCasted.requiredDuringSchedulingIgnoredDuringExecution);
    }

    public NodeAffinity preferredDuringSchedulingIgnoredDuringExecution(final List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        return this;
    }

    public NodeAffinity requiredDuringSchedulingIgnoredDuringExecution(final NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
        return this;
    }

    @Override
    public NodeAffinity validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (preferredDuringSchedulingIgnoredDuringExecution != null ? "\"preferredDuringSchedulingIgnoredDuringExecution\":" + preferredDuringSchedulingIgnoredDuringExecution.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (requiredDuringSchedulingIgnoredDuringExecution != null ? "\"requiredDuringSchedulingIgnoredDuringExecution\":" + requiredDuringSchedulingIgnoredDuringExecution.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
