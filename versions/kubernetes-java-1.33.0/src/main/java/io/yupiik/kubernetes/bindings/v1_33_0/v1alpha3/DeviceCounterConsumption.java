package io.yupiik.kubernetes.bindings.v1_33_0.v1alpha3;

import io.yupiik.kubernetes.bindings.v1_33_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_0.Validable;
import io.yupiik.kubernetes.bindings.v1_33_0.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeviceCounterConsumption implements Validable<DeviceCounterConsumption>, Exportable {
    private String counterSet;
    private JsonObject counters;

    public DeviceCounterConsumption() {
        // no-op
    }

    public DeviceCounterConsumption(final String counterSet,
                                    final JsonObject counters) {
        this.counterSet = counterSet;
        this.counters = counters;
    }

    public String getCounterSet() {
        return counterSet;
    }

    public void setCounterSet(final String counterSet) {
        this.counterSet = counterSet;
    }

    public JsonObject getCounters() {
        return counters;
    }

    public void setCounters(final JsonObject counters) {
        this.counters = counters;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                counterSet,
                counters);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeviceCounterConsumption)) {
            return false;
        }
        final DeviceCounterConsumption __otherCasted = (DeviceCounterConsumption) __other;
        return Objects.equals(counterSet, __otherCasted.counterSet) &&
            Objects.equals(counters, __otherCasted.counters);
    }

    public DeviceCounterConsumption counterSet(final String counterSet) {
        this.counterSet = counterSet;
        return this;
    }

    public DeviceCounterConsumption counters(final JsonObject counters) {
        this.counters = counters;
        return this;
    }

    @Override
    public DeviceCounterConsumption validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (counterSet == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "counterSet", "counterSet",
                "Missing 'counterSet' attribute.", true));
        }
        if (counters == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "counters", "counters",
                "Missing 'counters' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (counterSet != null ? "\"counterSet\":\"" +  JsonStrings.escapeJson(counterSet) + "\"" : ""),
                    (counters != null ? "\"counters\":" + counters : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
