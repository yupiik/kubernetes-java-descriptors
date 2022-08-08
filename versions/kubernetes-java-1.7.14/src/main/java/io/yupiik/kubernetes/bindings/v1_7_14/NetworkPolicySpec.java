package io.yupiik.kubernetes.bindings.v1_7_14;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class NetworkPolicySpec {
    private List<JsonValue> ingress;
    private NetworkPolicySpecPodSelector podSelector;

    public NetworkPolicySpec() {
        // no-op
    }

    public NetworkPolicySpec(final List<JsonValue> ingress,
                             final NetworkPolicySpecPodSelector podSelector) {
        // no-op
    }

    public List<JsonValue> getIngress() {
        return ingress;
    }

    public void setIngress(final List<JsonValue> ingress) {
        this.ingress = ingress;
    }

    public NetworkPolicySpecPodSelector getPodSelector() {
        return podSelector;
    }

    public void setPodSelector(final NetworkPolicySpecPodSelector podSelector) {
        this.podSelector = podSelector;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ingress,
                podSelector);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NetworkPolicySpec)) {
            return false;
        }
        final NetworkPolicySpec __otherCasted = (NetworkPolicySpec) __other;
        return Objects.equals(ingress, __otherCasted.ingress) &&
            Objects.equals(podSelector, __otherCasted.podSelector);
    }
}
