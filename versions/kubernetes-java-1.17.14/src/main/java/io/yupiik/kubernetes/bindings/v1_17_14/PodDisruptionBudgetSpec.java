package io.yupiik.kubernetes.bindings.v1_17_14;

import java.util.Objects;

public class PodDisruptionBudgetSpec {
    private String maxUnavailable;
    private String minAvailable;
    private PodDisruptionBudgetSpecSelector selector;

    public PodDisruptionBudgetSpec() {
        // no-op
    }

    public PodDisruptionBudgetSpec(final String maxUnavailable,
                                   final String minAvailable,
                                   final PodDisruptionBudgetSpecSelector selector) {
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

    public PodDisruptionBudgetSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final PodDisruptionBudgetSpecSelector selector) {
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
        if (!(__other instanceof PodDisruptionBudgetSpec)) {
            return false;
        }
        final PodDisruptionBudgetSpec __otherCasted = (PodDisruptionBudgetSpec) __other;
        return Objects.equals(maxUnavailable, __otherCasted.maxUnavailable) &&
            Objects.equals(minAvailable, __otherCasted.minAvailable) &&
            Objects.equals(selector, __otherCasted.selector);
    }
}
