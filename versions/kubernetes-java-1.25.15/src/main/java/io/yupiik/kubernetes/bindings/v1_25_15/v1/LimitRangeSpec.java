package io.yupiik.kubernetes.bindings.v1_25_15.v1;

import io.yupiik.kubernetes.bindings.v1_25_15.Exportable;
import io.yupiik.kubernetes.bindings.v1_25_15.Validable;
import io.yupiik.kubernetes.bindings.v1_25_15.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class LimitRangeSpec implements Validable<LimitRangeSpec>, Exportable {
    private List<LimitRangeItem> limits;

    public LimitRangeSpec() {
        // no-op
    }

    public LimitRangeSpec(final List<LimitRangeItem> limits) {
        this.limits = limits;
    }

    public List<LimitRangeItem> getLimits() {
        return limits;
    }

    public void setLimits(final List<LimitRangeItem> limits) {
        this.limits = limits;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                limits);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof LimitRangeSpec)) {
            return false;
        }
        final LimitRangeSpec __otherCasted = (LimitRangeSpec) __other;
        return Objects.equals(limits, __otherCasted.limits);
    }

    public LimitRangeSpec limits(final List<LimitRangeItem> limits) {
        this.limits = limits;
        return this;
    }

    @Override
    public LimitRangeSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (limits == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "limits", "limits",
                "Missing 'limits' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (limits != null ? "\"limits\":" + limits.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
