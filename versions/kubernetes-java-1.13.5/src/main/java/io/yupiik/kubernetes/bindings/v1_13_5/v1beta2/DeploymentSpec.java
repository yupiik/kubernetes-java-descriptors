package io.yupiik.kubernetes.bindings.v1_13_5.v1beta2;

import java.util.Objects;

public class DeploymentSpec {
    private Integer minReadySeconds;
    private Boolean paused;
    private Integer progressDeadlineSeconds;
    private Integer replicas;
    private Integer revisionHistoryLimit;
    private DeploymentSpecSelector selector;
    private DeploymentSpecStrategy strategy;
    private DeploymentSpecTemplate template;

    public DeploymentSpec() {
        // no-op
    }

    public DeploymentSpec(final Integer minReadySeconds,
                          final Boolean paused,
                          final Integer progressDeadlineSeconds,
                          final Integer replicas,
                          final Integer revisionHistoryLimit,
                          final DeploymentSpecSelector selector,
                          final DeploymentSpecStrategy strategy,
                          final DeploymentSpecTemplate template) {
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

    public DeploymentSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final DeploymentSpecSelector selector) {
        this.selector = selector;
    }

    public DeploymentSpecStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(final DeploymentSpecStrategy strategy) {
        this.strategy = strategy;
    }

    public DeploymentSpecTemplate getTemplate() {
        return template;
    }

    public void setTemplate(final DeploymentSpecTemplate template) {
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
}
