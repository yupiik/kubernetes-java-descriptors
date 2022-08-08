package io.yupiik.kubernetes.bindings.v1_17_16;

import java.util.Objects;

public class JobSpecTemplateSpecContainersEnv {
    private String name;
    private String value;
    private JobSpecTemplateSpecContainersEnvValueFrom valueFrom;

    public JobSpecTemplateSpecContainersEnv() {
        // no-op
    }

    public JobSpecTemplateSpecContainersEnv(final String name,
                                            final String value,
                                            final JobSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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

    public JobSpecTemplateSpecContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final JobSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof JobSpecTemplateSpecContainersEnv)) {
            return false;
        }
        final JobSpecTemplateSpecContainersEnv __otherCasted = (JobSpecTemplateSpecContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
