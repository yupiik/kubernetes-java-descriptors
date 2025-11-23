package io.yupiik.kubernetes.bindings.v1_27_2.v2;

import io.yupiik.kubernetes.bindings.v1_27_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_27_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_27_2.Validable;
import io.yupiik.kubernetes.bindings.v1_27_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ContainerResourceMetricStatus implements Validable<ContainerResourceMetricStatus>, Exportable {
    private String container;
    private MetricValueStatus current;
    private String name;

    public ContainerResourceMetricStatus() {
        // no-op
    }

    public ContainerResourceMetricStatus(final String container,
                                         final MetricValueStatus current,
                                         final String name) {
        this.container = container;
        this.current = current;
        this.name = name;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(final String container) {
        this.container = container;
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
                container,
                current,
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ContainerResourceMetricStatus)) {
            return false;
        }
        final ContainerResourceMetricStatus __otherCasted = (ContainerResourceMetricStatus) __other;
        return Objects.equals(container, __otherCasted.container) &&
            Objects.equals(current, __otherCasted.current) &&
            Objects.equals(name, __otherCasted.name);
    }

    public ContainerResourceMetricStatus container(final String container) {
        this.container = container;
        return this;
    }

    public ContainerResourceMetricStatus current(final MetricValueStatus current) {
        this.current = current;
        return this;
    }

    public ContainerResourceMetricStatus name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public ContainerResourceMetricStatus validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (container == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "container", "container",
                "Missing 'container' attribute.", true));
        }
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
                    (container != null ? "\"container\":\"" +  JsonStrings.escapeJson(container) + "\"" : ""),
                    (current != null ? "\"current\":" + current.asJson() : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
