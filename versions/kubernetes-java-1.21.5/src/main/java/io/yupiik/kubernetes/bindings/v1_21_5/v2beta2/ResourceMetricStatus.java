package io.yupiik.kubernetes.bindings.v1_21_5.v2beta2;

import io.yupiik.kubernetes.bindings.v1_21_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_21_5.Validable;
import io.yupiik.kubernetes.bindings.v1_21_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceMetricStatus implements Validable<ResourceMetricStatus>, Exportable {
    private MetricValueStatus current;
    private String name;

    public ResourceMetricStatus() {
        // no-op
    }

    public ResourceMetricStatus(final MetricValueStatus current,
                                final String name) {
        // no-op
    }

    public MetricValueStatus getCurrent() {
        return current;
    }

    public void setCurrent(final MetricValueStatus current) {
        this.current = current;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                current,
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceMetricStatus)) {
            return false;
        }
        final ResourceMetricStatus __otherCasted = (ResourceMetricStatus) __other;
        return Objects.equals(current, __otherCasted.current) &&
            Objects.equals(name, __otherCasted.name);
    }

    public ResourceMetricStatus current(final MetricValueStatus current) {
        this.current = current;
        return this;
    }

    public ResourceMetricStatus name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public ResourceMetricStatus validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (current == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "current", "current",
                "Missing 'current' attribute.", true));
        }
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
                    (current != null ? "\"current\":" + current.asJson() : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
