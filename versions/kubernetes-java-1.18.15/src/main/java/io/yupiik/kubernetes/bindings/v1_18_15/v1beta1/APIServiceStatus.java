package io.yupiik.kubernetes.bindings.v1_18_15.v1beta1;

import io.yupiik.kubernetes.bindings.v1_18_15.Validable;
import io.yupiik.kubernetes.bindings.v1_18_15.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class APIServiceStatus implements Validable<APIServiceStatus> {
    private List<APIServiceCondition> conditions;

    public APIServiceStatus() {
        // no-op
    }

    public APIServiceStatus(final List<APIServiceCondition> conditions) {
        // no-op
    }

    public List<APIServiceCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<APIServiceCondition> conditions) {
        this.conditions = conditions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof APIServiceStatus)) {
            return false;
        }
        final APIServiceStatus __otherCasted = (APIServiceStatus) __other;
        return Objects.equals(conditions, __otherCasted.conditions);
    }

    public APIServiceStatus conditions(final List<APIServiceCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    @Override
    public APIServiceStatus validate() {
        return this;
    }
}
