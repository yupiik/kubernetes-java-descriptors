package io.yupiik.kubernetes.bindings.v1_22_5.v1;

import java.util.Objects;

public class DaemonSetSpec {
    private Integer minReadySeconds;
    private Integer revisionHistoryLimit;
    private DaemonSetSpecSelector selector;
    private DaemonSetSpecTemplate template;
    private DaemonSetSpecUpdateStrategy updateStrategy;

    public DaemonSetSpec() {
        // no-op
    }

    public DaemonSetSpec(final Integer minReadySeconds,
                         final Integer revisionHistoryLimit,
                         final DaemonSetSpecSelector selector,
                         final DaemonSetSpecTemplate template,
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
            Objects.equals(updateStrategy, __otherCasted.updateStrategy);
    }
}
