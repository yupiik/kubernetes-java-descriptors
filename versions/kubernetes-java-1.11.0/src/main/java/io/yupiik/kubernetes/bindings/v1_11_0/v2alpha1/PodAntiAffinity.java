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
package io.yupiik.kubernetes.bindings.v1_11_0.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_11_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_11_0.Validable;
import io.yupiik.kubernetes.bindings.v1_11_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodAntiAffinity implements Validable<PodAntiAffinity>, Exportable {
    private List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution;
    private List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution;

    public PodAntiAffinity() {
        // no-op
    }

    public PodAntiAffinity(final List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution,
                           final List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
        // no-op
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
        if (!(__other instanceof PodAntiAffinity)) {
            return false;
        }
        final PodAntiAffinity __otherCasted = (PodAntiAffinity) __other;
        return Objects.equals(preferredDuringSchedulingIgnoredDuringExecution, __otherCasted.preferredDuringSchedulingIgnoredDuringExecution) &&
            Objects.equals(requiredDuringSchedulingIgnoredDuringExecution, __otherCasted.requiredDuringSchedulingIgnoredDuringExecution);
    }

    public PodAntiAffinity preferredDuringSchedulingIgnoredDuringExecution(final List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        return this;
    }

    public PodAntiAffinity requiredDuringSchedulingIgnoredDuringExecution(final List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
        return this;
    }

    @Override
    public PodAntiAffinity validate() {
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
