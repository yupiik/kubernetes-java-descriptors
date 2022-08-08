package io.yupiik.kubernetes.bindings.v1_24_0.v1;

import java.util.List;
import java.util.Objects;

public class NetworkPolicyStatus {
    private List<NetworkPolicyStatusConditions> conditions;

    public NetworkPolicyStatus() {
        // no-op
    }

    public NetworkPolicyStatus(final List<NetworkPolicyStatusConditions> conditions) {
        // no-op
    }

    public List<NetworkPolicyStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<NetworkPolicyStatusConditions> conditions) {
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
}
