package io.yupiik.kubernetes.bindings.v1_19_2.v1beta1;

import io.yupiik.kubernetes.bindings.v1_19_2.Validable;
import io.yupiik.kubernetes.bindings.v1_19_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CronJobSpec implements Validable<CronJobSpec> {
    private String concurrencyPolicy;
    private Integer failedJobsHistoryLimit;
    private JobTemplateSpec jobTemplate;
    private String schedule;
    private Integer startingDeadlineSeconds;
    private Integer successfulJobsHistoryLimit;
    private Boolean suspend;

    public CronJobSpec() {
        // no-op
    }

    public CronJobSpec(final String concurrencyPolicy,
                       final Integer failedJobsHistoryLimit,
                       final JobTemplateSpec jobTemplate,
                       final String schedule,
                       final Integer startingDeadlineSeconds,
                       final Integer successfulJobsHistoryLimit,
                       final Boolean suspend) {
        // no-op
    }

    public String getConcurrencyPolicy() {
        return concurrencyPolicy;
    }

    public void setConcurrencyPolicy(final String concurrencyPolicy) {
        this.concurrencyPolicy = concurrencyPolicy;
    }

    public Integer getFailedJobsHistoryLimit() {
        return failedJobsHistoryLimit;
    }

    public void setFailedJobsHistoryLimit(final Integer failedJobsHistoryLimit) {
        this.failedJobsHistoryLimit = failedJobsHistoryLimit;
    }

    public JobTemplateSpec getJobTemplate() {
        return jobTemplate;
    }

    public void setJobTemplate(final JobTemplateSpec jobTemplate) {
        this.jobTemplate = jobTemplate;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(final String schedule) {
        this.schedule = schedule;
    }

    public Integer getStartingDeadlineSeconds() {
        return startingDeadlineSeconds;
    }

    public void setStartingDeadlineSeconds(final Integer startingDeadlineSeconds) {
        this.startingDeadlineSeconds = startingDeadlineSeconds;
    }

    public Integer getSuccessfulJobsHistoryLimit() {
        return successfulJobsHistoryLimit;
    }

    public void setSuccessfulJobsHistoryLimit(final Integer successfulJobsHistoryLimit) {
        this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
    }

    public Boolean getSuspend() {
        return suspend;
    }

    public void setSuspend(final Boolean suspend) {
        this.suspend = suspend;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                concurrencyPolicy,
                failedJobsHistoryLimit,
                jobTemplate,
                schedule,
                startingDeadlineSeconds,
                successfulJobsHistoryLimit,
                suspend);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobSpec)) {
            return false;
        }
        final CronJobSpec __otherCasted = (CronJobSpec) __other;
        return Objects.equals(concurrencyPolicy, __otherCasted.concurrencyPolicy) &&
            Objects.equals(failedJobsHistoryLimit, __otherCasted.failedJobsHistoryLimit) &&
            Objects.equals(jobTemplate, __otherCasted.jobTemplate) &&
            Objects.equals(schedule, __otherCasted.schedule) &&
            Objects.equals(startingDeadlineSeconds, __otherCasted.startingDeadlineSeconds) &&
            Objects.equals(successfulJobsHistoryLimit, __otherCasted.successfulJobsHistoryLimit) &&
            Objects.equals(suspend, __otherCasted.suspend);
    }

    public CronJobSpec concurrencyPolicy(final String concurrencyPolicy) {
        this.concurrencyPolicy = concurrencyPolicy;
        return this;
    }

    public CronJobSpec failedJobsHistoryLimit(final Integer failedJobsHistoryLimit) {
        this.failedJobsHistoryLimit = failedJobsHistoryLimit;
        return this;
    }

    public CronJobSpec jobTemplate(final JobTemplateSpec jobTemplate) {
        this.jobTemplate = jobTemplate;
        return this;
    }

    public CronJobSpec schedule(final String schedule) {
        this.schedule = schedule;
        return this;
    }

    public CronJobSpec startingDeadlineSeconds(final Integer startingDeadlineSeconds) {
        this.startingDeadlineSeconds = startingDeadlineSeconds;
        return this;
    }

    public CronJobSpec successfulJobsHistoryLimit(final Integer successfulJobsHistoryLimit) {
        this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
        return this;
    }

    public CronJobSpec suspend(final Boolean suspend) {
        this.suspend = suspend;
        return this;
    }

    @Override
    public CronJobSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (jobTemplate == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "jobTemplate", "jobTemplate",
                "Missing 'jobTemplate' attribute.", true));
        }
        if (schedule == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "schedule", "schedule",
                "Missing 'schedule' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}