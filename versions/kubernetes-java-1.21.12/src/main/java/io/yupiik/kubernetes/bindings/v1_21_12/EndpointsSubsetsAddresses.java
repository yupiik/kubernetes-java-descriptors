package io.yupiik.kubernetes.bindings.v1_21_12;

import java.util.Objects;

public class EndpointsSubsetsAddresses {
    private String hostname;
    private String ip;
    private String nodeName;
    private EndpointsSubsetsAddressesTargetRef targetRef;

    public EndpointsSubsetsAddresses() {
        // no-op
    }

    public EndpointsSubsetsAddresses(final String hostname,
                                     final String ip,
                                     final String nodeName,
                                     final EndpointsSubsetsAddressesTargetRef targetRef) {
        // no-op
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(final String hostname) {
        this.hostname = hostname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(final String ip) {
        this.ip = ip;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(final String nodeName) {
        this.nodeName = nodeName;
    }

    public EndpointsSubsetsAddressesTargetRef getTargetRef() {
        return targetRef;
    }

    public void setTargetRef(final EndpointsSubsetsAddressesTargetRef targetRef) {
        this.targetRef = targetRef;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hostname,
                ip,
                nodeName,
                targetRef);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EndpointsSubsetsAddresses)) {
            return false;
        }
        final EndpointsSubsetsAddresses __otherCasted = (EndpointsSubsetsAddresses) __other;
        return Objects.equals(hostname, __otherCasted.hostname) &&
            Objects.equals(ip, __otherCasted.ip) &&
            Objects.equals(nodeName, __otherCasted.nodeName) &&
            Objects.equals(targetRef, __otherCasted.targetRef);
    }
}
