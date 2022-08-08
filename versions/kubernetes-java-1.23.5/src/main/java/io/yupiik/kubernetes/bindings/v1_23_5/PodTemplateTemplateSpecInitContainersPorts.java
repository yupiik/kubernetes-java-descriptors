package io.yupiik.kubernetes.bindings.v1_23_5;

import java.util.Objects;

public class PodTemplateTemplateSpecInitContainersPorts {
    private int containerPort;
    private String hostIP;
    private Integer hostPort;
    private String name;
    private PodTemplateTemplateSpecInitContainersPortsProtocol protocol;

    public PodTemplateTemplateSpecInitContainersPorts() {
        // no-op
    }

    public PodTemplateTemplateSpecInitContainersPorts(final int containerPort,
                                                      final String hostIP,
                                                      final Integer hostPort,
                                                      final String name,
                                                      final PodTemplateTemplateSpecInitContainersPortsProtocol protocol) {
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

    public PodTemplateTemplateSpecInitContainersPortsProtocol getProtocol() {
        return protocol;
    }

    public void setProtocol(final PodTemplateTemplateSpecInitContainersPortsProtocol protocol) {
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
        if (!(__other instanceof PodTemplateTemplateSpecInitContainersPorts)) {
            return false;
        }
        final PodTemplateTemplateSpecInitContainersPorts __otherCasted = (PodTemplateTemplateSpecInitContainersPorts) __other;
        return Objects.equals(containerPort, __otherCasted.containerPort) &&
            Objects.equals(hostIP, __otherCasted.hostIP) &&
            Objects.equals(hostPort, __otherCasted.hostPort) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(protocol, __otherCasted.protocol);
    }
}
