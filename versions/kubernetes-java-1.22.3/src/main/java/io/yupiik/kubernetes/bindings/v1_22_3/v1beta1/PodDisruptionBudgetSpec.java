package io.yupiik.kubernetes.bindings.v1_22_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_22_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_22_3.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodDisruptionBudgetSpec implements Validable<PodDisruptionBudgetSpec>, Exportable {
    private String maxUnavailable;
    private String minAvailable;
    private LabelSelector selector;

    public PodDisruptionBudgetSpec() {
        // no-op
    }

    public PodDisruptionBudgetSpec(final String maxUnavailable,
                                   final String minAvailable,
                                   final LabelSelector selector) {
        this.maxUnavailable = maxUnavailable;
        this.minAvailable = minAvailable;
        this.selector = selector;
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

    @Override
    public String asJson() {
        return Stream.of(
                    (maxUnavailable != null ? "\"maxUnavailable\":\"" +  JsonStrings.escapeJson(maxUnavailable) + "\"" : ""),
                    (minAvailable != null ? "\"minAvailable\":\"" +  JsonStrings.escapeJson(minAvailable) + "\"" : ""),
                    (selector != null ? "\"selector\":" + selector.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
