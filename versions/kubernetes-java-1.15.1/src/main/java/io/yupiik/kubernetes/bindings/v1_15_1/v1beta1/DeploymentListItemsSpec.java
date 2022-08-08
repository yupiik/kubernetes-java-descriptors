package io.yupiik.kubernetes.bindings.v1_15_1.v1beta1;

import java.util.Objects;

public class DeploymentListItemsSpec {
    private Integer minReadySeconds;
    private Boolean paused;
    private Integer progressDeadlineSeconds;
    private Integer replicas;
    private Integer revisionHistoryLimit;
    private DeploymentListItemsSpecRollbackTo rollbackTo;
    private DeploymentListItemsSpecSelector selector;
    private DeploymentListItemsSpecStrategy strategy;
    private DeploymentListItemsSpecTemplate template;

    public DeploymentListItemsSpec() {
        // no-op
    }

    public DeploymentListItemsSpec(final Integer minReadySeconds,
                                   final Boolean paused,
                                   final Integer progressDeadlineSeconds,
                                   final Integer replicas,
                                   final Integer revisionHistoryLimit,
                                   final DeploymentListItemsSpecRollbackTo rollbackTo,
                                   final DeploymentListItemsSpecSelector selector,
                                   final DeploymentListItemsSpecStrategy strategy,
                                   final DeploymentListItemsSpecTemplate template) {
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

    public DeploymentListItemsSpecRollbackTo getRollbackTo() {
        return rollbackTo;
    }

    public void setRollbackTo(final DeploymentListItemsSpecRollbackTo rollbackTo) {
        this.rollbackTo = rollbackTo;
    }

    public DeploymentListItemsSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final DeploymentListItemsSpecSelector selector) {
        this.selector = selector;
    }

    public DeploymentListItemsSpecStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(final DeploymentListItemsSpecStrategy strategy) {
        this.strategy = strategy;
    }

    public DeploymentListItemsSpecTemplate getTemplate() {
        return template;
    }

    public void setTemplate(final DeploymentListItemsSpecTemplate template) {
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
                rollbackTo,
                selector,
                strategy,
                template);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentListItemsSpec)) {
            return false;
        }
        final DeploymentListItemsSpec __otherCasted = (DeploymentListItemsSpec) __other;
        return Objects.equals(minReadySeconds, __otherCasted.minReadySeconds) &&
            Objects.equals(paused, __otherCasted.paused) &&
            Objects.equals(progressDeadlineSeconds, __otherCasted.progressDeadlineSeconds) &&
            Objects.equals(replicas, __otherCasted.replicas) &&
            Objects.equals(revisionHistoryLimit, __otherCasted.revisionHistoryLimit) &&
            Objects.equals(rollbackTo, __otherCasted.rollbackTo) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(strategy, __otherCasted.strategy) &&
            Objects.equals(template, __otherCasted.template);
    }
}
