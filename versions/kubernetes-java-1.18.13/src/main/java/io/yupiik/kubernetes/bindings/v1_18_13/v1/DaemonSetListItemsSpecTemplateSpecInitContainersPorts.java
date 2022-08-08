package io.yupiik.kubernetes.bindings.v1_18_13.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecInitContainersPorts {
    private int containerPort;
    private String hostIP;
    private Integer hostPort;
    private String name;
    private String protocol;

    public DaemonSetListItemsSpecTemplateSpecInitContainersPorts() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersPorts(final int containerPort,
                                                                 final String hostIP,
                                                                 final Integer hostPort,
                                                                 final String name,
                                                                 final String protocol) {
        // no-op
    }

    public int getContainerPort() {
        return containerPort;
    }

    public void setContainerPort(final int containerPort) {
        this.containerPort = containerPort;
    }

    public String getHostIP() {
        return hostIP;
    }

    public void setHostIP(final String hostIP) {
        this.hostIP = hostIP;
    }

    public Integer getHostPort() {
        return hostPort;
    }

    public void setHostPort(final Integer hostPort) {
        this.hostPort = hostPort;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(final String protocol) {
        this.protocol = protocol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                containerPort,
                hostIP,
                hostPort,
                name,
                protocol);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecInitContainersPorts)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecInitContainersPorts __otherCasted = (DaemonSetListItemsSpecTemplateSpecInitContainersPorts) __other;
        return Objects.equals(containerPort, __otherCasted.containerPort) &&
            Objects.equals(hostIP, __otherCasted.hostIP) &&
            Objects.equals(hostPort, __otherCasted.hostPort) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(protocol, __otherCasted.protocol);
    }
}
