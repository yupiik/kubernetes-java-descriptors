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
package io.yupiik.kubernetes.bindings.v1_31_x.v1;

import io.yupiik.kubernetes.bindings.v1_31_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_x.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.batch.v1.JobStatus implements Validable<io.k8s.api.batch.v1.JobStatus>, Exportable {
    private Integer active;
    private String completedIndexes;
    private String completionTime;
    private List<JobCondition> conditions;
    private Integer failed;
    private String failedIndexes;
    private Integer ready;
    private String startTime;
    private Integer succeeded;
    private Integer terminating;
    private UncountedTerminatedPods uncountedTerminatedPods;

    public io.k8s.api.batch.v1.JobStatus() {
        // no-op
    }

    public io.k8s.api.batch.v1.JobStatus(final Integer active,
                                         final String completedIndexes,
                                         final String completionTime,
                                         final List<JobCondition> conditions,
                                         final Integer failed,
                                         final String failedIndexes,
                                         final Integer ready,
                                         final String startTime,
                                         final Integer succeeded,
                                         final Integer terminating,
                                         final UncountedTerminatedPods uncountedTerminatedPods) {
        this.active = active;
        this.completedIndexes = completedIndexes;
        this.completionTime = completionTime;
        this.conditions = conditions;
        this.failed = failed;
        this.failedIndexes = failedIndexes;
        this.ready = ready;
        this.startTime = startTime;
        this.succeeded = succeeded;
        this.terminating = terminating;
        this.uncountedTerminatedPods = uncountedTerminatedPods;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(final Integer active) {
        this.active = active;
    }

    public String getCompletedIndexes() {
        return completedIndexes;
    }

    public void setCompletedIndexes(final String completedIndexes) {
        this.completedIndexes = completedIndexes;
    }

    public String getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(final String completionTime) {
        this.completionTime = completionTime;
    }

    public List<JobCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<JobCondition> conditions) {
        this.conditions = conditions;
    }

    public Integer getFailed() {
        return failed;
    }

    public void setFailed(final Integer failed) {
        this.failed = failed;
    }

    public String getFailedIndexes() {
        return failedIndexes;
    }

    public void setFailedIndexes(final String failedIndexes) {
        this.failedIndexes = failedIndexes;
    }

    public Integer getReady() {
        return ready;
    }

    public void setReady(final Integer ready) {
        this.ready = ready;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(final String startTime) {
        this.startTime = startTime;
    }

    public Integer getSucceeded() {
        return succeeded;
    }

    public void setSucceeded(final Integer succeeded) {
        this.succeeded = succeeded;
    }

    public Integer getTerminating() {
        return terminating;
    }

    public void setTerminating(final Integer terminating) {
        this.terminating = terminating;
    }

    public UncountedTerminatedPods getUncountedTerminatedPods() {
        return uncountedTerminatedPods;
    }

    public void setUncountedTerminatedPods(final UncountedTerminatedPods uncountedTerminatedPods) {
        this.uncountedTerminatedPods = uncountedTerminatedPods;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                active,
                completedIndexes,
                completionTime,
                conditions,
                failed,
                failedIndexes,
                ready,
                startTime,
                succeeded,
                terminating,
                uncountedTerminatedPods);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.batch.v1.JobStatus)) {
            return false;
        }
        final io.k8s.api.batch.v1.JobStatus __otherCasted = (io.k8s.api.batch.v1.JobStatus) __other;
        return Objects.equals(active, __otherCasted.active) &&
            Objects.equals(completedIndexes, __otherCasted.completedIndexes) &&
            Objects.equals(completionTime, __otherCasted.completionTime) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(failed, __otherCasted.failed) &&
            Objects.equals(failedIndexes, __otherCasted.failedIndexes) &&
            Objects.equals(ready, __otherCasted.ready) &&
            Objects.equals(startTime, __otherCasted.startTime) &&
            Objects.equals(succeeded, __otherCasted.succeeded) &&
            Objects.equals(terminating, __otherCasted.terminating) &&
            Objects.equals(uncountedTerminatedPods, __otherCasted.uncountedTerminatedPods);
    }

    public io.k8s.api.batch.v1.JobStatus active(final Integer active) {
        this.active = active;
        return this;
    }

    public io.k8s.api.batch.v1.JobStatus completedIndexes(final String completedIndexes) {
        this.completedIndexes = completedIndexes;
        return this;
    }

    public io.k8s.api.batch.v1.JobStatus completionTime(final String completionTime) {
        this.completionTime = completionTime;
        return this;
    }

    public io.k8s.api.batch.v1.JobStatus conditions(final List<JobCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public io.k8s.api.batch.v1.JobStatus failed(final Integer failed) {
        this.failed = failed;
        return this;
    }

    public io.k8s.api.batch.v1.JobStatus failedIndexes(final String failedIndexes) {
        this.failedIndexes = failedIndexes;
        return this;
    }

    public io.k8s.api.batch.v1.JobStatus ready(final Integer ready) {
        this.ready = ready;
        return this;
    }

    public io.k8s.api.batch.v1.JobStatus startTime(final String startTime) {
        this.startTime = startTime;
        return this;
    }

    public io.k8s.api.batch.v1.JobStatus succeeded(final Integer succeeded) {
        this.succeeded = succeeded;
        return this;
    }

    public io.k8s.api.batch.v1.JobStatus terminating(final Integer terminating) {
        this.terminating = terminating;
        return this;
    }

    public io.k8s.api.batch.v1.JobStatus uncountedTerminatedPods(final UncountedTerminatedPods uncountedTerminatedPods) {
        this.uncountedTerminatedPods = uncountedTerminatedPods;
        return this;
    }

    @Override
    public io.k8s.api.batch.v1.JobStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (active != null ? "\"active\":" + active : ""),
                    (completedIndexes != null ? "\"completedIndexes\":\"" +  JsonStrings.escapeJson(completedIndexes) + "\"" : ""),
                    (completionTime != null ? "\"completionTime\":\"" +  JsonStrings.escapeJson(completionTime) + "\"" : ""),
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (failed != null ? "\"failed\":" + failed : ""),
                    (failedIndexes != null ? "\"failedIndexes\":\"" +  JsonStrings.escapeJson(failedIndexes) + "\"" : ""),
                    (ready != null ? "\"ready\":" + ready : ""),
                    (startTime != null ? "\"startTime\":\"" +  JsonStrings.escapeJson(startTime) + "\"" : ""),
                    (succeeded != null ? "\"succeeded\":" + succeeded : ""),
                    (terminating != null ? "\"terminating\":" + terminating : ""),
                    (uncountedTerminatedPods != null ? "\"uncountedTerminatedPods\":" + uncountedTerminatedPods.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
