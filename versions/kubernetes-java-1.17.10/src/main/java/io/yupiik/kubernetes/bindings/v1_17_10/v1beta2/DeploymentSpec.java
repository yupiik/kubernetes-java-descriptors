package io.yupiik.kubernetes.bindings.v1_17_10.v1beta2;

import io.yupiik.kubernetes.bindings.v1_17_10.Validable;
import io.yupiik.kubernetes.bindings.v1_17_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DeploymentSpec implements Validable<DeploymentSpec> {
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
        // no-op
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
}
