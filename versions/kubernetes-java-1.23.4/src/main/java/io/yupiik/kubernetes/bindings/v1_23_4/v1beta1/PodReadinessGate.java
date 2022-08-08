package io.yupiik.kubernetes.bindings.v1_23_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_4.Validable;
import io.yupiik.kubernetes.bindings.v1_23_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PodReadinessGate implements Validable<PodReadinessGate> {
    private PodReadinessGateConditionType conditionType;

    public PodReadinessGate() {
        // no-op
    }

    public PodReadinessGate(final PodReadinessGateConditionType conditionType) {
        // no-op
    }

    public PodReadinessGateConditionType getConditionType() {
        return conditionType;
    }

    public void setConditionType(final PodReadinessGateConditionType conditionType) {
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

    public PodReadinessGate conditionType(final PodReadinessGateConditionType conditionType) {
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
