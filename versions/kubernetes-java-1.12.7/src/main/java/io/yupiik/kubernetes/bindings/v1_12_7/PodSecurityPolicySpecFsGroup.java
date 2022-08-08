package io.yupiik.kubernetes.bindings.v1_12_7;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class PodSecurityPolicySpecFsGroup {
    private List<JsonValue> ranges;
    private String rule;

    public PodSecurityPolicySpecFsGroup() {
        // no-op
    }

    public PodSecurityPolicySpecFsGroup(final List<JsonValue> ranges,
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
        if (!(__other instanceof PodSecurityPolicySpecFsGroup)) {
            return false;
        }
        final PodSecurityPolicySpecFsGroup __otherCasted = (PodSecurityPolicySpecFsGroup) __other;
        return Objects.equals(ranges, __otherCasted.ranges) &&
            Objects.equals(rule, __otherCasted.rule);
    }
}
