package io.yupiik.kubernetes.bindings.v1_7_0.v1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class LimitRangeSpec {
    private List<JsonValue> limits;

    public LimitRangeSpec() {
        // no-op
    }

    public LimitRangeSpec(final List<JsonValue> limits) {
        // no-op
    }

    public List<JsonValue> getLimits() {
        return limits;
    }

    public void setLimits(final List<JsonValue> limits) {
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
}
