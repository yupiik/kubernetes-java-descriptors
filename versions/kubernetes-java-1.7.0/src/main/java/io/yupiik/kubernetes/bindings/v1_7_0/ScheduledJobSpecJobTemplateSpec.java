package io.yupiik.kubernetes.bindings.v1_7_0;

import java.util.Objects;

public class ScheduledJobSpecJobTemplateSpec {
    private Integer activeDeadlineSeconds;
    private Integer completions;
    private Boolean manualSelector;
    private Integer parallelism;
    private ScheduledJobSpecJobTemplateSpecSelector selector;
    private ScheduledJobSpecJobTemplateSpecTemplate template;

    public ScheduledJobSpecJobTemplateSpec() {
        // no-op
    }

    public ScheduledJobSpecJobTemplateSpec(final Integer activeDeadlineSeconds,
                                           final Integer completions,
                                           final Boolean manualSelector,
                                           final Integer parallelism,
                                           final ScheduledJobSpecJobTemplateSpecSelector selector,
                                           final ScheduledJobSpecJobTemplateSpecTemplate template) {
        // no-op
    }

    public Integer getActiveDeadlineSeconds() {
        return activeDeadlineSeconds;
    }

    public void setActiveDeadlineSeconds(final Integer activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
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

    public ScheduledJobSpecJobTemplateSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final ScheduledJobSpecJobTemplateSpecSelector selector) {
        this.selector = selector;
    }

    public ScheduledJobSpecJobTemplateSpecTemplate getTemplate() {
        return template;
    }

    public void setTemplate(final ScheduledJobSpecJobTemplateSpecTemplate template) {
        this.template = template;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                activeDeadlineSeconds,
                completions,
                manualSelector,
                parallelism,
                selector,
                template);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ScheduledJobSpecJobTemplateSpec)) {
            return false;
        }
        final ScheduledJobSpecJobTemplateSpec __otherCasted = (ScheduledJobSpecJobTemplateSpec) __other;
        return Objects.equals(activeDeadlineSeconds, __otherCasted.activeDeadlineSeconds) &&
            Objects.equals(completions, __otherCasted.completions) &&
            Objects.equals(manualSelector, __otherCasted.manualSelector) &&
            Objects.equals(parallelism, __otherCasted.parallelism) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(template, __otherCasted.template);
    }
}
