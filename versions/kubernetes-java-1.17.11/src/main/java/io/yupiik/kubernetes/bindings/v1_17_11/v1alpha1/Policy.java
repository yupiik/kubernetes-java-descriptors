package io.yupiik.kubernetes.bindings.v1_17_11.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_17_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_17_11.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_17_11.Validable;
import io.yupiik.kubernetes.bindings.v1_17_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Policy implements Validable<Policy>, Exportable {
    private String level;
    private List<String> stages;

    public Policy() {
        // no-op
    }

    public Policy(final String level,
                  final List<String> stages) {
        // no-op
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(final String level) {
        this.level = level;
    }

    public List<String> getStages() {
        return stages;
    }

    public void setStages(final List<String> stages) {
        this.stages = stages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                level,
                stages);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Policy)) {
            return false;
        }
        final Policy __otherCasted = (Policy) __other;
        return Objects.equals(level, __otherCasted.level) &&
            Objects.equals(stages, __otherCasted.stages);
    }

    public Policy level(final String level) {
        this.level = level;
        return this;
    }

    public Policy stages(final List<String> stages) {
        this.stages = stages;
        return this;
    }

    @Override
    public Policy validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (level == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "level", "level",
                "Missing 'level' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (level != null ? "\"level\":\"" +  JsonStrings.escapeJson(level) + "\"" : ""),
                    (stages != null ? "\"stages\":" + stages.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
