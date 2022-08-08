package io.yupiik.kubernetes.bindings.v1_18_3.v1;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecInitContainersEnv {
    private String name;
    private String value;
    private ReplicationControllerSpecTemplateSpecInitContainersEnvValueFrom valueFrom;

    public ReplicationControllerSpecTemplateSpecInitContainersEnv() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecInitContainersEnv(final String name,
                                                                  final String value,
                                                                  final ReplicationControllerSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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

    public ReplicationControllerSpecTemplateSpecInitContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final ReplicationControllerSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecInitContainersEnv)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecInitContainersEnv __otherCasted = (ReplicationControllerSpecTemplateSpecInitContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
