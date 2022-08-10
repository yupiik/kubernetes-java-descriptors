package io.yupiik.kubernetes.bindings.v1_22_9.v1beta1;

import io.yupiik.kubernetes.bindings.v1_22_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_22_9.Validable;
import io.yupiik.kubernetes.bindings.v1_22_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class RunAsGroupStrategyOptions implements Validable<RunAsGroupStrategyOptions>, Exportable {
    private List<IDRange> ranges;
    private String rule;

    public RunAsGroupStrategyOptions() {
        // no-op
    }

    public RunAsGroupStrategyOptions(final List<IDRange> ranges,
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
        if (!(__other instanceof RunAsGroupStrategyOptions)) {
            return false;
        }
        final RunAsGroupStrategyOptions __otherCasted = (RunAsGroupStrategyOptions) __other;
        return Objects.equals(ranges, __otherCasted.ranges) &&
            Objects.equals(rule, __otherCasted.rule);
    }

    public RunAsGroupStrategyOptions ranges(final List<IDRange> ranges) {
        this.ranges = ranges;
        return this;
    }

    public RunAsGroupStrategyOptions rule(final String rule) {
        this.rule = rule;
        return this;
    }

    @Override
    public RunAsGroupStrategyOptions validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (rule == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "rule", "rule",
                "Missing 'rule' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
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