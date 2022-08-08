package io.yupiik.kubernetes.bindings.v1_11_8;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class JobStatus {
    private Integer active;
    private String completionTime;
    private List<JsonValue> conditions;
    private Integer failed;
    private String startTime;
    private Integer succeeded;

    public JobStatus() {
        // no-op
    }

    public JobStatus(final Integer active,
                     final String completionTime,
                     final List<JsonValue> conditions,
                     final Integer failed,
                     final String startTime,
                     final Integer succeeded) {
        // no-op
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(final Integer active) {
        this.active = active;
    }

    public String getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(final String completionTime) {
        this.completionTime = completionTime;
    }

    public List<JsonValue> getConditions() {
        return conditions;
    }

    public void setConditions(final List<JsonValue> conditions) {
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

    @Override
    public int hashCode() {
        return Objects.hash(
                active,
                completionTime,
                conditions,
                failed,
                startTime,
                succeeded);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobStatus)) {
            return false;
        }
        final JobStatus __otherCasted = (JobStatus) __other;
        return Objects.equals(active, __otherCasted.active) &&
            Objects.equals(completionTime, __otherCasted.completionTime) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(failed, __otherCasted.failed) &&
            Objects.equals(startTime, __otherCasted.startTime) &&
            Objects.equals(succeeded, __otherCasted.succeeded);
    }
}
