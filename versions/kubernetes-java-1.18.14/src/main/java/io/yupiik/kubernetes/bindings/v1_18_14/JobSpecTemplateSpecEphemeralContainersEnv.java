package io.yupiik.kubernetes.bindings.v1_18_14;

import java.util.Objects;

public class JobSpecTemplateSpecEphemeralContainersEnv {
    private String name;
    private String value;
    private JobSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom;

    public JobSpecTemplateSpecEphemeralContainersEnv() {
        // no-op
    }

    public JobSpecTemplateSpecEphemeralContainersEnv(final String name,
                                                     final String value,
                                                     final JobSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
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

    public JobSpecTemplateSpecEphemeralContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final JobSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof JobSpecTemplateSpecEphemeralContainersEnv)) {
            return false;
        }
        final JobSpecTemplateSpecEphemeralContainersEnv __otherCasted = (JobSpecTemplateSpecEphemeralContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
