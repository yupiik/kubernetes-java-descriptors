package io.yupiik.kubernetes.bindings.v1_24_3;

import java.util.List;
import java.util.Objects;

public class NetworkPolicyListItemsStatus {
    private List<NetworkPolicyListItemsStatusConditions> conditions;

    public NetworkPolicyListItemsStatus() {
        // no-op
    }

    public NetworkPolicyListItemsStatus(final List<NetworkPolicyListItemsStatusConditions> conditions) {
        // no-op
    }

    public List<NetworkPolicyListItemsStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<NetworkPolicyListItemsStatusConditions> conditions) {
        this.conditions = conditions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                conditions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NetworkPolicyListItemsStatus)) {
            return false;
        }
        final NetworkPolicyListItemsStatus __otherCasted = (NetworkPolicyListItemsStatus) __other;
        return Objects.equals(conditions, __otherCasted.conditions);
    }
}
