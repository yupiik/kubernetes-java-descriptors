package io.yupiik.kubernetes.bindings.v1_22_11.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef {
    private String containerName;
    private String divisor;
    private String resource;

    public DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef(final String containerName,
                                                                                        final String divisor,
                                                                                        final String resource) {
        // no-op
    }

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(final String containerName) {
        this.containerName = containerName;
    }

    public String getDivisor() {
        return divisor;
    }

    public void setDivisor(final String divisor) {
        this.divisor = divisor;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(final String resource) {
        this.resource = resource;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                containerName,
                divisor,
                resource);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef __otherCasted = (DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef) __other;
        return Objects.equals(containerName, __otherCasted.containerName) &&
            Objects.equals(divisor, __otherCasted.divisor) &&
            Objects.equals(resource, __otherCasted.resource);
    }
}
