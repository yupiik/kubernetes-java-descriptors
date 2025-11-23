package io.yupiik.kubernetes.bindings.v1_33_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_33_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_3.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ServiceCIDRSpec implements Validable<ServiceCIDRSpec>, Exportable {
    private List<String> cidrs;

    public ServiceCIDRSpec() {
        // no-op
    }

    public ServiceCIDRSpec(final List<String> cidrs) {
        this.cidrs = cidrs;
    }

    public List<String> getCidrs() {
        return cidrs;
    }

    public void setCidrs(final List<String> cidrs) {
        this.cidrs = cidrs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                cidrs);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceCIDRSpec)) {
            return false;
        }
        final ServiceCIDRSpec __otherCasted = (ServiceCIDRSpec) __other;
        return Objects.equals(cidrs, __otherCasted.cidrs);
    }

    public ServiceCIDRSpec cidrs(final List<String> cidrs) {
        this.cidrs = cidrs;
        return this;
    }

    @Override
    public ServiceCIDRSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (cidrs != null ? "\"cidrs\":" + cidrs.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
