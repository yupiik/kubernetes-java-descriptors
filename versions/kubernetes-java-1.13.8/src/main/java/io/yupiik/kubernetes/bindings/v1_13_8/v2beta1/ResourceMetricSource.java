package io.yupiik.kubernetes.bindings.v1_13_8.v2beta1;

import io.yupiik.kubernetes.bindings.v1_13_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_13_8.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_13_8.Validable;
import io.yupiik.kubernetes.bindings.v1_13_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceMetricSource implements Validable<ResourceMetricSource>, Exportable {
    private String name;
    private Integer targetAverageUtilization;
    private String targetAverageValue;

    public ResourceMetricSource() {
        // no-op
    }

    public ResourceMetricSource(final String name,
                                final Integer targetAverageUtilization,
                                final String targetAverageValue) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getTargetAverageUtilization() {
        return targetAverageUtilization;
    }

    public void setTargetAverageUtilization(final Integer targetAverageUtilization) {
        this.targetAverageUtilization = targetAverageUtilization;
    }

    public String getTargetAverageValue() {
        return targetAverageValue;
    }

    public void setTargetAverageValue(final String targetAverageValue) {
        this.targetAverageValue = targetAverageValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                targetAverageUtilization,
                targetAverageValue);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceMetricSource)) {
            return false;
        }
        final ResourceMetricSource __otherCasted = (ResourceMetricSource) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(targetAverageUtilization, __otherCasted.targetAverageUtilization) &&
            Objects.equals(targetAverageValue, __otherCasted.targetAverageValue);
    }

    public ResourceMetricSource name(final String name) {
        this.name = name;
        return this;
    }

    public ResourceMetricSource targetAverageUtilization(final Integer targetAverageUtilization) {
        this.targetAverageUtilization = targetAverageUtilization;
        return this;
    }

    public ResourceMetricSource targetAverageValue(final String targetAverageValue) {
        this.targetAverageValue = targetAverageValue;
        return this;
    }

    @Override
    public ResourceMetricSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (targetAverageUtilization != null ? "\"targetAverageUtilization\":" + targetAverageUtilization : ""),
                    (targetAverageValue != null ? "\"targetAverageValue\":\"" +  JsonStrings.escapeJson(targetAverageValue) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
