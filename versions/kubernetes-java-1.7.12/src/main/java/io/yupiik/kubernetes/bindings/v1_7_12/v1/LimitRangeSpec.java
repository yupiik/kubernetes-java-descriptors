package io.yupiik.kubernetes.bindings.v1_7_12.v1;

import io.yupiik.kubernetes.bindings.v1_7_12.Validable;
import io.yupiik.kubernetes.bindings.v1_7_12.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LimitRangeSpec implements Validable<LimitRangeSpec> {
    private List<LimitRangeItem> limits;

    public LimitRangeSpec() {
        // no-op
    }

    public LimitRangeSpec(final List<LimitRangeItem> limits) {
        // no-op
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
}
