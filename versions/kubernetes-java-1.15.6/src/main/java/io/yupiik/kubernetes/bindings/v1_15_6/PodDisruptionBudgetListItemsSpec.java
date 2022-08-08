package io.yupiik.kubernetes.bindings.v1_15_6;

import java.util.Objects;

public class PodDisruptionBudgetListItemsSpec {
    private String maxUnavailable;
    private String minAvailable;
    private PodDisruptionBudgetListItemsSpecSelector selector;

    public PodDisruptionBudgetListItemsSpec() {
        // no-op
    }

    public PodDisruptionBudgetListItemsSpec(final String maxUnavailable,
                                            final String minAvailable,
                                            final PodDisruptionBudgetListItemsSpecSelector selector) {
        // no-op
    }

    public String getMaxUnavailable() {
        return maxUnavailable;
    }

    public void setMaxUnavailable(final String maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
    }

    public String getMinAvailable() {
        return minAvailable;
    }

    public void setMinAvailable(final String minAvailable) {
        this.minAvailable = minAvailable;
    }

    public PodDisruptionBudgetListItemsSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final PodDisruptionBudgetListItemsSpecSelector selector) {
        this.selector = selector;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                maxUnavailable,
                minAvailable,
                selector);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodDisruptionBudgetListItemsSpec)) {
            return false;
        }
        final PodDisruptionBudgetListItemsSpec __otherCasted = (PodDisruptionBudgetListItemsSpec) __other;
        return Objects.equals(maxUnavailable, __otherCasted.maxUnavailable) &&
            Objects.equals(minAvailable, __otherCasted.minAvailable) &&
            Objects.equals(selector, __otherCasted.selector);
    }
}
