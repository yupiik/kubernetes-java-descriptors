package io.yupiik.kubernetes.bindings.v1_16_13.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecInitContainersEnv {
    private String name;
    private String value;
    private DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFrom valueFrom;

    public DeploymentListItemsSpecTemplateSpecInitContainersEnv() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersEnv(final String name,
                                                                final String value,
                                                                final DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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

    public DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecInitContainersEnv)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecInitContainersEnv __otherCasted = (DeploymentListItemsSpecTemplateSpecInitContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
