package io.yupiik.kubernetes.bindings.v1_14_5;

import java.util.Objects;

public class EndpointsSubsetsNotReadyAddresses {
    private String hostname;
    private String ip;
    private String nodeName;
    private EndpointsSubsetsNotReadyAddressesTargetRef targetRef;

    public EndpointsSubsetsNotReadyAddresses() {
        // no-op
    }

    public EndpointsSubsetsNotReadyAddresses(final String hostname,
                                             final String ip,
                                             final String nodeName,
                                             final EndpointsSubsetsNotReadyAddressesTargetRef targetRef) {
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

    public EndpointsSubsetsNotReadyAddressesTargetRef getTargetRef() {
        return targetRef;
    }

    public void setTargetRef(final EndpointsSubsetsNotReadyAddressesTargetRef targetRef) {
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
        if (!(__other instanceof EndpointsSubsetsNotReadyAddresses)) {
            return false;
        }
        final EndpointsSubsetsNotReadyAddresses __otherCasted = (EndpointsSubsetsNotReadyAddresses) __other;
        return Objects.equals(hostname, __otherCasted.hostname) &&
            Objects.equals(ip, __otherCasted.ip) &&
            Objects.equals(nodeName, __otherCasted.nodeName) &&
            Objects.equals(targetRef, __otherCasted.targetRef);
    }
}
