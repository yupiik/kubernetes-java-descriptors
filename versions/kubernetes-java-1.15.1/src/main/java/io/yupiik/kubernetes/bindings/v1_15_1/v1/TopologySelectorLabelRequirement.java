package io.yupiik.kubernetes.bindings.v1_15_1.v1;

import io.yupiik.kubernetes.bindings.v1_15_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_15_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_15_1.Validable;
import io.yupiik.kubernetes.bindings.v1_15_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class TopologySelectorLabelRequirement implements Validable<TopologySelectorLabelRequirement>, Exportable {
    private String key;
    private List<String> values;

    public TopologySelectorLabelRequirement() {
        // no-op
    }

    public TopologySelectorLabelRequirement(final String key,
                                            final List<String> values) {
        // no-op
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(final List<String> values) {
        this.values = values;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                key,
                values);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof TopologySelectorLabelRequirement)) {
            return false;
        }
        final TopologySelectorLabelRequirement __otherCasted = (TopologySelectorLabelRequirement) __other;
        return Objects.equals(key, __otherCasted.key) &&
            Objects.equals(values, __otherCasted.values);
    }

    public TopologySelectorLabelRequirement key(final String key) {
        this.key = key;
        return this;
    }

    public TopologySelectorLabelRequirement values(final List<String> values) {
        this.values = values;
        return this;
    }

    @Override
    public TopologySelectorLabelRequirement validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (key == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "key", "key",
                "Missing 'key' attribute.", true));
        }
        if (values == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "values", "values",
                "Missing 'values' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (key != null ? "\"key\":\"" +  JsonStrings.escapeJson(key) + "\"" : ""),
                    (values != null ? "\"values\":" + values.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
