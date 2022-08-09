package io.yupiik.kubernetes.bindings.v1_8_6.v1;

import io.yupiik.kubernetes.bindings.v1_8_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_8_6.Validable;
import io.yupiik.kubernetes.bindings.v1_8_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class JobStatus implements Validable<JobStatus>, Exportable {
    private Integer active;
    private String completionTime;
    private List<JobCondition> conditions;
    private Integer failed;
    private String startTime;
    private Integer succeeded;

    public JobStatus() {
        // no-op
    }

    public JobStatus(final Integer active,
                     final String completionTime,
                     final List<JobCondition> conditions,
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

    public JobStatus active(final Integer active) {
        this.active = active;
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

    public JobStatus startTime(final String startTime) {
        this.startTime = startTime;
        return this;
    }

    public JobStatus succeeded(final Integer succeeded) {
        this.succeeded = succeeded;
        return this;
    }

    @Override
    public JobStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (active != null ? "\"active\":" + active : ""),
                    (completionTime != null ? "\"completionTime\":\"" +  JsonStrings.escapeJson(completionTime) + "\"" : ""),
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (failed != null ? "\"failed\":" + failed : ""),
                    (startTime != null ? "\"startTime\":\"" +  JsonStrings.escapeJson(startTime) + "\"" : ""),
                    (succeeded != null ? "\"succeeded\":" + succeeded : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
