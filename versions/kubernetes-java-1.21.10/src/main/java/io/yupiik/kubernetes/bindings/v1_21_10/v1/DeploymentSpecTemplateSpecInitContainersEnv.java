package io.yupiik.kubernetes.bindings.v1_21_10.v1;

import java.util.Objects;

public class DeploymentSpecTemplateSpecInitContainersEnv {
    private String name;
    private String value;
    private DeploymentSpecTemplateSpecInitContainersEnvValueFrom valueFrom;

    public DeploymentSpecTemplateSpecInitContainersEnv() {
        // no-op
    }

    public DeploymentSpecTemplateSpecInitContainersEnv(final String name,
                                                       final String value,
                                                       final DeploymentSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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

    public DeploymentSpecTemplateSpecInitContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final DeploymentSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecInitContainersEnv)) {
            return false;
        }
        final DeploymentSpecTemplateSpecInitContainersEnv __otherCasted = (DeploymentSpecTemplateSpecInitContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
