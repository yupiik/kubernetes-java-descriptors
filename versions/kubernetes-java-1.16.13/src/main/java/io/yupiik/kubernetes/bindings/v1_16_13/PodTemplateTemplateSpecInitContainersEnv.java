package io.yupiik.kubernetes.bindings.v1_16_13;

import java.util.Objects;

public class PodTemplateTemplateSpecInitContainersEnv {
    private String name;
    private String value;
    private PodTemplateTemplateSpecInitContainersEnvValueFrom valueFrom;

    public PodTemplateTemplateSpecInitContainersEnv() {
        // no-op
    }

    public PodTemplateTemplateSpecInitContainersEnv(final String name,
                                                    final String value,
                                                    final PodTemplateTemplateSpecInitContainersEnvValueFrom valueFrom) {
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

    public PodTemplateTemplateSpecInitContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final PodTemplateTemplateSpecInitContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof PodTemplateTemplateSpecInitContainersEnv)) {
            return false;
        }
        final PodTemplateTemplateSpecInitContainersEnv __otherCasted = (PodTemplateTemplateSpecInitContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
