package io.yupiik.kubernetes.bindings.v1_18_16;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecEphemeralContainersEnv {
    private String name;
    private String value;
    private ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom;

    public ReplicaSetSpecTemplateSpecEphemeralContainersEnv() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersEnv(final String name,
                                                            final String value,
                                                            final ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
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

    public ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecEphemeralContainersEnv)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecEphemeralContainersEnv __otherCasted = (ReplicaSetSpecTemplateSpecEphemeralContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
