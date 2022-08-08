package io.yupiik.kubernetes.bindings.v1_9_0.v1beta1;

import io.yupiik.kubernetes.bindings.v1_9_0.Validable;
import io.yupiik.kubernetes.bindings.v1_9_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FSGroupStrategyOptions implements Validable<FSGroupStrategyOptions> {
    private List<IDRange> ranges;
    private String rule;

    public FSGroupStrategyOptions() {
        // no-op
    }

    public FSGroupStrategyOptions(final List<IDRange> ranges,
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
        if (!(__other instanceof FSGroupStrategyOptions)) {
            return false;
        }
        final FSGroupStrategyOptions __otherCasted = (FSGroupStrategyOptions) __other;
        return Objects.equals(ranges, __otherCasted.ranges) &&
            Objects.equals(rule, __otherCasted.rule);
    }

    public FSGroupStrategyOptions ranges(final List<IDRange> ranges) {
        this.ranges = ranges;
        return this;
    }

    public FSGroupStrategyOptions rule(final String rule) {
        this.rule = rule;
        return this;
    }

    @Override
    public FSGroupStrategyOptions validate() {
        return this;
    }
}
