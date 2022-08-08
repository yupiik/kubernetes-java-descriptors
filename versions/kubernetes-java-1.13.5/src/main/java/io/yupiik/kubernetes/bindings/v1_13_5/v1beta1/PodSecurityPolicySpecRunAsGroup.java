package io.yupiik.kubernetes.bindings.v1_13_5.v1beta1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class PodSecurityPolicySpecRunAsGroup {
    private List<JsonValue> ranges;
    private String rule;

    public PodSecurityPolicySpecRunAsGroup() {
        // no-op
    }

    public PodSecurityPolicySpecRunAsGroup(final List<JsonValue> ranges,
                                           final String rule) {
        // no-op
    }

    public List<JsonValue> getRanges() {
        return ranges;
    }

    public void setRanges(final List<JsonValue> ranges) {
        this.ranges = ranges;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(final String rule) {
        this.rule = rule;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ranges,
                rule);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodSecurityPolicySpecRunAsGroup)) {
            return false;
        }
        final PodSecurityPolicySpecRunAsGroup __otherCasted = (PodSecurityPolicySpecRunAsGroup) __other;
        return Objects.equals(ranges, __otherCasted.ranges) &&
            Objects.equals(rule, __otherCasted.rule);
    }
}
