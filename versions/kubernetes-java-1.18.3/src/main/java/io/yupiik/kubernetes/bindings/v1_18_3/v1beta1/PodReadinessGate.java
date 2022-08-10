package io.yupiik.kubernetes.bindings.v1_18_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_18_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_18_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_18_3.Validable;
import io.yupiik.kubernetes.bindings.v1_18_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodReadinessGate implements Validable<PodReadinessGate>, Exportable {
    private String conditionType;

    public PodReadinessGate() {
        // no-op
    }

    public PodReadinessGate(final String conditionType) {
        // no-op
    }

    public String getConditionType() {
        return conditionType;
    }

    public void setConditionType(final String conditionType) {
        this.conditionType = conditionType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditionType);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodReadinessGate)) {
            return false;
        }
        final PodReadinessGate __otherCasted = (PodReadinessGate) __other;
        return Objects.equals(conditionType, __otherCasted.conditionType);
    }

    public PodReadinessGate conditionType(final String conditionType) {
        this.conditionType = conditionType;
        return this;
    }

    @Override
    public PodReadinessGate validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (conditionType == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "conditionType", "conditionType",
                "Missing 'conditionType' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (conditionType != null ? "\"conditionType\":\"" +  JsonStrings.escapeJson(conditionType) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}