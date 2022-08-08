package io.yupiik.kubernetes.bindings.v1_15_2.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecContainersEnv {
    private String name;
    private String value;
    private PodTemplateTemplateSpecContainersEnvValueFrom valueFrom;

    public PodTemplateTemplateSpecContainersEnv() {
        // no-op
    }

    public PodTemplateTemplateSpecContainersEnv(final String name,
                                                final String value,
                                                final PodTemplateTemplateSpecContainersEnvValueFrom valueFrom) {
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

    public PodTemplateTemplateSpecContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final PodTemplateTemplateSpecContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof PodTemplateTemplateSpecContainersEnv)) {
            return false;
        }
        final PodTemplateTemplateSpecContainersEnv __otherCasted = (PodTemplateTemplateSpecContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
