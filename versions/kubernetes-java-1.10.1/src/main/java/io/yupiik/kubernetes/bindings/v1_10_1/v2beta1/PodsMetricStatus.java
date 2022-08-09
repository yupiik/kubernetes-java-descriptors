package io.yupiik.kubernetes.bindings.v1_10_1.v2beta1;

import io.yupiik.kubernetes.bindings.v1_10_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_10_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_10_1.Validable;
import io.yupiik.kubernetes.bindings.v1_10_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodsMetricStatus implements Validable<PodsMetricStatus>, Exportable {
    private String currentAverageValue;
    private String metricName;

    public PodsMetricStatus() {
        // no-op
    }

    public PodsMetricStatus(final String currentAverageValue,
                            final String metricName) {
        // no-op
    }

    public String getCurrentAverageValue() {
        return currentAverageValue;
    }

    public void setCurrentAverageValue(final String currentAverageValue) {
        this.currentAverageValue = currentAverageValue;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(final String metricName) {
        this.metricName = metricName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                currentAverageValue,
                metricName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodsMetricStatus)) {
            return false;
        }
        final PodsMetricStatus __otherCasted = (PodsMetricStatus) __other;
        return Objects.equals(currentAverageValue, __otherCasted.currentAverageValue) &&
            Objects.equals(metricName, __otherCasted.metricName);
    }

    public PodsMetricStatus currentAverageValue(final String currentAverageValue) {
        this.currentAverageValue = currentAverageValue;
        return this;
    }

    public PodsMetricStatus metricName(final String metricName) {
        this.metricName = metricName;
        return this;
    }

    @Override
    public PodsMetricStatus validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (currentAverageValue == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "currentAverageValue", "currentAverageValue",
                "Missing 'currentAverageValue' attribute.", true));
        }
        if (metricName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "metricName", "metricName",
                "Missing 'metricName' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (currentAverageValue != null ? "\"currentAverageValue\":\"" +  JsonStrings.escapeJson(currentAverageValue) + "\"" : ""),
                    (metricName != null ? "\"metricName\":\"" +  JsonStrings.escapeJson(metricName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
