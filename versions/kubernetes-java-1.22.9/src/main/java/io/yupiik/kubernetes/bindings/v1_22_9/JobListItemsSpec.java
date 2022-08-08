package io.yupiik.kubernetes.bindings.v1_22_9;

import java.util.Objects;

public class JobListItemsSpec {
    private Integer activeDeadlineSeconds;
    private Integer backoffLimit;
    private String completionMode;
    private Integer completions;
    private Boolean manualSelector;
    private Integer parallelism;
    private JobListItemsSpecSelector selector;
    private Boolean suspend;
    private JobListItemsSpecTemplate template;
    private Integer ttlSecondsAfterFinished;

    public JobListItemsSpec() {
        // no-op
    }

    public JobListItemsSpec(final Integer activeDeadlineSeconds,
                            final Integer backoffLimit,
                            final String completionMode,
                            final Integer completions,
                            final Boolean manualSelector,
                            final Integer parallelism,
                            final JobListItemsSpecSelector selector,
                            final Boolean suspend,
                            final JobListItemsSpecTemplate template,
                            final Integer ttlSecondsAfterFinished) {
        // no-op
    }

    public Integer getActiveDeadlineSeconds() {
        return activeDeadlineSeconds;
    }

    public void setActiveDeadlineSeconds(final Integer activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
    }

    public Integer getBackoffLimit() {
        return backoffLimit;
    }

    public void setBackoffLimit(final Integer backoffLimit) {
        this.backoffLimit = backoffLimit;
    }

    public String getCompletionMode() {
        return completionMode;
    }

    public void setCompletionMode(final String completionMode) {
        this.completionMode = completionMode;
    }

    public Integer getCompletions() {
        return completions;
    }

    public void setCompletions(final Integer completions) {
        this.completions = completions;
    }

    public Boolean getManualSelector() {
        return manualSelector;
    }

    public void setManualSelector(final Boolean manualSelector) {
        this.manualSelector = manualSelector;
    }

    public Integer getParallelism() {
        return parallelism;
    }

    public void setParallelism(final Integer parallelism) {
        this.parallelism = parallelism;
    }

    public JobListItemsSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final JobListItemsSpecSelector selector) {
        this.selector = selector;
    }

    public Boolean getSuspend() {
        return suspend;
    }

    public void setSuspend(final Boolean suspend) {
        this.suspend = suspend;
    }

    public JobListItemsSpecTemplate getTemplate() {
        return template;
    }

    public void setTemplate(final JobListItemsSpecTemplate template) {
        this.template = template;
    }

    public Integer getTtlSecondsAfterFinished() {
        return ttlSecondsAfterFinished;
    }

    public void setTtlSecondsAfterFinished(final Integer ttlSecondsAfterFinished) {
        this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                activeDeadlineSeconds,
                backoffLimit,
                completionMode,
                completions,
                manualSelector,
                parallelism,
                selector,
                suspend,
                template,
                ttlSecondsAfterFinished);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobListItemsSpec)) {
            return false;
        }
        final JobListItemsSpec __otherCasted = (JobListItemsSpec) __other;
        return Objects.equals(activeDeadlineSeconds, __otherCasted.activeDeadlineSeconds) &&
            Objects.equals(backoffLimit, __otherCasted.backoffLimit) &&
            Objects.equals(completionMode, __otherCasted.completionMode) &&
            Objects.equals(completions, __otherCasted.completions) &&
            Objects.equals(manualSelector, __otherCasted.manualSelector) &&
            Objects.equals(parallelism, __otherCasted.parallelism) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(suspend, __otherCasted.suspend) &&
            Objects.equals(template, __otherCasted.template) &&
            Objects.equals(ttlSecondsAfterFinished, __otherCasted.ttlSecondsAfterFinished);
    }
}
