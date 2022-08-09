package io.yupiik.kubernetes.bindings.v1_10_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_10_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_10_4.Validable;
import io.yupiik.kubernetes.bindings.v1_10_4.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodDisruptionBudgetStatus implements Validable<PodDisruptionBudgetStatus>, Exportable {
    private int currentHealthy;
    private int desiredHealthy;
    private JsonObject disruptedPods;
    private int disruptionsAllowed;
    private int expectedPods;
    private Integer observedGeneration;

    public PodDisruptionBudgetStatus() {
        // no-op
    }

    public PodDisruptionBudgetStatus(final int currentHealthy,
                                     final int desiredHealthy,
                                     final JsonObject disruptedPods,
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

    public JsonObject getDisruptedPods() {
        return disruptedPods;
    }

    public void setDisruptedPods(final JsonObject disruptedPods) {
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

    public PodDisruptionBudgetStatus currentHealthy(final int currentHealthy) {
        this.currentHealthy = currentHealthy;
        return this;
    }

    public PodDisruptionBudgetStatus desiredHealthy(final int desiredHealthy) {
        this.desiredHealthy = desiredHealthy;
        return this;
    }

    public PodDisruptionBudgetStatus disruptedPods(final JsonObject disruptedPods) {
        this.disruptedPods = disruptedPods;
        return this;
    }

    public PodDisruptionBudgetStatus disruptionsAllowed(final int disruptionsAllowed) {
        this.disruptionsAllowed = disruptionsAllowed;
        return this;
    }

    public PodDisruptionBudgetStatus expectedPods(final int expectedPods) {
        this.expectedPods = expectedPods;
        return this;
    }

    public PodDisruptionBudgetStatus observedGeneration(final Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    @Override
    public PodDisruptionBudgetStatus validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (disruptedPods == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "disruptedPods", "disruptedPods",
                "Missing 'disruptedPods' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    "\"currentHealthy\":" + currentHealthy,
                    "\"desiredHealthy\":" + desiredHealthy,
                    (disruptedPods != null ? "\"disruptedPods\":" + disruptedPods : ""),
                    "\"disruptionsAllowed\":" + disruptionsAllowed,
                    "\"expectedPods\":" + expectedPods,
                    (observedGeneration != null ? "\"observedGeneration\":" + observedGeneration : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
