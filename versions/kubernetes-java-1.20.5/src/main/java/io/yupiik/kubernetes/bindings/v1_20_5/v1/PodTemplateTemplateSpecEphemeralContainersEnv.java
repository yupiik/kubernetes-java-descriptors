package io.yupiik.kubernetes.bindings.v1_20_5.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecEphemeralContainersEnv {
    private String name;
    private String value;
    private PodTemplateTemplateSpecEphemeralContainersEnvValueFrom valueFrom;

    public PodTemplateTemplateSpecEphemeralContainersEnv() {
        // no-op
    }

    public PodTemplateTemplateSpecEphemeralContainersEnv(final String name,
                                                         final String value,
                                                         final PodTemplateTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
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

    public PodTemplateTemplateSpecEphemeralContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final PodTemplateTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof PodTemplateTemplateSpecEphemeralContainersEnv)) {
            return false;
        }
        final PodTemplateTemplateSpecEphemeralContainersEnv __otherCasted = (PodTemplateTemplateSpecEphemeralContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
