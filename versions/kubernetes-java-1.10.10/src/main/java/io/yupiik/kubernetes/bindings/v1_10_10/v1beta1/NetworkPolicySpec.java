package io.yupiik.kubernetes.bindings.v1_10_10.v1beta1;

import io.yupiik.kubernetes.bindings.v1_10_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_10_10.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_10_10.Validable;
import io.yupiik.kubernetes.bindings.v1_10_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NetworkPolicySpec implements Validable<NetworkPolicySpec>, Exportable {
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

    @Override
    public String asJson() {
        return Stream.of(
                    (egress != null ? "\"egress\":" + egress.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (ingress != null ? "\"ingress\":" + ingress.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (podSelector != null ? "\"podSelector\":" + podSelector.asJson() : ""),
                    (policyTypes != null ? "\"policyTypes\":" + policyTypes.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
