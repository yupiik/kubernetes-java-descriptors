/*
 * Copyright (c) 2022 - present - Yupiik SAS - https://www.yupiik.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.yupiik.kubernetes.bindings.v1_32_x.v1;

import io.yupiik.kubernetes.bindings.v1_32_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_32_x.Validable;
import io.yupiik.kubernetes.bindings.v1_32_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.batch.v1.JobSpec implements Validable<io.k8s.api.batch.v1.JobSpec>, Exportable {
    private Integer activeDeadlineSeconds;
    private Integer backoffLimit;
    private Integer backoffLimitPerIndex;
    private String completionMode;
    private Integer completions;
    private String managedBy;
    private Boolean manualSelector;
    private Integer maxFailedIndexes;
    private Integer parallelism;
    private PodFailurePolicy podFailurePolicy;
    private String podReplacementPolicy;
    private LabelSelector selector;
    private SuccessPolicy successPolicy;
    private Boolean suspend;
    private PodTemplateSpec template;
    private Integer ttlSecondsAfterFinished;

    public io.k8s.api.batch.v1.JobSpec() {
        // no-op
    }

    public io.k8s.api.batch.v1.JobSpec(final Integer activeDeadlineSeconds,
                                       final Integer backoffLimit,
                                       final Integer backoffLimitPerIndex,
                                       final String completionMode,
                                       final Integer completions,
                                       final String managedBy,
                                       final Boolean manualSelector,
                                       final Integer maxFailedIndexes,
                                       final Integer parallelism,
                                       final PodFailurePolicy podFailurePolicy,
                                       final String podReplacementPolicy,
                                       final LabelSelector selector,
                                       final SuccessPolicy successPolicy,
                                       final Boolean suspend,
                                       final PodTemplateSpec template,
                                       final Integer ttlSecondsAfterFinished) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        this.backoffLimit = backoffLimit;
        this.backoffLimitPerIndex = backoffLimitPerIndex;
        this.completionMode = completionMode;
        this.completions = completions;
        this.managedBy = managedBy;
        this.manualSelector = manualSelector;
        this.maxFailedIndexes = maxFailedIndexes;
        this.parallelism = parallelism;
        this.podFailurePolicy = podFailurePolicy;
        this.podReplacementPolicy = podReplacementPolicy;
        this.selector = selector;
        this.successPolicy = successPolicy;
        this.suspend = suspend;
        this.template = template;
        this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
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

    public Integer getBackoffLimitPerIndex() {
        return backoffLimitPerIndex;
    }

    public void setBackoffLimitPerIndex(final Integer backoffLimitPerIndex) {
        this.backoffLimitPerIndex = backoffLimitPerIndex;
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

    public String getManagedBy() {
        return managedBy;
    }

    public void setManagedBy(final String managedBy) {
        this.managedBy = managedBy;
    }

    public Boolean getManualSelector() {
        return manualSelector;
    }

    public void setManualSelector(final Boolean manualSelector) {
        this.manualSelector = manualSelector;
    }

    public Integer getMaxFailedIndexes() {
        return maxFailedIndexes;
    }

    public void setMaxFailedIndexes(final Integer maxFailedIndexes) {
        this.maxFailedIndexes = maxFailedIndexes;
    }

    public Integer getParallelism() {
        return parallelism;
    }

    public void setParallelism(final Integer parallelism) {
        this.parallelism = parallelism;
    }

    public PodFailurePolicy getPodFailurePolicy() {
        return podFailurePolicy;
    }

    public void setPodFailurePolicy(final PodFailurePolicy podFailurePolicy) {
        this.podFailurePolicy = podFailurePolicy;
    }

    public String getPodReplacementPolicy() {
        return podReplacementPolicy;
    }

    public void setPodReplacementPolicy(final String podReplacementPolicy) {
        this.podReplacementPolicy = podReplacementPolicy;
    }

    public LabelSelector getSelector() {
        return selector;
    }

    public void setSelector(final LabelSelector selector) {
        this.selector = selector;
    }

    public SuccessPolicy getSuccessPolicy() {
        return successPolicy;
    }

    public void setSuccessPolicy(final SuccessPolicy successPolicy) {
        this.successPolicy = successPolicy;
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
                backoffLimitPerIndex,
                completionMode,
                completions,
                managedBy,
                manualSelector,
                maxFailedIndexes,
                parallelism,
                podFailurePolicy,
                podReplacementPolicy,
                selector,
                successPolicy,
                suspend,
                template,
                ttlSecondsAfterFinished);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.batch.v1.JobSpec)) {
            return false;
        }
        final io.k8s.api.batch.v1.JobSpec __otherCasted = (io.k8s.api.batch.v1.JobSpec) __other;
        return Objects.equals(activeDeadlineSeconds, __otherCasted.activeDeadlineSeconds) &&
            Objects.equals(backoffLimit, __otherCasted.backoffLimit) &&
            Objects.equals(backoffLimitPerIndex, __otherCasted.backoffLimitPerIndex) &&
            Objects.equals(completionMode, __otherCasted.completionMode) &&
            Objects.equals(completions, __otherCasted.completions) &&
            Objects.equals(managedBy, __otherCasted.managedBy) &&
            Objects.equals(manualSelector, __otherCasted.manualSelector) &&
            Objects.equals(maxFailedIndexes, __otherCasted.maxFailedIndexes) &&
            Objects.equals(parallelism, __otherCasted.parallelism) &&
            Objects.equals(podFailurePolicy, __otherCasted.podFailurePolicy) &&
            Objects.equals(podReplacementPolicy, __otherCasted.podReplacementPolicy) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(successPolicy, __otherCasted.successPolicy) &&
            Objects.equals(suspend, __otherCasted.suspend) &&
            Objects.equals(template, __otherCasted.template) &&
            Objects.equals(ttlSecondsAfterFinished, __otherCasted.ttlSecondsAfterFinished);
    }

    public io.k8s.api.batch.v1.JobSpec activeDeadlineSeconds(final Integer activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        return this;
    }

    public io.k8s.api.batch.v1.JobSpec backoffLimit(final Integer backoffLimit) {
        this.backoffLimit = backoffLimit;
        return this;
    }

    public io.k8s.api.batch.v1.JobSpec backoffLimitPerIndex(final Integer backoffLimitPerIndex) {
        this.backoffLimitPerIndex = backoffLimitPerIndex;
        return this;
    }

    public io.k8s.api.batch.v1.JobSpec completionMode(final String completionMode) {
        this.completionMode = completionMode;
        return this;
    }

    public io.k8s.api.batch.v1.JobSpec completions(final Integer completions) {
        this.completions = completions;
        return this;
    }

    public io.k8s.api.batch.v1.JobSpec managedBy(final String managedBy) {
        this.managedBy = managedBy;
        return this;
    }

    public io.k8s.api.batch.v1.JobSpec manualSelector(final Boolean manualSelector) {
        this.manualSelector = manualSelector;
        return this;
    }

    public io.k8s.api.batch.v1.JobSpec maxFailedIndexes(final Integer maxFailedIndexes) {
        this.maxFailedIndexes = maxFailedIndexes;
        return this;
    }

    public io.k8s.api.batch.v1.JobSpec parallelism(final Integer parallelism) {
        this.parallelism = parallelism;
        return this;
    }

    public io.k8s.api.batch.v1.JobSpec podFailurePolicy(final PodFailurePolicy podFailurePolicy) {
        this.podFailurePolicy = podFailurePolicy;
        return this;
    }

    public io.k8s.api.batch.v1.JobSpec podReplacementPolicy(final String podReplacementPolicy) {
        this.podReplacementPolicy = podReplacementPolicy;
        return this;
    }

    public io.k8s.api.batch.v1.JobSpec selector(final LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    public io.k8s.api.batch.v1.JobSpec successPolicy(final SuccessPolicy successPolicy) {
        this.successPolicy = successPolicy;
        return this;
    }

    public io.k8s.api.batch.v1.JobSpec suspend(final Boolean suspend) {
        this.suspend = suspend;
        return this;
    }

    public io.k8s.api.batch.v1.JobSpec template(final PodTemplateSpec template) {
        this.template = template;
        return this;
    }

    public io.k8s.api.batch.v1.JobSpec ttlSecondsAfterFinished(final Integer ttlSecondsAfterFinished) {
        this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
        return this;
    }

    @Override
    public io.k8s.api.batch.v1.JobSpec validate() {
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
                    (backoffLimitPerIndex != null ? "\"backoffLimitPerIndex\":" + backoffLimitPerIndex : ""),
                    (completionMode != null ? "\"completionMode\":\"" +  JsonStrings.escapeJson(completionMode) + "\"" : ""),
                    (completions != null ? "\"completions\":" + completions : ""),
                    (managedBy != null ? "\"managedBy\":\"" +  JsonStrings.escapeJson(managedBy) + "\"" : ""),
                    (manualSelector != null ? "\"manualSelector\":" + manualSelector : ""),
                    (maxFailedIndexes != null ? "\"maxFailedIndexes\":" + maxFailedIndexes : ""),
                    (parallelism != null ? "\"parallelism\":" + parallelism : ""),
                    (podFailurePolicy != null ? "\"podFailurePolicy\":" + podFailurePolicy.asJson() : ""),
                    (podReplacementPolicy != null ? "\"podReplacementPolicy\":\"" +  JsonStrings.escapeJson(podReplacementPolicy) + "\"" : ""),
                    (selector != null ? "\"selector\":" + selector.asJson() : ""),
                    (successPolicy != null ? "\"successPolicy\":" + successPolicy.asJson() : ""),
                    (suspend != null ? "\"suspend\":" + suspend : ""),
                    (template != null ? "\"template\":" + template.asJson() : ""),
                    (ttlSecondsAfterFinished != null ? "\"ttlSecondsAfterFinished\":" + ttlSecondsAfterFinished : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
