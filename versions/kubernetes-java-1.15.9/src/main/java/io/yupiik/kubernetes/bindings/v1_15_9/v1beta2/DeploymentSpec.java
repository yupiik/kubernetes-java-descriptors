/*
 * Copyright (c) 2022 - Yupiik SAS - https://www.yupiik.com
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
package io.yupiik.kubernetes.bindings.v1_15_9.v1beta2;

import io.yupiik.kubernetes.bindings.v1_15_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_15_9.Validable;
import io.yupiik.kubernetes.bindings.v1_15_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeploymentSpec implements Validable<DeploymentSpec>, Exportable {
    private Integer minReadySeconds;
    private Boolean paused;
    private Integer progressDeadlineSeconds;
    private Integer replicas;
    private Integer revisionHistoryLimit;
    private LabelSelector selector;
    private DeploymentStrategy strategy;
    private PodTemplateSpec template;

    public DeploymentSpec() {
        // no-op
    }

    public DeploymentSpec(final Integer minReadySeconds,
                          final Boolean paused,
                          final Integer progressDeadlineSeconds,
                          final Integer replicas,
                          final Integer revisionHistoryLimit,
                          final LabelSelector selector,
                          final DeploymentStrategy strategy,
                          final PodTemplateSpec template) {
        this.minReadySeconds = minReadySeconds;
        this.paused = paused;
        this.progressDeadlineSeconds = progressDeadlineSeconds;
        this.replicas = replicas;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.selector = selector;
        this.strategy = strategy;
        this.template = template;
    }

    public Integer getMinReadySeconds() {
        return minReadySeconds;
    }

    public void setMinReadySeconds(final Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
    }

    public Boolean getPaused() {
        return paused;
    }

    public void setPaused(final Boolean paused) {
        this.paused = paused;
    }

    public Integer getProgressDeadlineSeconds() {
        return progressDeadlineSeconds;
    }

    public void setProgressDeadlineSeconds(final Integer progressDeadlineSeconds) {
        this.progressDeadlineSeconds = progressDeadlineSeconds;
    }

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(final Integer replicas) {
        this.replicas = replicas;
    }

    public Integer getRevisionHistoryLimit() {
        return revisionHistoryLimit;
    }

    public void setRevisionHistoryLimit(final Integer revisionHistoryLimit) {
        this.revisionHistoryLimit = revisionHistoryLimit;
    }

    public LabelSelector getSelector() {
        return selector;
    }

    public void setSelector(final LabelSelector selector) {
        this.selector = selector;
    }

    public DeploymentStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(final DeploymentStrategy strategy) {
        this.strategy = strategy;
    }

    public PodTemplateSpec getTemplate() {
        return template;
    }

    public void setTemplate(final PodTemplateSpec template) {
        this.template = template;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                minReadySeconds,
                paused,
                progressDeadlineSeconds,
                replicas,
                revisionHistoryLimit,
                selector,
                strategy,
                template);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentSpec)) {
            return false;
        }
        final DeploymentSpec __otherCasted = (DeploymentSpec) __other;
        return Objects.equals(minReadySeconds, __otherCasted.minReadySeconds) &&
            Objects.equals(paused, __otherCasted.paused) &&
            Objects.equals(progressDeadlineSeconds, __otherCasted.progressDeadlineSeconds) &&
            Objects.equals(replicas, __otherCasted.replicas) &&
            Objects.equals(revisionHistoryLimit, __otherCasted.revisionHistoryLimit) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(strategy, __otherCasted.strategy) &&
            Objects.equals(template, __otherCasted.template);
    }

    public DeploymentSpec minReadySeconds(final Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
        return this;
    }

    public DeploymentSpec paused(final Boolean paused) {
        this.paused = paused;
        return this;
    }

    public DeploymentSpec progressDeadlineSeconds(final Integer progressDeadlineSeconds) {
        this.progressDeadlineSeconds = progressDeadlineSeconds;
        return this;
    }

    public DeploymentSpec replicas(final Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    public DeploymentSpec revisionHistoryLimit(final Integer revisionHistoryLimit) {
        this.revisionHistoryLimit = revisionHistoryLimit;
        return this;
    }

    public DeploymentSpec selector(final LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    public DeploymentSpec strategy(final DeploymentStrategy strategy) {
        this.strategy = strategy;
        return this;
    }

    public DeploymentSpec template(final PodTemplateSpec template) {
        this.template = template;
        return this;
    }

    @Override
    public DeploymentSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (selector == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "selector", "selector",
                "Missing 'selector' attribute.", true));
        }
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
                    (minReadySeconds != null ? "\"minReadySeconds\":" + minReadySeconds : ""),
                    (paused != null ? "\"paused\":" + paused : ""),
                    (progressDeadlineSeconds != null ? "\"progressDeadlineSeconds\":" + progressDeadlineSeconds : ""),
                    (replicas != null ? "\"replicas\":" + replicas : ""),
                    (revisionHistoryLimit != null ? "\"revisionHistoryLimit\":" + revisionHistoryLimit : ""),
                    (selector != null ? "\"selector\":" + selector.asJson() : ""),
                    (strategy != null ? "\"strategy\":" + strategy.asJson() : ""),
                    (template != null ? "\"template\":" + template.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
