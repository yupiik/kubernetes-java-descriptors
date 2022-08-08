package io.yupiik.kubernetes.bindings.v1_21_0.v1;

import java.util.Objects;

public class JobSpecTemplateSpecInitContainersEnv {
    private String name;
    private String value;
    private JobSpecTemplateSpecInitContainersEnvValueFrom valueFrom;

    public JobSpecTemplateSpecInitContainersEnv() {
        // no-op
    }

    public JobSpecTemplateSpecInitContainersEnv(final String name,
                                                final String value,
                                                final JobSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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

    public JobSpecTemplateSpecInitContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final JobSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof JobSpecTemplateSpecInitContainersEnv)) {
            return false;
        }
        final JobSpecTemplateSpecInitContainersEnv __otherCasted = (JobSpecTemplateSpecInitContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
