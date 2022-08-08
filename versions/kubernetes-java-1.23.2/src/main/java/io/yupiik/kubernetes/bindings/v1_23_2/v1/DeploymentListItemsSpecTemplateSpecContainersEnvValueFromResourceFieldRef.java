package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef {
    private String containerName;
    private String divisor;
    private String resource;

    public DeploymentListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef(final String containerName,
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef __otherCasted = (DeploymentListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef) __other;
        return Objects.equals(containerName, __otherCasted.containerName) &&
            Objects.equals(divisor, __otherCasted.divisor) &&
            Objects.equals(resource, __otherCasted.resource);
    }
}
