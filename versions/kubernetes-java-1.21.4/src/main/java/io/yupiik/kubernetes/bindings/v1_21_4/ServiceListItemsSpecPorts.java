package io.yupiik.kubernetes.bindings.v1_21_4;

import java.util.Objects;

public class ServiceListItemsSpecPorts {
    private String appProtocol;
    private String name;
    private Integer nodePort;
    private int port;
    private String protocol;
    private String targetPort;

    public ServiceListItemsSpecPorts() {
        // no-op
    }

    public ServiceListItemsSpecPorts(final String appProtocol,
                                     final String name,
                                     final Integer nodePort,
                                     final int port,
                                     final String protocol,
                                     final String targetPort) {
        // no-op
    }

    public String getAppProtocol() {
        return appProtocol;
    }

    public void setAppProtocol(final String appProtocol) {
        this.appProtocol = appProtocol;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getNodePort() {
        return nodePort;
    }

    public void setNodePort(final Integer nodePort) {
        this.nodePort = nodePort;
    }

    public int getPort() {
        return port;
    }

    public void setPort(final int port) {
        this.port = port;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(final String protocol) {
        this.protocol = protocol;
    }

    public String getTargetPort() {
        return targetPort;
    }

    public void setTargetPort(final String targetPort) {
        this.targetPort = targetPort;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                appProtocol,
                name,
                nodePort,
                port,
                protocol,
                targetPort);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceListItemsSpecPorts)) {
            return false;
        }
        final ServiceListItemsSpecPorts __otherCasted = (ServiceListItemsSpecPorts) __other;
        return Objects.equals(appProtocol, __otherCasted.appProtocol) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(nodePort, __otherCasted.nodePort) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(protocol, __otherCasted.protocol) &&
            Objects.equals(targetPort, __otherCasted.targetPort);
    }
}
