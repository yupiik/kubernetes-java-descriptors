package io.yupiik.kubernetes.bindings.v1_25_1.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_25_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_25_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_25_1.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ClusterCIDRSpec implements Validable<ClusterCIDRSpec>, Exportable {
    private String ipv4;
    private String ipv6;
    private NodeSelector nodeSelector;
    private int perNodeHostBits;

    public ClusterCIDRSpec() {
        // no-op
    }

    public ClusterCIDRSpec(final String ipv4,
                           final String ipv6,
                           final NodeSelector nodeSelector,
                           final int perNodeHostBits) {
        this.ipv4 = ipv4;
        this.ipv6 = ipv6;
        this.nodeSelector = nodeSelector;
        this.perNodeHostBits = perNodeHostBits;
    }

    public String getIpv4() {
        return ipv4;
    }

    public void setIpv4(final String ipv4) {
        this.ipv4 = ipv4;
    }

    public String getIpv6() {
        return ipv6;
    }

    public void setIpv6(final String ipv6) {
        this.ipv6 = ipv6;
    }

    public NodeSelector getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(final NodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    public int getPerNodeHostBits() {
        return perNodeHostBits;
    }

    public void setPerNodeHostBits(final int perNodeHostBits) {
        this.perNodeHostBits = perNodeHostBits;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ipv4,
                ipv6,
                nodeSelector,
                perNodeHostBits);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ClusterCIDRSpec)) {
            return false;
        }
        final ClusterCIDRSpec __otherCasted = (ClusterCIDRSpec) __other;
        return Objects.equals(ipv4, __otherCasted.ipv4) &&
            Objects.equals(ipv6, __otherCasted.ipv6) &&
            Objects.equals(nodeSelector, __otherCasted.nodeSelector) &&
            Objects.equals(perNodeHostBits, __otherCasted.perNodeHostBits);
    }

    public ClusterCIDRSpec ipv4(final String ipv4) {
        this.ipv4 = ipv4;
        return this;
    }

    public ClusterCIDRSpec ipv6(final String ipv6) {
        this.ipv6 = ipv6;
        return this;
    }

    public ClusterCIDRSpec nodeSelector(final NodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }

    public ClusterCIDRSpec perNodeHostBits(final int perNodeHostBits) {
        this.perNodeHostBits = perNodeHostBits;
        return this;
    }

    @Override
    public ClusterCIDRSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (ipv4 != null ? "\"ipv4\":\"" +  JsonStrings.escapeJson(ipv4) + "\"" : ""),
                    (ipv6 != null ? "\"ipv6\":\"" +  JsonStrings.escapeJson(ipv6) + "\"" : ""),
                    (nodeSelector != null ? "\"nodeSelector\":" + nodeSelector.asJson() : ""),
                    "\"perNodeHostBits\":" + perNodeHostBits)
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
