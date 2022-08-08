package io.yupiik.kubernetes.bindings.v1_11_5.v1beta1;

import io.yupiik.kubernetes.bindings.v1_11_5.Validable;
import io.yupiik.kubernetes.bindings.v1_11_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NetworkPolicySpec implements Validable<NetworkPolicySpec> {
    private List<NetworkPolicyEgressRule> egress;
    private List<NetworkPolicyIngressRule> ingress;
    private LabelSelector podSelector;
    private List<String> policyTypes;

    public NetworkPolicySpec() {
        // no-op
    }

    public NetworkPolicySpec(final List<NetworkPolicyEgressRule> egress,
                             final List<NetworkPolicyIngressRule> ingress,
                             final LabelSelector podSelector,
                             final List<String> policyTypes) {
        // no-op
    }

    public List<NetworkPolicyEgressRule> getEgress() {
        return egress;
    }

    public void setEgress(final List<NetworkPolicyEgressRule> egress) {
        this.egress = egress;
    }

    public List<NetworkPolicyIngressRule> getIngress() {
        return ingress;
    }

    public void setIngress(final List<NetworkPolicyIngressRule> ingress) {
        this.ingress = ingress;
    }

    public LabelSelector getPodSelector() {
        return podSelector;
    }

    public void setPodSelector(final LabelSelector podSelector) {
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

    public NetworkPolicySpec egress(final List<NetworkPolicyEgressRule> egress) {
        this.egress = egress;
        return this;
    }

    public NetworkPolicySpec ingress(final List<NetworkPolicyIngressRule> ingress) {
        this.ingress = ingress;
        return this;
    }

    public NetworkPolicySpec podSelector(final LabelSelector podSelector) {
        this.podSelector = podSelector;
        return this;
    }

    public NetworkPolicySpec policyTypes(final List<String> policyTypes) {
        this.policyTypes = policyTypes;
        return this;
    }

    @Override
    public NetworkPolicySpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (podSelector == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "podSelector", "podSelector",
                "Missing 'podSelector' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
