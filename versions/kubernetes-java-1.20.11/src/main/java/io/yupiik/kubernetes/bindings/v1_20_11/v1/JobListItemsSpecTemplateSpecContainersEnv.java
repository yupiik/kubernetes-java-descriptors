package io.yupiik.kubernetes.bindings.v1_20_11.v1;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecContainersEnv {
    private String name;
    private String value;
    private JobListItemsSpecTemplateSpecContainersEnvValueFrom valueFrom;

    public JobListItemsSpecTemplateSpecContainersEnv() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecContainersEnv(final String name,
                                                     final String value,
                                                     final JobListItemsSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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

    public JobListItemsSpecTemplateSpecContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final JobListItemsSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecContainersEnv)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecContainersEnv __otherCasted = (JobListItemsSpecTemplateSpecContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
