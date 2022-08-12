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
package io.yupiik.kubernetes.bindings.v1_22_0.v1;

import io.yupiik.kubernetes.bindings.v1_22_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_0.Validable;
import io.yupiik.kubernetes.bindings.v1_22_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ReplicaSetStatus implements Validable<ReplicaSetStatus>, Exportable {
    private Integer availableReplicas;
    private List<ReplicaSetCondition> conditions;
    private Integer fullyLabeledReplicas;
    private Integer observedGeneration;
    private Integer readyReplicas;
    private int replicas;

    public ReplicaSetStatus() {
        // no-op
    }

    public ReplicaSetStatus(final Integer availableReplicas,
                            final List<ReplicaSetCondition> conditions,
                            final Integer fullyLabeledReplicas,
                            final Integer observedGeneration,
                            final Integer readyReplicas,
                            final int replicas) {
        // no-op
    }

    public Integer getAvailableReplicas() {
        return availableReplicas;
    }

    public void setAvailableReplicas(final Integer availableReplicas) {
        this.availableReplicas = availableReplicas;
    }

    public List<ReplicaSetCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<ReplicaSetCondition> conditions) {
        this.conditions = conditions;
    }

    public Integer getFullyLabeledReplicas() {
        return fullyLabeledReplicas;
    }

    public void setFullyLabeledReplicas(final Integer fullyLabeledReplicas) {
        this.fullyLabeledReplicas = fullyLabeledReplicas;
    }

    public Integer getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    public Integer getReadyReplicas() {
        return readyReplicas;
    }

    public void setReadyReplicas(final Integer readyReplicas) {
        this.readyReplicas = readyReplicas;
    }

    public int getReplicas() {
        return replicas;
    }

    public void setReplicas(final int replicas) {
        this.replicas = replicas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                availableReplicas,
                conditions,
                fullyLabeledReplicas,
                observedGeneration,
                readyReplicas,
                replicas);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicaSetStatus)) {
            return false;
        }
        final ReplicaSetStatus __otherCasted = (ReplicaSetStatus) __other;
        return Objects.equals(availableReplicas, __otherCasted.availableReplicas) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(fullyLabeledReplicas, __otherCasted.fullyLabeledReplicas) &&
            Objects.equals(observedGeneration, __otherCasted.observedGeneration) &&
            Objects.equals(readyReplicas, __otherCasted.readyReplicas) &&
            Objects.equals(replicas, __otherCasted.replicas);
    }

    public ReplicaSetStatus availableReplicas(final Integer availableReplicas) {
        this.availableReplicas = availableReplicas;
        return this;
    }

    public ReplicaSetStatus conditions(final List<ReplicaSetCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public ReplicaSetStatus fullyLabeledReplicas(final Integer fullyLabeledReplicas) {
        this.fullyLabeledReplicas = fullyLabeledReplicas;
        return this;
    }

    public ReplicaSetStatus observedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    public ReplicaSetStatus readyReplicas(final Integer readyReplicas) {
        this.readyReplicas = readyReplicas;
        return this;
    }

    public ReplicaSetStatus replicas(final int replicas) {
        this.replicas = replicas;
        return this;
    }

    @Override
    public ReplicaSetStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (availableReplicas != null ? "\"availableReplicas\":" + availableReplicas : ""),
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (fullyLabeledReplicas != null ? "\"fullyLabeledReplicas\":" + fullyLabeledReplicas : ""),
                    (observedGeneration != null ? "\"observedGeneration\":" + observedGeneration : ""),
                    (readyReplicas != null ? "\"readyReplicas\":" + readyReplicas : ""),
                    "\"replicas\":" + replicas)
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
