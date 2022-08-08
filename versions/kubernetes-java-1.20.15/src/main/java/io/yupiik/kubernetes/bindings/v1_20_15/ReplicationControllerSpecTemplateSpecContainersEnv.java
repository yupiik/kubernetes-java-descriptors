package io.yupiik.kubernetes.bindings.v1_20_15;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecContainersEnv {
    private String name;
    private String value;
    private ReplicationControllerSpecTemplateSpecContainersEnvValueFrom valueFrom;

    public ReplicationControllerSpecTemplateSpecContainersEnv() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecContainersEnv(final String name,
                                                              final String value,
                                                              final ReplicationControllerSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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

    public ReplicationControllerSpecTemplateSpecContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final ReplicationControllerSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecContainersEnv)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecContainersEnv __otherCasted = (ReplicationControllerSpecTemplateSpecContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
