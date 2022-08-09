package io.yupiik.kubernetes.bindings.v1_11_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_11_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_11_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_11_4.Validable;
import io.yupiik.kubernetes.bindings.v1_11_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SupplementalGroupsStrategyOptions implements Validable<SupplementalGroupsStrategyOptions>, Exportable {
    private List<IDRange> ranges;
    private String rule;

    public SupplementalGroupsStrategyOptions() {
        // no-op
    }

    public SupplementalGroupsStrategyOptions(final List<IDRange> ranges,
                                             final String rule) {
        // no-op
    }

    public List<IDRange> getRanges() {
        return ranges;
    }

    public void setRanges(final List<IDRange> ranges) {
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
        if (!(__other instanceof SupplementalGroupsStrategyOptions)) {
            return false;
        }
        final SupplementalGroupsStrategyOptions __otherCasted = (SupplementalGroupsStrategyOptions) __other;
        return Objects.equals(ranges, __otherCasted.ranges) &&
            Objects.equals(rule, __otherCasted.rule);
    }

    public SupplementalGroupsStrategyOptions ranges(final List<IDRange> ranges) {
        this.ranges = ranges;
        return this;
    }

    public SupplementalGroupsStrategyOptions rule(final String rule) {
        this.rule = rule;
        return this;
    }

    @Override
    public SupplementalGroupsStrategyOptions validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (ranges != null ? "\"ranges\":" + ranges.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (rule != null ? "\"rule\":\"" +  JsonStrings.escapeJson(rule) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
