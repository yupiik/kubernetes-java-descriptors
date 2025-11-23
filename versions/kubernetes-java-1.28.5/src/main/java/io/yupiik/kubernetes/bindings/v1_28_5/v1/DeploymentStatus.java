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
package io.yupiik.kubernetes.bindings.v1_28_5.v1;

import io.yupiik.kubernetes.bindings.v1_28_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_5.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeploymentStatus implements Validable<DeploymentStatus>, Exportable {
    private Integer availableReplicas;
    private Integer collisionCount;
    private List<DeploymentCondition> conditions;
    private Integer observedGeneration;
    private Integer readyReplicas;
    private Integer replicas;
    private Integer unavailableReplicas;
    private Integer updatedReplicas;

    public DeploymentStatus() {
        // no-op
    }

    public DeploymentStatus(final Integer availableReplicas,
                            final Integer collisionCount,
                            final List<DeploymentCondition> conditions,
                            final Integer observedGeneration,
                            final Integer readyReplicas,
                            final Integer replicas,
                            final Integer unavailableReplicas,
                            final Integer updatedReplicas) {
        this.availableReplicas = availableReplicas;
        this.collisionCount = collisionCount;
        this.conditions = conditions;
        this.observedGeneration = observedGeneration;
        this.readyReplicas = readyReplicas;
        this.replicas = replicas;
        this.unavailableReplicas = unavailableReplicas;
        this.updatedReplicas = updatedReplicas;
    }

    public Integer getAvailableReplicas() {
        return availableReplicas;
    }

    public void setAvailableReplicas(final Integer availableReplicas) {
        this.availableReplicas = availableReplicas;
    }

    public Integer getCollisionCount() {
        return collisionCount;
    }

    public void setCollisionCount(final Integer collisionCount) {
        this.collisionCount = collisionCount;
    }

    public List<DeploymentCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<DeploymentCondition> conditions) {
        this.conditions = conditions;
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

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(final Integer replicas) {
        this.replicas = replicas;
    }

    public Integer getUnavailableReplicas() {
        return unavailableReplicas;
    }

    public void setUnavailableReplicas(final Integer unavailableReplicas) {
        this.unavailableReplicas = unavailableReplicas;
    }

    public Integer getUpdatedReplicas() {
        return updatedReplicas;
    }

    public void setUpdatedReplicas(final Integer updatedReplicas) {
        this.updatedReplicas = updatedReplicas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                availableReplicas,
                collisionCount,
                conditions,
                observedGeneration,
                readyReplicas,
                replicas,
                unavailableReplicas,
                updatedReplicas);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentStatus)) {
            return false;
        }
        final DeploymentStatus __otherCasted = (DeploymentStatus) __other;
        return Objects.equals(availableReplicas, __otherCasted.availableReplicas) &&
            Objects.equals(collisionCount, __otherCasted.collisionCount) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(observedGeneration, __otherCasted.observedGeneration) &&
            Objects.equals(readyReplicas, __otherCasted.readyReplicas) &&
            Objects.equals(replicas, __otherCasted.replicas) &&
            Objects.equals(unavailableReplicas, __otherCasted.unavailableReplicas) &&
            Objects.equals(updatedReplicas, __otherCasted.updatedReplicas);
    }

    public DeploymentStatus availableReplicas(final Integer availableReplicas) {
        this.availableReplicas = availableReplicas;
        return this;
    }

    public DeploymentStatus collisionCount(final Integer collisionCount) {
        this.collisionCount = collisionCount;
        return this;
    }

    public DeploymentStatus conditions(final List<DeploymentCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public DeploymentStatus observedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    public DeploymentStatus readyReplicas(final Integer readyReplicas) {
        this.readyReplicas = readyReplicas;
        return this;
    }

    public DeploymentStatus replicas(final Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    public DeploymentStatus unavailableReplicas(final Integer unavailableReplicas) {
        this.unavailableReplicas = unavailableReplicas;
        return this;
    }

    public DeploymentStatus updatedReplicas(final Integer updatedReplicas) {
        this.updatedReplicas = updatedReplicas;
        return this;
    }

    @Override
    public DeploymentStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (availableReplicas != null ? "\"availableReplicas\":" + availableReplicas : ""),
                    (collisionCount != null ? "\"collisionCount\":" + collisionCount : ""),
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (observedGeneration != null ? "\"observedGeneration\":" + observedGeneration : ""),
                    (readyReplicas != null ? "\"readyReplicas\":" + readyReplicas : ""),
                    (replicas != null ? "\"replicas\":" + replicas : ""),
                    (unavailableReplicas != null ? "\"unavailableReplicas\":" + unavailableReplicas : ""),
                    (updatedReplicas != null ? "\"updatedReplicas\":" + updatedReplicas : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
