package io.yupiik.kubernetes.bindings.v1_8_6;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class NetworkPolicySpec {
    private List<JsonValue> egress;
    private List<JsonValue> ingress;
    private NetworkPolicySpecPodSelector podSelector;
    private List<String> policyTypes;

    public NetworkPolicySpec() {
        // no-op
    }

    public NetworkPolicySpec(final List<JsonValue> egress,
                             final List<JsonValue> ingress,
                             final NetworkPolicySpecPodSelector podSelector,
                             final List<String> policyTypes) {
        // no-op
    }

    public List<JsonValue> getEgress() {
        return egress;
    }

    public void setEgress(final List<JsonValue> egress) {
        this.egress = egress;
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

    public List<String> getPolicyTypes() {
        return policyTypes;
    }

    public void setPolicyTypes(final List<String> policyTypes) {
        this.policyTypes = policyTypes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                egress,
                ingress,
                podSelector,
                policyTypes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NetworkPolicySpec)) {
            return false;
        }
        final NetworkPolicySpec __otherCasted = (NetworkPolicySpec) __other;
        return Objects.equals(egress, __otherCasted.egress) &&
            Objects.equals(ingress, __otherCasted.ingress) &&
            Objects.equals(podSelector, __otherCasted.podSelector) &&
            Objects.equals(policyTypes, __otherCasted.policyTypes);
    }
}
