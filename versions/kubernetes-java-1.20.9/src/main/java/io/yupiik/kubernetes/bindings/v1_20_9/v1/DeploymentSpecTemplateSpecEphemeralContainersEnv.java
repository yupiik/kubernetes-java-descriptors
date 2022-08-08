package io.yupiik.kubernetes.bindings.v1_20_9.v1;

import java.util.Objects;

public class DeploymentSpecTemplateSpecEphemeralContainersEnv {
    private String name;
    private String value;
    private DeploymentSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom;

    public DeploymentSpecTemplateSpecEphemeralContainersEnv() {
        // no-op
    }

    public DeploymentSpecTemplateSpecEphemeralContainersEnv(final String name,
                                                            final String value,
                                                            final DeploymentSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
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

    public DeploymentSpecTemplateSpecEphemeralContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final DeploymentSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecEphemeralContainersEnv)) {
            return false;
        }
        final DeploymentSpecTemplateSpecEphemeralContainersEnv __otherCasted = (DeploymentSpecTemplateSpecEphemeralContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
