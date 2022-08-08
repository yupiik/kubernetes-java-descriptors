package io.yupiik.kubernetes.bindings.v1_22_6;

import java.util.List;
import java.util.Objects;

public class JobStatus {
    private Integer active;
    private String completedIndexes;
    private String completionTime;
    private List<JobStatusConditions> conditions;
    private Integer failed;
    private String startTime;
    private Integer succeeded;
    private JobStatusUncountedTerminatedPods uncountedTerminatedPods;

    public JobStatus() {
        // no-op
    }

    public JobStatus(final Integer active,
                     final String completedIndexes,
                     final String completionTime,
                     final List<JobStatusConditions> conditions,
                     final Integer failed,
                     final String startTime,
                     final Integer succeeded,
                     final JobStatusUncountedTerminatedPods uncountedTerminatedPods) {
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

    public List<JobStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<JobStatusConditions> conditions) {
        this.conditions = conditions;
    }

    public Integer getFailed() {
        return failed;
    }

    public void setFailed(final Integer failed) {
        this.failed = failed;
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

    public JobStatusUncountedTerminatedPods getUncountedTerminatedPods() {
        return uncountedTerminatedPods;
    }

    public void setUncountedTerminatedPods(final JobStatusUncountedTerminatedPods uncountedTerminatedPods) {
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
            Objects.equals(startTime, __otherCasted.startTime) &&
            Objects.equals(succeeded, __otherCasted.succeeded) &&
            Objects.equals(uncountedTerminatedPods, __otherCasted.uncountedTerminatedPods);
    }
}
