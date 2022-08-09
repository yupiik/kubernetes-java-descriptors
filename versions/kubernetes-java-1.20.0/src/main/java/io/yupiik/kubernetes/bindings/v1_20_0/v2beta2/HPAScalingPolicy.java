package io.yupiik.kubernetes.bindings.v1_20_0.v2beta2;

import io.yupiik.kubernetes.bindings.v1_20_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_0.Validable;
import io.yupiik.kubernetes.bindings.v1_20_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class HPAScalingPolicy implements Validable<HPAScalingPolicy>, Exportable {
    private int periodSeconds;
    private String type;
    private int value;

    public HPAScalingPolicy() {
        // no-op
    }

    public HPAScalingPolicy(final int periodSeconds,
                            final String type,
                            final int value) {
        // no-op
    }

    public int getPeriodSeconds() {
        return periodSeconds;
    }

    public void setPeriodSeconds(final int periodSeconds) {
        this.periodSeconds = periodSeconds;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(final int value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                periodSeconds,
                type,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HPAScalingPolicy)) {
            return false;
        }
        final HPAScalingPolicy __otherCasted = (HPAScalingPolicy) __other;
        return Objects.equals(periodSeconds, __otherCasted.periodSeconds) &&
            Objects.equals(type, __otherCasted.type) &&
            Objects.equals(value, __otherCasted.value);
    }

    public HPAScalingPolicy periodSeconds(final int periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }

    public HPAScalingPolicy type(final String type) {
        this.type = type;
        return this;
    }

    public HPAScalingPolicy value(final int value) {
        this.value = value;
        return this;
    }

    @Override
    public HPAScalingPolicy validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (type == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "type", "type",
                "Missing 'type' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    "\"periodSeconds\":" + periodSeconds,
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""),
                    "\"value\":" + value)
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
