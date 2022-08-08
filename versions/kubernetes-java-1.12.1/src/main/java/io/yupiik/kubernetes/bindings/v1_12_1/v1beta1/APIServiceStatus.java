package io.yupiik.kubernetes.bindings.v1_12_1.v1beta1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class APIServiceStatus {
    private List<JsonValue> conditions;

    public APIServiceStatus() {
        // no-op
    }

    public APIServiceStatus(final List<JsonValue> conditions) {
        // no-op
    }

    public List<JsonValue> getConditions() {
        return conditions;
    }

    public void setConditions(final List<JsonValue> conditions) {
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
