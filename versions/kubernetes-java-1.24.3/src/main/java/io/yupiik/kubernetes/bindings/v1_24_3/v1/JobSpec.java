package io.yupiik.kubernetes.bindings.v1_24_3.v1;

import io.yupiik.kubernetes.bindings.v1_24_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_24_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_24_3.Validable;
import io.yupiik.kubernetes.bindings.v1_24_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class JobSpec implements Validable<JobSpec>, Exportable {
    private Integer activeDeadlineSeconds;
    private Integer backoffLimit;
    private String completionMode;
    private Integer completions;
    private Boolean manualSelector;
    private Integer parallelism;
    private LabelSelector selector;
    private Boolean suspend;
    private PodTemplateSpec template;
    private Integer ttlSecondsAfterFinished;

    public JobSpec() {
        // no-op
    }

    public JobSpec(final Integer activeDeadlineSeconds,
                   final Integer backoffLimit,
                   final String completionMode,
                   final Integer completions,
                   final Boolean manualSelector,
                   final Integer parallelism,
                   final LabelSelector selector,
                   final Boolean suspend,
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

    public LabelSelector getSelector() {
        return selector;
    }

    public void setSelector(final LabelSelector selector) {
        this.selector = selector;
    }

    public Boolean getSuspend() {
        return suspend;
    }

    public void setSuspend(final Boolean suspend) {
        this.suspend = suspend;
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
        if (!(__other instanceof JobSpec)) {
            return false;
        }
        final JobSpec __otherCasted = (JobSpec) __other;
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

    public JobSpec activeDeadlineSeconds(final Integer activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        return this;
    }

    public JobSpec backoffLimit(final Integer backoffLimit) {
        this.backoffLimit = backoffLimit;
        return this;
    }

    public JobSpec completionMode(final String completionMode) {
        this.completionMode = completionMode;
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

    public JobSpec suspend(final Boolean suspend) {
        this.suspend = suspend;
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

    @Override
    public String asJson() {
        return Stream.of(
                    (activeDeadlineSeconds != null ? "\"activeDeadlineSeconds\":" + activeDeadlineSeconds : ""),
                    (backoffLimit != null ? "\"backoffLimit\":" + backoffLimit : ""),
                    (completionMode != null ? "\"completionMode\":\"" +  JsonStrings.escapeJson(completionMode) + "\"" : ""),
                    (completions != null ? "\"completions\":" + completions : ""),
                    (manualSelector != null ? "\"manualSelector\":" + manualSelector : ""),
                    (parallelism != null ? "\"parallelism\":" + parallelism : ""),
                    (selector != null ? "\"selector\":" + selector.asJson() : ""),
                    (suspend != null ? "\"suspend\":" + suspend : ""),
                    (template != null ? "\"template\":" + template.asJson() : ""),
                    (ttlSecondsAfterFinished != null ? "\"ttlSecondsAfterFinished\":" + ttlSecondsAfterFinished : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
