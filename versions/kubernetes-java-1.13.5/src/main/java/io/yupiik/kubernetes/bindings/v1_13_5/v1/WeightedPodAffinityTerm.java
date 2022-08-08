package io.yupiik.kubernetes.bindings.v1_13_5.v1;

import io.yupiik.kubernetes.bindings.v1_13_5.Validable;
import io.yupiik.kubernetes.bindings.v1_13_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WeightedPodAffinityTerm implements Validable<WeightedPodAffinityTerm> {
    private PodAffinityTerm podAffinityTerm;
    private int weight;

    public WeightedPodAffinityTerm() {
        // no-op
    }

    public WeightedPodAffinityTerm(final PodAffinityTerm podAffinityTerm,
                                   final int weight) {
        // no-op
    }

    public PodAffinityTerm getPodAffinityTerm() {
        return podAffinityTerm;
    }

    public void setPodAffinityTerm(final PodAffinityTerm podAffinityTerm) {
        this.podAffinityTerm = podAffinityTerm;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(final int weight) {
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                podAffinityTerm,
                weight);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof WeightedPodAffinityTerm)) {
            return false;
        }
        final WeightedPodAffinityTerm __otherCasted = (WeightedPodAffinityTerm) __other;
        return Objects.equals(podAffinityTerm, __otherCasted.podAffinityTerm) &&
            Objects.equals(weight, __otherCasted.weight);
    }

    public WeightedPodAffinityTerm podAffinityTerm(final PodAffinityTerm podAffinityTerm) {
        this.podAffinityTerm = podAffinityTerm;
        return this;
    }

    public WeightedPodAffinityTerm weight(final int weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public WeightedPodAffinityTerm validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (podAffinityTerm == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "podAffinityTerm", "podAffinityTerm",
                "Missing 'podAffinityTerm' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
