package io.yupiik.kubernetes.bindings.v1_15_9.v1beta1;

import java.util.Objects;

public class DaemonSetSpec {
    private Integer minReadySeconds;
    private Integer revisionHistoryLimit;
    private DaemonSetSpecSelector selector;
    private DaemonSetSpecTemplate template;
    private Integer templateGeneration;
    private DaemonSetSpecUpdateStrategy updateStrategy;

    public DaemonSetSpec() {
        // no-op
    }

    public DaemonSetSpec(final Integer minReadySeconds,
                         final Integer revisionHistoryLimit,
                         final DaemonSetSpecSelector selector,
                         final DaemonSetSpecTemplate template,
                         final Integer templateGeneration,
                         final DaemonSetSpecUpdateStrategy updateStrategy) {
        // no-op
    }

    public Integer getMinReadySeconds() {
        return minReadySeconds;
    }

    public void setMinReadySeconds(final Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
    }

    public Integer getRevisionHistoryLimit() {
        return revisionHistoryLimit;
    }

    public void setRevisionHistoryLimit(final Integer revisionHistoryLimit) {
        this.revisionHistoryLimit = revisionHistoryLimit;
    }

    public DaemonSetSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final DaemonSetSpecSelector selector) {
        this.selector = selector;
    }

    public DaemonSetSpecTemplate getTemplate() {
        return template;
    }

    public void setTemplate(final DaemonSetSpecTemplate template) {
        this.template = template;
    }

    public Integer getTemplateGeneration() {
        return templateGeneration;
    }

    public void setTemplateGeneration(final Integer templateGeneration) {
        this.templateGeneration = templateGeneration;
    }

    public DaemonSetSpecUpdateStrategy getUpdateStrategy() {
        return updateStrategy;
    }

    public void setUpdateStrategy(final DaemonSetSpecUpdateStrategy updateStrategy) {
        this.updateStrategy = updateStrategy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                minReadySeconds,
                revisionHistoryLimit,
                selector,
                template,
                templateGeneration,
                updateStrategy);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetSpec)) {
            return false;
        }
        final DaemonSetSpec __otherCasted = (DaemonSetSpec) __other;
        return Objects.equals(minReadySeconds, __otherCasted.minReadySeconds) &&
            Objects.equals(revisionHistoryLimit, __otherCasted.revisionHistoryLimit) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(template, __otherCasted.template) &&
            Objects.equals(templateGeneration, __otherCasted.templateGeneration) &&
            Objects.equals(updateStrategy, __otherCasted.updateStrategy);
    }
}
