package io.yupiik.kubernetes.bindings.v1_31_7.v1;

import io.yupiik.kubernetes.bindings.v1_31_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_7.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_7.Validable;
import io.yupiik.kubernetes.bindings.v1_31_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SelectableField implements Validable<SelectableField>, Exportable {
    private String jsonPath;

    public SelectableField() {
        // no-op
    }

    public SelectableField(final String jsonPath) {
        this.jsonPath = jsonPath;
    }

    public String getJsonPath() {
        return jsonPath;
    }

    public void setJsonPath(final String jsonPath) {
        this.jsonPath = jsonPath;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                jsonPath);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SelectableField)) {
            return false;
        }
        final SelectableField __otherCasted = (SelectableField) __other;
        return Objects.equals(jsonPath, __otherCasted.jsonPath);
    }

    public SelectableField jsonPath(final String jsonPath) {
        this.jsonPath = jsonPath;
        return this;
    }

    @Override
    public SelectableField validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (jsonPath == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "jsonPath", "jsonPath",
                "Missing 'jsonPath' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (jsonPath != null ? "\"jsonPath\":\"" +  JsonStrings.escapeJson(jsonPath) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
