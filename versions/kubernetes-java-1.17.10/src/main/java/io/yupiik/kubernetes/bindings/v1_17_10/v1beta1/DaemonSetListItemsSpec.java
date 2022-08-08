package io.yupiik.kubernetes.bindings.v1_17_10.v1beta1;

import java.util.Objects;

public class DaemonSetListItemsSpec {
    private Integer minReadySeconds;
    private Integer revisionHistoryLimit;
    private DaemonSetListItemsSpecSelector selector;
    private DaemonSetListItemsSpecTemplate template;
    private Integer templateGeneration;
    private DaemonSetListItemsSpecUpdateStrategy updateStrategy;

    public DaemonSetListItemsSpec() {
        // no-op
    }

    public DaemonSetListItemsSpec(final Integer minReadySeconds,
                                  final Integer revisionHistoryLimit,
                                  final DaemonSetListItemsSpecSelector selector,
                                  final DaemonSetListItemsSpecTemplate template,
                                  final Integer templateGeneration,
                                  final DaemonSetListItemsSpecUpdateStrategy updateStrategy) {
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

    public DaemonSetListItemsSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final DaemonSetListItemsSpecSelector selector) {
        this.selector = selector;
    }

    public DaemonSetListItemsSpecTemplate getTemplate() {
        return template;
    }

    public void setTemplate(final DaemonSetListItemsSpecTemplate template) {
        this.template = template;
    }

    public Integer getTemplateGeneration() {
        return templateGeneration;
    }

    public void setTemplateGeneration(final Integer templateGeneration) {
        this.templateGeneration = templateGeneration;
    }

    public DaemonSetListItemsSpecUpdateStrategy getUpdateStrategy() {
        return updateStrategy;
    }

    public void setUpdateStrategy(final DaemonSetListItemsSpecUpdateStrategy updateStrategy) {
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
        if (!(__other instanceof DaemonSetListItemsSpec)) {
            return false;
        }
        final DaemonSetListItemsSpec __otherCasted = (DaemonSetListItemsSpec) __other;
        return Objects.equals(minReadySeconds, __otherCasted.minReadySeconds) &&
            Objects.equals(revisionHistoryLimit, __otherCasted.revisionHistoryLimit) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(template, __otherCasted.template) &&
            Objects.equals(templateGeneration, __otherCasted.templateGeneration) &&
            Objects.equals(updateStrategy, __otherCasted.updateStrategy);
    }
}
