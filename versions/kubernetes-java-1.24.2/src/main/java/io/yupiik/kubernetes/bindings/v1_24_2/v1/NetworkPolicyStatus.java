package io.yupiik.kubernetes.bindings.v1_24_2.v1;

import io.yupiik.kubernetes.bindings.v1_24_2.Validable;
import io.yupiik.kubernetes.bindings.v1_24_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NetworkPolicyStatus implements Validable<NetworkPolicyStatus> {
    private List<Condition> conditions;

    public NetworkPolicyStatus() {
        // no-op
    }

    public NetworkPolicyStatus(final List<Condition> conditions) {
        // no-op
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<Condition> conditions) {
        this.conditions = conditions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NetworkPolicyStatus)) {
            return false;
        }
        final NetworkPolicyStatus __otherCasted = (NetworkPolicyStatus) __other;
        return Objects.equals(conditions, __otherCasted.conditions);
    }

    public NetworkPolicyStatus conditions(final List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }

    @Override
    public NetworkPolicyStatus validate() {
        return this;
    }
}
