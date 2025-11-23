package io.yupiik.kubernetes.bindings.v1_30_12.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_30_12.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_12.Validable;
import io.yupiik.kubernetes.bindings.v1_30_12.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NamedResourcesIntSlice implements Validable<NamedResourcesIntSlice>, Exportable {
    private List<Integer> ints;

    public NamedResourcesIntSlice() {
        // no-op
    }

    public NamedResourcesIntSlice(final List<Integer> ints) {
        this.ints = ints;
    }

    public List<Integer> getInts() {
        return ints;
    }

    public void setInts(final List<Integer> ints) {
        this.ints = ints;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ints);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NamedResourcesIntSlice)) {
            return false;
        }
        final NamedResourcesIntSlice __otherCasted = (NamedResourcesIntSlice) __other;
        return Objects.equals(ints, __otherCasted.ints);
    }

    public NamedResourcesIntSlice ints(final List<Integer> ints) {
        this.ints = ints;
        return this;
    }

    @Override
    public NamedResourcesIntSlice validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (ints == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "ints", "ints",
                "Missing 'ints' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (ints != null ? "\"ints\":" + ints.stream().map(__it -> __it == null ? "null" : String.valueOf(__it)).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
