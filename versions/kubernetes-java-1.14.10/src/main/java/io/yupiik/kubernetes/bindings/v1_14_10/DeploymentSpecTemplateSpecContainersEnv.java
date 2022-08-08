package io.yupiik.kubernetes.bindings.v1_14_10;

import java.util.Objects;

public class DeploymentSpecTemplateSpecContainersEnv {
    private String name;
    private String value;
    private DeploymentSpecTemplateSpecContainersEnvValueFrom valueFrom;

    public DeploymentSpecTemplateSpecContainersEnv() {
        // no-op
    }

    public DeploymentSpecTemplateSpecContainersEnv(final String name,
                                                   final String value,
                                                   final DeploymentSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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

    public DeploymentSpecTemplateSpecContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final DeploymentSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecContainersEnv)) {
            return false;
        }
        final DeploymentSpecTemplateSpecContainersEnv __otherCasted = (DeploymentSpecTemplateSpecContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
