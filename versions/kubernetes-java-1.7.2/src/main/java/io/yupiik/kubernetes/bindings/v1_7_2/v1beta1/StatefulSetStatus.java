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
package io.yupiik.kubernetes.bindings.v1_7_2.v1beta1;

import io.yupiik.kubernetes.bindings.v1_7_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_7_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_7_2.Validable;
import io.yupiik.kubernetes.bindings.v1_7_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class StatefulSetStatus implements Validable<StatefulSetStatus>, Exportable {
    private Integer currentReplicas;
    private String currentRevision;
    private Integer observedGeneration;
    private Integer readyReplicas;
    private int replicas;
    private String updateRevision;
    private Integer updatedReplicas;

    public StatefulSetStatus() {
        // no-op
    }

    public StatefulSetStatus(final Integer currentReplicas,
                             final String currentRevision,
                             final Integer observedGeneration,
                             final Integer readyReplicas,
                             final int replicas,
                             final String updateRevision,
                             final Integer updatedReplicas) {
        // no-op
    }

    public Integer getCurrentReplicas() {
        return currentReplicas;
    }

    public void setCurrentReplicas(final Integer currentReplicas) {
        this.currentReplicas = currentReplicas;
    }

    public String getCurrentRevision() {
        return currentRevision;
    }

    public void setCurrentRevision(final String currentRevision) {
        this.currentRevision = currentRevision;
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

    public String getUpdateRevision() {
        return updateRevision;
    }

    public void setUpdateRevision(final String updateRevision) {
        this.updateRevision = updateRevision;
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
                currentReplicas,
                currentRevision,
                observedGeneration,
                readyReplicas,
                replicas,
                updateRevision,
                updatedReplicas);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetStatus)) {
            return false;
        }
        final StatefulSetStatus __otherCasted = (StatefulSetStatus) __other;
        return Objects.equals(currentReplicas, __otherCasted.currentReplicas) &&
            Objects.equals(currentRevision, __otherCasted.currentRevision) &&
            Objects.equals(observedGeneration, __otherCasted.observedGeneration) &&
            Objects.equals(readyReplicas, __otherCasted.readyReplicas) &&
            Objects.equals(replicas, __otherCasted.replicas) &&
            Objects.equals(updateRevision, __otherCasted.updateRevision) &&
            Objects.equals(updatedReplicas, __otherCasted.updatedReplicas);
    }

    public StatefulSetStatus currentReplicas(final Integer currentReplicas) {
        this.currentReplicas = currentReplicas;
        return this;
    }

    public StatefulSetStatus currentRevision(final String currentRevision) {
        this.currentRevision = currentRevision;
        return this;
    }

    public StatefulSetStatus observedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    public StatefulSetStatus readyReplicas(final Integer readyReplicas) {
        this.readyReplicas = readyReplicas;
        return this;
    }

    public StatefulSetStatus replicas(final int replicas) {
        this.replicas = replicas;
        return this;
    }

    public StatefulSetStatus updateRevision(final String updateRevision) {
        this.updateRevision = updateRevision;
        return this;
    }

    public StatefulSetStatus updatedReplicas(final Integer updatedReplicas) {
        this.updatedReplicas = updatedReplicas;
        return this;
    }

    @Override
    public StatefulSetStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (currentReplicas != null ? "\"currentReplicas\":" + currentReplicas : ""),
                    (currentRevision != null ? "\"currentRevision\":\"" +  JsonStrings.escapeJson(currentRevision) + "\"" : ""),
                    (observedGeneration != null ? "\"observedGeneration\":" + observedGeneration : ""),
                    (readyReplicas != null ? "\"readyReplicas\":" + readyReplicas : ""),
                    "\"replicas\":" + replicas,
                    (updateRevision != null ? "\"updateRevision\":\"" +  JsonStrings.escapeJson(updateRevision) + "\"" : ""),
                    (updatedReplicas != null ? "\"updatedReplicas\":" + updatedReplicas : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
