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
package io.yupiik.kubernetes.bindings.v1_30_x.v1;

import io.yupiik.kubernetes.bindings.v1_30_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_x.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.PodAntiAffinity implements Validable<io.k8s.api.core.v1.PodAntiAffinity>, Exportable {
    private List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution;
    private List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution;

    public io.k8s.api.core.v1.PodAntiAffinity() {
        // no-op
    }

    public io.k8s.api.core.v1.PodAntiAffinity(final List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution,
                                              final List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }

    public List<WeightedPodAffinityTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    public void setPreferredDuringSchedulingIgnoredDuringExecution(final List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }

    public List<PodAffinityTerm> getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    public void setRequiredDuringSchedulingIgnoredDuringExecution(final List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
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
        if (!(__other instanceof io.k8s.api.core.v1.PodAntiAffinity)) {
            return false;
        }
        final io.k8s.api.core.v1.PodAntiAffinity __otherCasted = (io.k8s.api.core.v1.PodAntiAffinity) __other;
        return Objects.equals(preferredDuringSchedulingIgnoredDuringExecution, __otherCasted.preferredDuringSchedulingIgnoredDuringExecution) &&
            Objects.equals(requiredDuringSchedulingIgnoredDuringExecution, __otherCasted.requiredDuringSchedulingIgnoredDuringExecution);
    }

    public io.k8s.api.core.v1.PodAntiAffinity preferredDuringSchedulingIgnoredDuringExecution(final List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        return this;
    }

    public io.k8s.api.core.v1.PodAntiAffinity requiredDuringSchedulingIgnoredDuringExecution(final List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.PodAntiAffinity validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (preferredDuringSchedulingIgnoredDuringExecution != null ? "\"preferredDuringSchedulingIgnoredDuringExecution\":" + preferredDuringSchedulingIgnoredDuringExecution.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (requiredDuringSchedulingIgnoredDuringExecution != null ? "\"requiredDuringSchedulingIgnoredDuringExecution\":" + requiredDuringSchedulingIgnoredDuringExecution.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
