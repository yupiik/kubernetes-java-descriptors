package io.yupiik.kubernetes.bindings.v1_18_11.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_18_11.Validable;
import io.yupiik.kubernetes.bindings.v1_18_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JobSpec implements Validable<JobSpec> {
    private Integer activeDeadlineSeconds;
    private Integer backoffLimit;
    private Integer completions;
    private Boolean manualSelector;
    private Integer parallelism;
    private LabelSelector selector;
    private PodTemplateSpec template;
    private Integer ttlSecondsAfterFinished;

    public JobSpec() {
        // no-op
    }

    public JobSpec(final Integer activeDeadlineSeconds,
                   final Integer backoffLimit,
                   final Integer completions,
                   final Boolean manualSelector,
                   final Integer parallelism,
                   final LabelSelector selector,
                   final PodTemplateSpec template,
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

    public LabelSelector getSelector() {
        return selector;
    }

    public void setSelector(final LabelSelector selector) {
        this.selector = selector;
    }

    public PodTemplateSpec getTemplate() {
        return template;
    }

    public void setTemplate(final PodTemplateSpec template) {
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
        if (!(__other instanceof JobSpec)) {
            return false;
        }
        final JobSpec __otherCasted = (JobSpec) __other;
        return Objects.equals(activeDeadlineSeconds, __otherCasted.activeDeadlineSeconds) &&
            Objects.equals(backoffLimit, __otherCasted.backoffLimit) &&
            Objects.equals(completions, __otherCasted.completions) &&
            Objects.equals(manualSelector, __otherCasted.manualSelector) &&
            Objects.equals(parallelism, __otherCasted.parallelism) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(template, __otherCasted.template) &&
            Objects.equals(ttlSecondsAfterFinished, __otherCasted.ttlSecondsAfterFinished);
    }

    public JobSpec activeDeadlineSeconds(final Integer activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        return this;
    }

    public JobSpec backoffLimit(final Integer backoffLimit) {
        this.backoffLimit = backoffLimit;
        return this;
    }

    public JobSpec completions(final Integer completions) {
        this.completions = completions;
        return this;
    }

    public JobSpec manualSelector(final Boolean manualSelector) {
        this.manualSelector = manualSelector;
        return this;
    }

    public JobSpec parallelism(final Integer parallelism) {
        this.parallelism = parallelism;
        return this;
    }

    public JobSpec selector(final LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    public JobSpec template(final PodTemplateSpec template) {
        this.template = template;
        return this;
    }

    public JobSpec ttlSecondsAfterFinished(final Integer ttlSecondsAfterFinished) {
        this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
        return this;
    }

    @Override
    public JobSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (template == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "template", "template",
                "Missing 'template' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
