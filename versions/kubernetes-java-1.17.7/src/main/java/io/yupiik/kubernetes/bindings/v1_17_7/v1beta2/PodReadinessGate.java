package io.yupiik.kubernetes.bindings.v1_17_7.v1beta2;

import io.yupiik.kubernetes.bindings.v1_17_7.Validable;
import io.yupiik.kubernetes.bindings.v1_17_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PodReadinessGate implements Validable<PodReadinessGate> {
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
}
