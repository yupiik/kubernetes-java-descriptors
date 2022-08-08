package io.yupiik.kubernetes.bindings.v1_15_8.v1beta1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecContainersEnv {
    private String name;
    private String value;
    private DeploymentListItemsSpecTemplateSpecContainersEnvValueFrom valueFrom;

    public DeploymentListItemsSpecTemplateSpecContainersEnv() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecContainersEnv(final String name,
                                                            final String value,
                                                            final DeploymentListItemsSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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

    public DeploymentListItemsSpecTemplateSpecContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final DeploymentListItemsSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecContainersEnv)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecContainersEnv __otherCasted = (DeploymentListItemsSpecTemplateSpecContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
