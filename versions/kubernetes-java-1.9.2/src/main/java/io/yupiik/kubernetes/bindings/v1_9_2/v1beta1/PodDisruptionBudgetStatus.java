package io.yupiik.kubernetes.bindings.v1_9_2.v1beta1;

import java.util.Map;
import java.util.Objects;

public class PodDisruptionBudgetStatus {
    private int currentHealthy;
    private int desiredHealthy;
    private Map<String, String> disruptedPods;
    private int disruptionsAllowed;
    private int expectedPods;
    private Integer observedGeneration;

    public PodDisruptionBudgetStatus() {
        // no-op
    }

    public PodDisruptionBudgetStatus(final int currentHealthy,
                                     final int desiredHealthy,
                                     final Map<String, String> disruptedPods,
                                     final int disruptionsAllowed,
                                     final int expectedPods,
                                     final Integer observedGeneration) {
        // no-op
    }

    public int getCurrentHealthy() {
        return currentHealthy;
    }

    public void setCurrentHealthy(final int currentHealthy) {
        this.currentHealthy = currentHealthy;
    }

    public int getDesiredHealthy() {
        return desiredHealthy;
    }

    public void setDesiredHealthy(final int desiredHealthy) {
        this.desiredHealthy = desiredHealthy;
    }

    public Map<String, String> getDisruptedPods() {
        return disruptedPods;
    }

    public void setDisruptedPods(final Map<String, String> disruptedPods) {
        this.disruptedPods = disruptedPods;
    }

    public int getDisruptionsAllowed() {
        return disruptionsAllowed;
    }

    public void setDisruptionsAllowed(final int disruptionsAllowed) {
        this.disruptionsAllowed = disruptionsAllowed;
    }

    public int getExpectedPods() {
        return expectedPods;
    }

    public void setExpectedPods(final int expectedPods) {
        this.expectedPods = expectedPods;
    }

    public Integer getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                currentHealthy,
                desiredHealthy,
                disruptedPods,
                disruptionsAllowed,
                expectedPods,
                observedGeneration);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodDisruptionBudgetStatus)) {
            return false;
        }
        final PodDisruptionBudgetStatus __otherCasted = (PodDisruptionBudgetStatus) __other;
        return Objects.equals(currentHealthy, __otherCasted.currentHealthy) &&
            Objects.equals(desiredHealthy, __otherCasted.desiredHealthy) &&
            Objects.equals(disruptedPods, __otherCasted.disruptedPods) &&
            Objects.equals(disruptionsAllowed, __otherCasted.disruptionsAllowed) &&
            Objects.equals(expectedPods, __otherCasted.expectedPods) &&
            Objects.equals(observedGeneration, __otherCasted.observedGeneration);
    }
}
