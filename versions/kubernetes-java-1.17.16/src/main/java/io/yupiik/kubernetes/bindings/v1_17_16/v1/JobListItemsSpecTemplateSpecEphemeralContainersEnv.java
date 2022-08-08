package io.yupiik.kubernetes.bindings.v1_17_16.v1;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecEphemeralContainersEnv {
    private String name;
    private String value;
    private JobListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom;

    public JobListItemsSpecTemplateSpecEphemeralContainersEnv() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecEphemeralContainersEnv(final String name,
                                                              final String value,
                                                              final JobListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
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

    public JobListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final JobListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecEphemeralContainersEnv)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecEphemeralContainersEnv __otherCasted = (JobListItemsSpecTemplateSpecEphemeralContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
