package io.yupiik.kubernetes.bindings.v1_22_9.v1;

import java.util.List;
import java.util.Objects;

public class JobListItemsStatus {
    private Integer active;
    private String completedIndexes;
    private String completionTime;
    private List<JobListItemsStatusConditions> conditions;
    private Integer failed;
    private String startTime;
    private Integer succeeded;
    private JobListItemsStatusUncountedTerminatedPods uncountedTerminatedPods;

    public JobListItemsStatus() {
        // no-op
    }

    public JobListItemsStatus(final Integer active,
                              final String completedIndexes,
                              final String completionTime,
                              final List<JobListItemsStatusConditions> conditions,
                              final Integer failed,
                              final String startTime,
                              final Integer succeeded,
                              final JobListItemsStatusUncountedTerminatedPods uncountedTerminatedPods) {
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

    public List<JobListItemsStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<JobListItemsStatusConditions> conditions) {
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

    public JobListItemsStatusUncountedTerminatedPods getUncountedTerminatedPods() {
        return uncountedTerminatedPods;
    }

    public void setUncountedTerminatedPods(final JobListItemsStatusUncountedTerminatedPods uncountedTerminatedPods) {
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
        if (!(__other instanceof JobListItemsStatus)) {
            return false;
        }
        final JobListItemsStatus __otherCasted = (JobListItemsStatus) __other;
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
