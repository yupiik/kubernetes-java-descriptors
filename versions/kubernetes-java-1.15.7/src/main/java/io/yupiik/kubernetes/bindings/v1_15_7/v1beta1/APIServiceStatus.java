package io.yupiik.kubernetes.bindings.v1_15_7.v1beta1;

import java.util.List;
import java.util.Objects;

public class APIServiceStatus {
    private List<APIServiceStatusConditions> conditions;

    public APIServiceStatus() {
        // no-op
    }

    public APIServiceStatus(final List<APIServiceStatusConditions> conditions) {
        // no-op
    }

    public List<APIServiceStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<APIServiceStatusConditions> conditions) {
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
}
