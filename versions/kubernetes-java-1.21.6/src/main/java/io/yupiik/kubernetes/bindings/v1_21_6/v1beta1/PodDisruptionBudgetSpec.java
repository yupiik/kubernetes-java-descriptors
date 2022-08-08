package io.yupiik.kubernetes.bindings.v1_21_6.v1beta1;

import io.yupiik.kubernetes.bindings.v1_21_6.Validable;
import io.yupiik.kubernetes.bindings.v1_21_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PodDisruptionBudgetSpec implements Validable<PodDisruptionBudgetSpec> {
    private String maxUnavailable;
    private String minAvailable;
    private LabelSelector selector;

    public PodDisruptionBudgetSpec() {
        // no-op
    }

    public PodDisruptionBudgetSpec(final String maxUnavailable,
                                   final String minAvailable,
                                   final LabelSelector selector) {
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

    public LabelSelector getSelector() {
        return selector;
    }

    public void setSelector(final LabelSelector selector) {
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

    public PodDisruptionBudgetSpec maxUnavailable(final String maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
        return this;
    }

    public PodDisruptionBudgetSpec minAvailable(final String minAvailable) {
        this.minAvailable = minAvailable;
        return this;
    }

    public PodDisruptionBudgetSpec selector(final LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    @Override
    public PodDisruptionBudgetSpec validate() {
        return this;
    }
}
