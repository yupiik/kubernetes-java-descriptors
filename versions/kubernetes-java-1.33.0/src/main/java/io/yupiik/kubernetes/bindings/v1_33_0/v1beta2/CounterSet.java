package io.yupiik.kubernetes.bindings.v1_33_0.v1beta2;

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

public class CounterSet implements Validable<CounterSet>, Exportable {
    private JsonObject counters;
    private String name;

    public CounterSet() {
        // no-op
    }

    public CounterSet(final JsonObject counters,
                      final String name) {
        this.counters = counters;
        this.name = name;
    }

    public JsonObject getCounters() {
        return counters;
    }

    public void setCounters(final JsonObject counters) {
        this.counters = counters;
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
                counters,
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CounterSet)) {
            return false;
        }
        final CounterSet __otherCasted = (CounterSet) __other;
        return Objects.equals(counters, __otherCasted.counters) &&
            Objects.equals(name, __otherCasted.name);
    }

    public CounterSet counters(final JsonObject counters) {
        this.counters = counters;
        return this;
    }

    public CounterSet name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public CounterSet validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (counters == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "counters", "counters",
                "Missing 'counters' attribute.", true));
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
                    (counters != null ? "\"counters\":" + counters : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
