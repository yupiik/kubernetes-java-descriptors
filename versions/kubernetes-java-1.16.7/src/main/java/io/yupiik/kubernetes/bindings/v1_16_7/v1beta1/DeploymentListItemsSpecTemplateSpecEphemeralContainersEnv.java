package io.yupiik.kubernetes.bindings.v1_16_7.v1beta1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecEphemeralContainersEnv {
    private String name;
    private String value;
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom;

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersEnv() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersEnv(final String name,
                                                                     final String value,
                                                                     final DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
        this.valueFrom = valueFrom;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                value,
                valueFrom);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecEphemeralContainersEnv)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecEphemeralContainersEnv __otherCasted = (DeploymentListItemsSpecTemplateSpecEphemeralContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
