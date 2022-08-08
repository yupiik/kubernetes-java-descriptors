package io.yupiik.kubernetes.bindings.v1_15_9.v1;

import io.yupiik.kubernetes.bindings.v1_15_9.Validable;
import io.yupiik.kubernetes.bindings.v1_15_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ContainerPort implements Validable<ContainerPort> {
    private int containerPort;
    private String hostIP;
    private Integer hostPort;
    private String name;
    private String protocol;

    public ContainerPort() {
        // no-op
    }

    public ContainerPort(final int containerPort,
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
        if (!(__other instanceof ContainerPort)) {
            return false;
        }
        final ContainerPort __otherCasted = (ContainerPort) __other;
        return Objects.equals(containerPort, __otherCasted.containerPort) &&
            Objects.equals(hostIP, __otherCasted.hostIP) &&
            Objects.equals(hostPort, __otherCasted.hostPort) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(protocol, __otherCasted.protocol);
    }

    public ContainerPort containerPort(final int containerPort) {
        this.containerPort = containerPort;
        return this;
    }

    public ContainerPort hostIP(final String hostIP) {
        this.hostIP = hostIP;
        return this;
    }

    public ContainerPort hostPort(final Integer hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    public ContainerPort name(final String name) {
        this.name = name;
        return this;
    }

    public ContainerPort protocol(final String protocol) {
        this.protocol = protocol;
        return this;
    }

    @Override
    public ContainerPort validate() {
        return this;
    }
}
