package io.yupiik.kubernetes.bindings.v1_7_1.v1beta1;

import io.yupiik.kubernetes.bindings.v1_7_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_7_1.Validable;
import io.yupiik.kubernetes.bindings.v1_7_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NetworkPolicySpec implements Validable<NetworkPolicySpec>, Exportable {
    private List<NetworkPolicyIngressRule> ingress;
    private LabelSelector podSelector;

    public NetworkPolicySpec() {
        // no-op
    }

    public NetworkPolicySpec(final List<NetworkPolicyIngressRule> ingress,
                             final LabelSelector podSelector) {
        // no-op
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

    public NetworkPolicySpec ingress(final List<NetworkPolicyIngressRule> ingress) {
        this.ingress = ingress;
        return this;
    }

    public NetworkPolicySpec podSelector(final LabelSelector podSelector) {
        this.podSelector = podSelector;
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
                    (ingress != null ? "\"ingress\":" + ingress.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (podSelector != null ? "\"podSelector\":" + podSelector.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
