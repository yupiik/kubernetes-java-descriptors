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
package io.yupiik.kubernetes.bindings.v1_17_15.v1beta1;

import io.yupiik.kubernetes.bindings.v1_17_15.Exportable;
import io.yupiik.kubernetes.bindings.v1_17_15.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DaemonSetStatus implements Validable<DaemonSetStatus>, Exportable {
    private Integer collisionCount;
    private List<DaemonSetCondition> conditions;
    private int currentNumberScheduled;
    private int desiredNumberScheduled;
    private Integer numberAvailable;
    private int numberMisscheduled;
    private int numberReady;
    private Integer numberUnavailable;
    private Integer observedGeneration;
    private Integer updatedNumberScheduled;

    public DaemonSetStatus() {
        // no-op
    }

    public DaemonSetStatus(final Integer collisionCount,
                           final List<DaemonSetCondition> conditions,
                           final int currentNumberScheduled,
                           final int desiredNumberScheduled,
                           final Integer numberAvailable,
                           final int numberMisscheduled,
                           final int numberReady,
                           final Integer numberUnavailable,
                           final Integer observedGeneration,
                           final Integer updatedNumberScheduled) {
        this.collisionCount = collisionCount;
        this.conditions = conditions;
        this.currentNumberScheduled = currentNumberScheduled;
        this.desiredNumberScheduled = desiredNumberScheduled;
        this.numberAvailable = numberAvailable;
        this.numberMisscheduled = numberMisscheduled;
        this.numberReady = numberReady;
        this.numberUnavailable = numberUnavailable;
        this.observedGeneration = observedGeneration;
        this.updatedNumberScheduled = updatedNumberScheduled;
    }

    public Integer getCollisionCount() {
        return collisionCount;
    }

    public void setCollisionCount(final Integer collisionCount) {
        this.collisionCount = collisionCount;
    }

    public List<DaemonSetCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<DaemonSetCondition> conditions) {
        this.conditions = conditions;
    }

    public int getCurrentNumberScheduled() {
        return currentNumberScheduled;
    }

    public void setCurrentNumberScheduled(final int currentNumberScheduled) {
        this.currentNumberScheduled = currentNumberScheduled;
    }

    public int getDesiredNumberScheduled() {
        return desiredNumberScheduled;
    }

    public void setDesiredNumberScheduled(final int desiredNumberScheduled) {
        this.desiredNumberScheduled = desiredNumberScheduled;
    }

    public Integer getNumberAvailable() {
        return numberAvailable;
    }

    public void setNumberAvailable(final Integer numberAvailable) {
        this.numberAvailable = numberAvailable;
    }

    public int getNumberMisscheduled() {
        return numberMisscheduled;
    }

    public void setNumberMisscheduled(final int numberMisscheduled) {
        this.numberMisscheduled = numberMisscheduled;
    }

    public int getNumberReady() {
        return numberReady;
    }

    public void setNumberReady(final int numberReady) {
        this.numberReady = numberReady;
    }

    public Integer getNumberUnavailable() {
        return numberUnavailable;
    }

    public void setNumberUnavailable(final Integer numberUnavailable) {
        this.numberUnavailable = numberUnavailable;
    }

    public Integer getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    public Integer getUpdatedNumberScheduled() {
        return updatedNumberScheduled;
    }

    public void setUpdatedNumberScheduled(final Integer updatedNumberScheduled) {
        this.updatedNumberScheduled = updatedNumberScheduled;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                collisionCount,
                conditions,
                currentNumberScheduled,
                desiredNumberScheduled,
                numberAvailable,
                numberMisscheduled,
                numberReady,
                numberUnavailable,
                observedGeneration,
                updatedNumberScheduled);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetStatus)) {
            return false;
        }
        final DaemonSetStatus __otherCasted = (DaemonSetStatus) __other;
        return Objects.equals(collisionCount, __otherCasted.collisionCount) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(currentNumberScheduled, __otherCasted.currentNumberScheduled) &&
            Objects.equals(desiredNumberScheduled, __otherCasted.desiredNumberScheduled) &&
            Objects.equals(numberAvailable, __otherCasted.numberAvailable) &&
            Objects.equals(numberMisscheduled, __otherCasted.numberMisscheduled) &&
            Objects.equals(numberReady, __otherCasted.numberReady) &&
            Objects.equals(numberUnavailable, __otherCasted.numberUnavailable) &&
            Objects.equals(observedGeneration, __otherCasted.observedGeneration) &&
            Objects.equals(updatedNumberScheduled, __otherCasted.updatedNumberScheduled);
    }

    public DaemonSetStatus collisionCount(final Integer collisionCount) {
        this.collisionCount = collisionCount;
        return this;
    }

    public DaemonSetStatus conditions(final List<DaemonSetCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public DaemonSetStatus currentNumberScheduled(final int currentNumberScheduled) {
        this.currentNumberScheduled = currentNumberScheduled;
        return this;
    }

    public DaemonSetStatus desiredNumberScheduled(final int desiredNumberScheduled) {
        this.desiredNumberScheduled = desiredNumberScheduled;
        return this;
    }

    public DaemonSetStatus numberAvailable(final Integer numberAvailable) {
        this.numberAvailable = numberAvailable;
        return this;
    }

    public DaemonSetStatus numberMisscheduled(final int numberMisscheduled) {
        this.numberMisscheduled = numberMisscheduled;
        return this;
    }

    public DaemonSetStatus numberReady(final int numberReady) {
        this.numberReady = numberReady;
        return this;
    }

    public DaemonSetStatus numberUnavailable(final Integer numberUnavailable) {
        this.numberUnavailable = numberUnavailable;
        return this;
    }

    public DaemonSetStatus observedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    public DaemonSetStatus updatedNumberScheduled(final Integer updatedNumberScheduled) {
        this.updatedNumberScheduled = updatedNumberScheduled;
        return this;
    }

    @Override
    public DaemonSetStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (collisionCount != null ? "\"collisionCount\":" + collisionCount : ""),
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    "\"currentNumberScheduled\":" + currentNumberScheduled,
                    "\"desiredNumberScheduled\":" + desiredNumberScheduled,
                    (numberAvailable != null ? "\"numberAvailable\":" + numberAvailable : ""),
                    "\"numberMisscheduled\":" + numberMisscheduled,
                    "\"numberReady\":" + numberReady,
                    (numberUnavailable != null ? "\"numberUnavailable\":" + numberUnavailable : ""),
                    (observedGeneration != null ? "\"observedGeneration\":" + observedGeneration : ""),
                    (updatedNumberScheduled != null ? "\"updatedNumberScheduled\":" + updatedNumberScheduled : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
