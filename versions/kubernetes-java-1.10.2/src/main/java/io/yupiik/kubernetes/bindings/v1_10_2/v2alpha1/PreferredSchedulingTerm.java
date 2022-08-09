package io.yupiik.kubernetes.bindings.v1_10_2.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_10_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_10_2.Validable;
import io.yupiik.kubernetes.bindings.v1_10_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PreferredSchedulingTerm implements Validable<PreferredSchedulingTerm>, Exportable {
    private NodeSelectorTerm preference;
    private int weight;

    public PreferredSchedulingTerm() {
        // no-op
    }

    public PreferredSchedulingTerm(final NodeSelectorTerm preference,
                                   final int weight) {
        // no-op
    }

    public NodeSelectorTerm getPreference() {
        return preference;
    }

    public void setPreference(final NodeSelectorTerm preference) {
        this.preference = preference;
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
                preference,
                weight);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PreferredSchedulingTerm)) {
            return false;
        }
        final PreferredSchedulingTerm __otherCasted = (PreferredSchedulingTerm) __other;
        return Objects.equals(preference, __otherCasted.preference) &&
            Objects.equals(weight, __otherCasted.weight);
    }

    public PreferredSchedulingTerm preference(final NodeSelectorTerm preference) {
        this.preference = preference;
        return this;
    }

    public PreferredSchedulingTerm weight(final int weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public PreferredSchedulingTerm validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (preference == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "preference", "preference",
                "Missing 'preference' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (preference != null ? "\"preference\":" + preference.asJson() : ""),
                    "\"weight\":" + weight)
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
