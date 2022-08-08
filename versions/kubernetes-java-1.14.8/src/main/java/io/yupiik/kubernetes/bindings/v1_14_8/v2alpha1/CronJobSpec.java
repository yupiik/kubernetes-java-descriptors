package io.yupiik.kubernetes.bindings.v1_14_8.v2alpha1;

import java.util.Objects;

public class CronJobSpec {
    private String concurrencyPolicy;
    private Integer failedJobsHistoryLimit;
    private CronJobSpecJobTemplate jobTemplate;
    private String schedule;
    private Integer startingDeadlineSeconds;
    private Integer successfulJobsHistoryLimit;
    private Boolean suspend;

    public CronJobSpec() {
        // no-op
    }

    public CronJobSpec(final String concurrencyPolicy,
                       final Integer failedJobsHistoryLimit,
                       final CronJobSpecJobTemplate jobTemplate,
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

    public CronJobSpecJobTemplate getJobTemplate() {
        return jobTemplate;
    }

    public void setJobTemplate(final CronJobSpecJobTemplate jobTemplate) {
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
}
