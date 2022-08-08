package io.yupiik.kubernetes.bindings.v1_24_3.v1;

import io.yupiik.kubernetes.bindings.v1_24_3.Validable;
import io.yupiik.kubernetes.bindings.v1_24_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JobStatus implements Validable<JobStatus> {
    private Integer active;
    private String completedIndexes;
    private String completionTime;
    private List<JobCondition> conditions;
    private Integer failed;
    private Integer ready;
    private String startTime;
    private Integer succeeded;
    private UncountedTerminatedPods uncountedTerminatedPods;

    public JobStatus() {
        // no-op
    }

    public JobStatus(final Integer active,
                     final String completedIndexes,
                     final String completionTime,
                     final List<JobCondition> conditions,
                     final Integer failed,
                     final Integer ready,
                     final String startTime,
                     final Integer succeeded,
                     final UncountedTerminatedPods uncountedTerminatedPods) {
        // no-op
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
                ready,
                startTime,
                succeeded,
                uncountedTerminatedPods);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobStatus)) {
            return false;
        }
        final JobStatus __otherCasted = (JobStatus) __other;
        return Objects.equals(active, __otherCasted.active) &&
            Objects.equals(completedIndexes, __otherCasted.completedIndexes) &&
            Objects.equals(completionTime, __otherCasted.completionTime) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(failed, __otherCasted.failed) &&
            Objects.equals(ready, __otherCasted.ready) &&
            Objects.equals(startTime, __otherCasted.startTime) &&
            Objects.equals(succeeded, __otherCasted.succeeded) &&
            Objects.equals(uncountedTerminatedPods, __otherCasted.uncountedTerminatedPods);
    }

    public JobStatus active(final Integer active) {
        this.active = active;
        return this;
    }

    public JobStatus completedIndexes(final String completedIndexes) {
        this.completedIndexes = completedIndexes;
        return this;
    }

    public JobStatus completionTime(final String completionTime) {
        this.completionTime = completionTime;
        return this;
    }

    public JobStatus conditions(final List<JobCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public JobStatus failed(final Integer failed) {
        this.failed = failed;
        return this;
    }

    public JobStatus ready(final Integer ready) {
        this.ready = ready;
        return this;
    }

    public JobStatus startTime(final String startTime) {
        this.startTime = startTime;
        return this;
    }

    public JobStatus succeeded(final Integer succeeded) {
        this.succeeded = succeeded;
        return this;
    }

    public JobStatus uncountedTerminatedPods(final UncountedTerminatedPods uncountedTerminatedPods) {
        this.uncountedTerminatedPods = uncountedTerminatedPods;
        return this;
    }

    @Override
    public JobStatus validate() {
        return this;
    }
}
