package io.yupiik.kubernetes.bindings.v1_14_1.v2alpha1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpec {
    private Integer activeDeadlineSeconds;
    private Integer backoffLimit;
    private Integer completions;
    private Boolean manualSelector;
    private Integer parallelism;
    private CronJobListItemsSpecJobTemplateSpecSelector selector;
    private CronJobListItemsSpecJobTemplateSpecTemplate template;
    private Integer ttlSecondsAfterFinished;

    public CronJobListItemsSpecJobTemplateSpec() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpec(final Integer activeDeadlineSeconds,
                                               final Integer backoffLimit,
                                               final Integer completions,
                                               final Boolean manualSelector,
                                               final Integer parallelism,
                                               final CronJobListItemsSpecJobTemplateSpecSelector selector,
                                               final CronJobListItemsSpecJobTemplateSpecTemplate template,
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

    public CronJobListItemsSpecJobTemplateSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final CronJobListItemsSpecJobTemplateSpecSelector selector) {
        this.selector = selector;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplate getTemplate() {
        return template;
    }

    public void setTemplate(final CronJobListItemsSpecJobTemplateSpecTemplate template) {
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
                completions,
                manualSelector,
                parallelism,
                selector,
                template,
                ttlSecondsAfterFinished);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpec)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpec __otherCasted = (CronJobListItemsSpecJobTemplateSpec) __other;
        return Objects.equals(activeDeadlineSeconds, __otherCasted.activeDeadlineSeconds) &&
            Objects.equals(backoffLimit, __otherCasted.backoffLimit) &&
            Objects.equals(completions, __otherCasted.completions) &&
            Objects.equals(manualSelector, __otherCasted.manualSelector) &&
            Objects.equals(parallelism, __otherCasted.parallelism) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(template, __otherCasted.template) &&
            Objects.equals(ttlSecondsAfterFinished, __otherCasted.ttlSecondsAfterFinished);
    }
}
