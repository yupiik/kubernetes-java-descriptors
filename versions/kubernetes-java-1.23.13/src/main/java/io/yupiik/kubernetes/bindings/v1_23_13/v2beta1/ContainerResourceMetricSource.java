package io.yupiik.kubernetes.bindings.v1_23_13.v2beta1;

import io.yupiik.kubernetes.bindings.v1_23_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_13.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_23_13.Validable;
import io.yupiik.kubernetes.bindings.v1_23_13.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ContainerResourceMetricSource implements Validable<ContainerResourceMetricSource>, Exportable {
    private String container;
    private String name;
    private Integer targetAverageUtilization;
    private String targetAverageValue;

    public ContainerResourceMetricSource() {
        // no-op
    }

    public ContainerResourceMetricSource(final String container,
                                         final String name,
                                         final Integer targetAverageUtilization,
                                         final String targetAverageValue) {
        this.container = container;
        this.name = name;
        this.targetAverageUtilization = targetAverageUtilization;
        this.targetAverageValue = targetAverageValue;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(final String container) {
        this.container = container;
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
                container,
                name,
                targetAverageUtilization,
                targetAverageValue);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ContainerResourceMetricSource)) {
            return false;
        }
        final ContainerResourceMetricSource __otherCasted = (ContainerResourceMetricSource) __other;
        return Objects.equals(container, __otherCasted.container) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(targetAverageUtilization, __otherCasted.targetAverageUtilization) &&
            Objects.equals(targetAverageValue, __otherCasted.targetAverageValue);
    }

    public ContainerResourceMetricSource container(final String container) {
        this.container = container;
        return this;
    }

    public ContainerResourceMetricSource name(final String name) {
        this.name = name;
        return this;
    }

    public ContainerResourceMetricSource targetAverageUtilization(final Integer targetAverageUtilization) {
        this.targetAverageUtilization = targetAverageUtilization;
        return this;
    }

    public ContainerResourceMetricSource targetAverageValue(final String targetAverageValue) {
        this.targetAverageValue = targetAverageValue;
        return this;
    }

    @Override
    public ContainerResourceMetricSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (container == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "container", "container",
                "Missing 'container' attribute.", true));
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
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (targetAverageUtilization != null ? "\"targetAverageUtilization\":" + targetAverageUtilization : ""),
                    (targetAverageValue != null ? "\"targetAverageValue\":\"" +  JsonStrings.escapeJson(targetAverageValue) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
